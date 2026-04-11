import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int ans =0;
        int[][] dp = new int[n][n];
        for(int i = 0 ; i < n ; i ++){
            dp[i][0]=1;
            dp[i][1]=1;
            for(int j = 0 ; j < n ; j++){
                if(arr[i]>arr[j]){
                    dp[i][0] = Math.max(dp[i][0],dp[j][0]+1);
                }
                if(arr[i]<arr[j]){
                    dp[i][1] = Math.max(dp[i][1],dp[j][1]+1);
                }
            }
            dp[i][1] = Math.max(dp[i][1],dp[i][0]);
            ans=Math.max(ans,dp[i][1]);
        }
        System.out.println(ans);
        // Please write your code here.
    }
}