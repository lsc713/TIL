import java.util.*;

class Main{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        int[] dp = new int[10001];
        dp[0]=1;
        for (int i = 0; i < n; i++) {
            for(int j = arr[i]; j<=k;j++){
                dp[j] +=dp[j-arr[i]];
            }
        }
        System.out.println(dp[k]);
    }
}