import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] map = new int[n][n];
        for(int i = 0 ; i<n;i++){
            for(int j =0 ;  j<n;j++){
                map[i][j]=sc.nextInt();
            }
        }
        int result = 0;
        int[][] dp = new int[n][n];
        for(int i=0;i<n;i++){
            Arrays.fill(dp[i],Integer.MAX_VALUE);
        }
        dp[0][0]=map[0][0];
        for(int i = 1;i<n;i++){
            dp[i][0]=Math.min(dp[i-1][0],map[i][0]);
            dp[0][i]=Math.min(dp[0][i-1],map[0][i]);
        }
        for(int i = 1;i<n;i++){
            for(int j =1;j<n;j++){
                dp[i][j]=Math.min(Math.max(dp[i-1][j],dp[i][j-1]),map[i][j]);
            }
        }

        System.out.println(dp[n-1][n-1]);
    }
}