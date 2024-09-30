import java.util.*;

class Main{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] dp = new int[10001];
        Arrays.fill(dp, 100001);
        int[] arr = new int[n+1];
        for (int i = 1; i <= n; i++) {
            arr[i] = sc.nextInt();
        }
        dp[0]=0;
        for (int i = 1; i <= n; i++) {
            for (int j = arr[i]; j <= k;j++){
                dp[j] =Math.min(dp[j-arr[i]]+1, dp[j]);
//                System.out.println(dp[j]);
            }
        }
        System.out.println(dp[k]==100001 ? -1 : dp[k]);
    }
}