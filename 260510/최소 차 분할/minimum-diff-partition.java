import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n+1];
        int s = 0;
        for (int i = 1; i <= n; i++) {
            arr[i] = sc.nextInt();
            s+=arr[i];
        }
        boolean[][] dp = new boolean[n+1][s+1];
        dp[0][0]=true;
        for(int i = 1 ; i <=n;i++){
            for(int j = 0 ; j <=s;j++){
                if(j>=arr[i]){
                    dp[i][j]=dp[i-1][j-arr[i]]||dp[i-1][j];
                }else{
                    dp[i][j]=dp[i-1][j];
                }
                
            }
        }

        int ans = Integer.MAX_VALUE;
        for(int j =0;j<=s;j++){
            if(dp[n][j]){
                ans = Math.min(ans,Math.abs(2*j-s));
            }
        }
        System.out.println(ans);

        
        // Please write your code here.
    }
}