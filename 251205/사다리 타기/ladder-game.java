import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         n = sc.nextInt();
         m = sc.nextInt();
         bars = new int[m][2];
        for(int i = 0; i < m; i++){
            bars[i][0] = sc.nextInt()-1;
            bars[i][1] = sc.nextInt();
        }
        Arrays.sort(bars,Comparator.comparingInt(x->x[1]));
        ans=Integer.MAX_VALUE;
        // Please write your code here.
        arr = new int[n];
        for(int i = 0;i<n;i++){
            arr[i]=i+1;
        }
        
        target = apply(arr);
        recur(0,arr,0);
        System.out.println(ans);
    }
    static int[] apply(int[] perm){
        int[] p = perm.clone();
        
        for(int i = 0 ;i<m;i++){
            int a = bars[i][0];
            if(a>=0&&a+1<n){
                int temp = p[a];
                p[a]=p[a+1];
                p[a+1]=temp;
            }
        }
        return p;
    }
    static void recur(int idx,int[] arr,int used){
        if(Arrays.equals(arr,target)){
            ans=Math.min(used,ans);
        }
        if(idx==m)return;
        recur(idx+1,arr,used);
        int a = bars[idx][0];
        if(a>=0&&a+1<n){
            int[] nxt = arr.clone();
            int temp = nxt[a];
            nxt[a]=nxt[a+1];
            nxt[a+1]=temp;
            recur(idx+1,nxt,used+1);
        }
    }
    static int[][] bars;
    static int n,m,ans;
    static int[] arr,target;
    static void recur(int idx){
        if(idx==n){
            
        }
    }
}