import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] exp = new int[n+1];
        int[] time = new int[n+1];
        int timeMax = 0;
        for (int i = 1; i <= n; i++) {
            exp[i] = sc.nextInt();
            time[i] = sc.nextInt();

            timeMax +=time[i];
        }
        int ans =-1;
        /*
        time min -> value time , j => exp
        int[][] dp = new int[n+1][expMax+1];
        1~i까지 골랐을때 경험치가 얼마일때 총시간이 얼마인가.
        (중복 진행 불가)
        그럼 그 퀘스트를 수행하느냐 마느냐.
        dp[i]= Math.min(dp[i-1][j],dp[i-1][j-exp[i]+time[i]]);
        int ans Integer.MAX_VALUE;
        for(int i = 1 ; i < expMax+1;i++){
        if(i>=M){
        ans=Math.min(ans,dp[n][i]);
        }
              
        }
        System.out.println(ans);

        
        */
        int[][] dp = new int[n+1][timeMax+1];
        for(int[] row : dp) Arrays.fill(row,-1);
        dp[0][0]=0;
        for(int i = 1; i<=n;i++){
            for(int j=0; j<=timeMax;j++){
                dp[i][j]=dp[i-1][j];
                if(j>=time[i]&&dp[i-1][j-time[i]] != -1){
                    dp[i][j]= Math.max(dp[i][j],dp[i-1][j-time[i]]+exp[i]);
                }
            }
        }
        
        for(int i = 0 ; i < timeMax+1;i++){
            if(dp[n][i]>=m){
                ans=i;
                break;
            }
        }
        System.out.println(ans);
    }
}