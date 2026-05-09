import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] w = new int[n];
        int[] v = new int[n];
        int[] dp = new int[m+1];
        
        for (int i = 0; i < n; i++) {
            w[i] = sc.nextInt();
            v[i] = sc.nextInt();
        }
        for(int i=0;i<n;i++){
            for(int j = m;j>=w[i];j--){
                dp[j]=Math.max(dp[j],dp[j-w[i]]+v[i]);
            }
        }

        System.out.println(dp[m]);
    }
}