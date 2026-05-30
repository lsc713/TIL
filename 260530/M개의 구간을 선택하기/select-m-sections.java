import java.util.*;

public class Main {
    public static int SENTINEL = -5000001;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr = new int[n+1];
        for (int i = 1; i <= n; i++) {
            arr[i] = sc.nextInt();
        }
        int[][][] dp = new int[n+1][m+1][2];
        for(int[][] values : dp){
            for(int[] row : values){
                Arrays.fill(row,SENTINEL);
            }
        }
        dp[0][0][0]=0;
        for(int i = 1;i<=n;i++){
            for(int j =0;j<=m;j++){
                int best = SENTINEL;
                if(dp[i-1][j][0] != SENTINEL){
                    best = Math.max(best,dp[i-1][j][0]); //구간미선택,구간 밖
                }
                if(dp[i-1][j][1] != SENTINEL){
                    best = Math.max(best,dp[i-1][j][1]); //이전 구간있지만, 미선택(구간종료)
                }
                dp[i][j][0]= best;
                best=SENTINEL;
                //구간 선택, 구간안 - 이전건은 구간안에있는거여야함.
                if(j>=1 && dp[i-1][j-1][0] != SENTINEL){
                    best = Math.max(best, dp[i-1][j-1][0] +arr[i]);
                }
                if(dp[i-1][j][1] != SENTINEL){
                    best = Math.max(best,dp[i-1][j][1] + arr[i]); //구간선택안하지만,구간안 - 독자적 구간만들기
                }
                dp[i][j][1]= best;
            }
        }
        System.out.println(Math.max(dp[n][m][0],dp[n][m][1]));
        // Please write your code here.
    }
}