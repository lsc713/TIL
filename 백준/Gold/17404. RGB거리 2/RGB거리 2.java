import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n][3];
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 3; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        int result = Integer.MAX_VALUE;

        for (int a = 0; a < 3; a++) {
            int[][] dp = new int[n][3];
            
            for (int i = 0; i < 3; i++) {
                if (i == a) {
                    dp[0][i] = arr[0][i];
                } else {
                    dp[0][i] = 1001;  
                }
            }

            for (int i = 1; i < n; i++) {
                dp[i][0] = arr[i][0] + Math.min(dp[i - 1][1], dp[i - 1][2]);
                dp[i][1] = arr[i][1] + Math.min(dp[i - 1][0], dp[i - 1][2]);
                dp[i][2] = arr[i][2] + Math.min(dp[i - 1][0], dp[i - 1][1]);
            }

            for (int z = 0; z < 3; z++) {
                if (z != a) {
                    result = Math.min(result, dp[n - 1][z]);
                }
            }
        }

        System.out.println(result);
    }
}
