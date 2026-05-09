import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] weight = new int[n+1];
        int[] value = new int[n+1];
        for (int i = 1; i < n+1; i++) {
            weight[i] = sc.nextInt();
            value[i] = sc.nextInt();
        }
        int[][] dp =new int[n+1][m+1];
        for(int i=1;i<=n;i++){
            for(int j = 0 ; j <= m;j++){
                dp[i][j]=dp[i-1][j];
                if(j>=weight[i]){
                    dp[i][j] = Math.max(dp[i][j],dp[i][j-weight[i]]+value[i]);
                }
            }
        }
        System.out.println(dp[n][m]);
        // Please write your code here.
    }
}