import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static long[] arr,tree;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        arr = new long[n+1];
        for (int i = 1; i <= n; i++) {
            arr[i] = Long.parseLong(br.readLine());
        }
        tree = new long[n*4];
        init(1,n,1);
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < m+k; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            long c = Long.parseLong(st.nextToken());
            if(a==1){
                long dif = c-arr[b];
                arr[b]= c;
                update(1,n,1,b,dif);
            }else{
                sb.append(sum(1,n,1,b,(int)c)+"\n");
            }
        }
        System.out.println(sb);
    }
    static long init(int start,int end, int node){
        if(start==end){
            return tree[node]=arr[start];
        }
        int mid = (start+end)/2;
        return tree[node]=init(start,mid,node*2)+init(mid+1,end,node*2+1);
    }
    static void update(int start,int end,int node,int idx,long dif){
        if (idx < start || idx > end) {
            return;
        }
        tree[node]+=dif;
        if(start==end){
            return;
        }
        int mid = (start+end)/2;
        update(start,mid,node*2,idx,dif);
        update(mid+1,end,node*2+1,idx,dif);
    }
    static long sum(int start,int end,int node,int left, int right){
        if (left > end || right < start) {
            return 0;
        }
        if(left<=start&&end<=right){
            return tree[node];
        }
        int mid = (start+end)/2;
        return sum(start,mid,node*2,left,right) + sum(mid+1,end,node*2+1,left,right);
    }
}
