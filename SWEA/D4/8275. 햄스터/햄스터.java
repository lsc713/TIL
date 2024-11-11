import java.io.*;
import java.util.StringTokenizer;

public class Solution {
    static int N,X,M,l,r,s,answer;
    static int[] arr,maxArr;
    static Node[] infos;
    static boolean flag;
    static int maxSum;
    static class Node{
        int l,r, s;
        public Node(int l, int r, int s) {
            this.l = l;
            this.r = r;
            this.s = s;
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        for (int t = 1; t <= T; t++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
             N = Integer.parseInt(st.nextToken());
             X = Integer.parseInt(st.nextToken());
             M = Integer.parseInt(st.nextToken());
            arr = new int[N+1];
            infos = new Node[M];
            flag=false;
            maxArr = null;
            for (int i = 0; i < M; i++) {
                st = new StringTokenizer(br.readLine());
                 l = Integer.parseInt(st.nextToken());//우리
                 r = Integer.parseInt(st.nextToken());//r번 우리까지
                 s = Integer.parseInt(st.nextToken());//s마리
                infos[i] = new Node(l, r, s);
            }
            dfs(1);
            StringBuilder sb=new StringBuilder();
            sb.append("#" + t + " ");
            if (!flag) {
                sb.append(-1);
            }else{
                for (int i = 1; i <= N; i++) {
                    sb.append(maxArr[i]);
                    if (i < N) {
                        sb.append(" ");
                    }
                }
            }
            System.out.println(sb);
        }
    }
    static void dfs(int depth) {
        if (depth > N) {
            if (check()){
                flag=true;
                if (isBetter()) {
                    if (maxArr == null) {
                        maxArr = new int[N+1];
                    }
                    System.arraycopy(arr,0,maxArr,0,N+1);
                }
            }
            return;
        }
        for (int i = X; i >=0; i--) {
            arr[depth]=i;
            dfs(depth+1);
        }
    }

    static boolean check(){
        for (Node info : infos) {
            int sum=0;
            for (int i=info.l; i<=info.r; i++) {
                sum += arr[i];
            }
            if(sum != info.s) return false;
        }
        return true;
    }
    static boolean isBetter(){
        if (maxArr == null) {
            return true;
        }
        int currentSum=0,bestSum=0;
        for (int i = 1; i <= N; i++) {
            currentSum+=arr[i];
            bestSum+=maxArr[i];
        }
        if (currentSum > bestSum) {
            return true;
        }
        if (currentSum < bestSum) {
            return false;
        }
        for (int i = 1; i <= N; i++) {
            if(arr[i] != maxArr[i]) {
                return arr[i]<maxArr[i];
            }
        }
        return false;
    }
}