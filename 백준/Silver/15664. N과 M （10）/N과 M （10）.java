import java.util.*;
class Main{
    static int n;
    static int m;
    static boolean[] visited;
    static int[] arr;
    static int[] ans;
    static StringBuilder sb = new StringBuilder();
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        visited = new boolean[n];
        arr = new int[n];
        ans = new int[m];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        Arrays.sort(arr);
        recur(0,0);
        System.out.println(sb);
    }
    static void recur(int depth, int at){
        if(depth == m){
            for(int i=0;i<m;i++){
                sb.append(ans[i]+" ");
            }
            sb.append('\n');
            return;
        }
        int num=0;
        for(int i=at;i<n;i++){
            if(num != arr[i] && !visited[i]){
                num=arr[i];
                visited[i]=true;
                ans[depth]=arr[i];
                recur(depth+1,i);
                visited[i]=false;
            }

        }
    }
}