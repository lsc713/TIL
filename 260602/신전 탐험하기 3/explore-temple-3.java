import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        int m = sc.nextInt();
        int[][] data = new int[n+1][m];
        for(int i = 1;i<=n;i++){
            for(int j = 0 ; j < m;j++){
                data[i][j]=sc.nextInt();
            }
        }
        int[][] dp = new int[n+1][m+1];
        for(int[] row:dp){
            Arrays.fill(row,-1);
        }
        for(int i = 0 ; i < m;i++){
            dp[1][i]=data[1][i];
        }
        for(int i=2;i<=n;i++){
            for(int j = 0 ; j < m ; j++){
                int best =-1;
                for(int k=0;k<m;k++){
                    if(dp[i-1][k]!=-1){
                        if(j==k)continue;
                        best=Math.max(best,dp[i-1][k]);
                    }
                }
                dp[i][j]=best+data[i][j];
            }
        }
        

        int ans =0;
        for(int i = 0 ; i < m ; i++){
            ans=Math.max(ans,dp[n][i]);
        }
        System.out.println(ans);
    }
}