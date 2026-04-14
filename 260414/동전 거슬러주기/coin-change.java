import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] coin = new int[n];
        int[] dp = new int[n];
        Arrays.fill(dp,Integer.MAX_VALUE);
        for (int i = 0; i < n; i++)
            coin[i] = sc.nextInt();
        dp[0]=0;
        for(int i = 1; i<n;i++){
            for(int j = 0;j<n;j++){
                if(i>=coin[j]){
                    dp[i]=Math.min(dp[i],dp[i-coin[j]]+1);
                }
            }
        }
        // Please write your code here.
        System.out.println(dp[n-1]);
    }
}