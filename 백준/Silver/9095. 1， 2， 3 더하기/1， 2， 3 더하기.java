import java.util.*;

class Main{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        for (int j = 0; j < T; j++) {
            int n = scanner.nextInt();
            int[] dp = new int[11];
            dp[1]=1;
            dp[2]=2;
            dp[3]=4;
            for (int i = 4; i <= n; i++) {
                dp[i]=dp[i-1]+dp[i-2]+dp[i-3];
            }
            System.out.println(dp[n]);
        }

    }
}