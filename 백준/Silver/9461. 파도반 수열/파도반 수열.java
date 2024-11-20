import java.util.*;
class Main{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        long[] dp = new long[101];
        dp[1] = 1;
        dp[2] = 1;
        dp[3] = 1;
        for (int i = 4; i <= 100; i++) {
            dp[i] = dp[i-2] + dp[i-3];
        }
        for (int t =1; t <= T; t++) {
            int n = scanner.nextInt();

            System.out.println(dp[n]);
        }
    }
}