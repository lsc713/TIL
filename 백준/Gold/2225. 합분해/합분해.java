import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int[][] dp = new int[201][201];
        for (int i = 0; i < n+1; i++) {
            dp[i][1]=1;
        }
        for (int i = 1; i<k+1; i++) {
            dp[0][i] = 1;
        }
        for (int i = 1; i<n+1; i++) {
            for (int j = 2; j<k+1; j++) {
                dp[i][j] = (dp[i-1][j] + dp[i][j-1])%1000000000;
            }
        }
        System.out.println(dp[n][k]%1000000000);
    }
}