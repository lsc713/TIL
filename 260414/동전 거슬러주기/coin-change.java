import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] coin = new int[n];
        int[] dp = new int[m+1];
        Arrays.fill(dp,10001);
        for (int i = 0; i < n; i++)
            coin[i] = sc.nextInt();
        dp[0]=0;
        for(int i = 0; i<n;i++){
            for(int j = coin[i];j<=m;j++){
                dp[j] = Math.min(dp[j],dp[j-coin[i]]+1);
            }
        }
        // Please write your code here.
        if(dp[m]==10001) System.out.println(-1);
        else System.out.println(dp[m]);
    }
}