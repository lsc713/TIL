import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] soccer = new int[N+1];
        int[] baseball = new int[N+1];
        for (int i = 1; i <= N; i++) {
            soccer[i] = sc.nextInt();
            baseball[i] = sc.nextInt();
        }
        int[][][] dp = new int[N+1][12][10];
        for(int[][] matrix : dp){
            for(int[] rows : matrix){
                Arrays.fill(rows,-1);
            }
        }
        dp[0][0][0]=0;
        for(int i =1;i<=N;i++){
            for(int j = 0 ; j<=11;j++){
                for(int k=0;k<10;k++){
                    int best =-1;
                    if(dp[i-1][j][k]!=-1){
                        best =Math.max(best,dp[i-1][j][k]);
                    }
                    if(j>=1&& dp[i-1][j-1][k] != -1){
                        best=Math.max(best,dp[i-1][j-1][k]+soccer[i]);
                    }
                    if(k>=1&& dp[i-1][j][k-1] != -1){
                        best=Math.max(best,dp[i-1][j][k-1]+baseball[i]);
                    }
                    dp[i][j][k]=best;
                }
            }
        }
        System.out.println(dp[N][11][9]);
        // Please write your code here.
    }
}