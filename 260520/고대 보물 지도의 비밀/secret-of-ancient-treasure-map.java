import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n =Integer.parseInt(st.nextToken());
        int k =Integer.parseInt(st.nextToken());
        int[] arr = new int[n+1];
        st = new StringTokenizer(br.readLine());
        for(int i = 1 ; i <= n;i++){
            arr[i]=Integer.parseInt(st.nextToken());
        }
        int[][] dp = new int[n+1][k+1];
        for(int[] row:dp) Arrays.fill(row,-100001);
        dp[0][0]=0;
        for(int i = 1 ; i <= n ; i ++){
            for(int j = 0 ; j<=k;j++){
                int best = -100001;
                if(arr[i]<0&&i>=1 &&j>=1){
                    if(dp[i-1][j-1]!=-100001)best = Math.max(best,dp[i-1][j-1]+arr[i]);    
                    if(j==1) best = Math.max(best,arr[i]);
                }
                if(arr[i]>=0&&i>=1){
                    if(dp[i-1][j]!=-100001)best = Math.max(best,dp[i-1][j]+arr[i]);
                    if(j==0)best=Math.max(best,arr[i]);
                }
                dp[i][j]=best;
            }
        }
        int ans = -100001;
        for(int i = 1 ; i <= n ; i ++){
            for(int j=0;j<=k;j++){
                ans = Math.max(ans,dp[i][j]);
            }
        }
        System.out.println(ans);

        // Please write your code here.
    }
}