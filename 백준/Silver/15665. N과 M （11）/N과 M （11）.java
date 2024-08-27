import java.util.*;
class Main{
    static int n;
    static int m;
    static int[] arr;
    static int[] ans;
    static boolean[] visited;
    static StringBuilder sb = new StringBuilder();
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        ans = new int[m];
        arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        recur(0);
        System.out.println(sb);
    }
    static void recur(int depth){
        if(depth ==m){
            for(int i = 0 ;i<m;i++){
                sb.append(ans[i]+" ");
            }
            sb.append('\n');
            return;
        }
        int num=0;
        for(int i=0;i<n;i++){
            if(num!=arr[i]){
                num=arr[i];
                ans[depth] = arr[i];
                recur(depth+1);
            }
        }
    }
}