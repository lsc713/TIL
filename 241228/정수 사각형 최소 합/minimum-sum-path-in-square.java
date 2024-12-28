import java.util.*;
public class Main {
    static int[] dx = {0,1};
    static int[] dy = {-1,0};
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        int[][] map = new int[n][n];
        for(int i = 0 ; i <n;i++){
            for(int j = 0 ; j <n;j++){
                map[i][j]=sc.nextInt();
            }
        }
        int[][] dp = new int[n][n];
        for(int i= 0;i<n;i++){
            Arrays.fill(dp[i],Integer.MAX_VALUE);
        }
        dp[0][n-1]=map[0][n-1];
        for(int j=n-2;j>=0;j--){
            dp[0][j] = dp[0][j+1]+map[0][j];
        }
        for(int i = 1 ; i <n;i++){
            dp[i][n-1]=dp[i-1][n-1]+map[i][n-1];
        }
        for(int i =1;i<n;i++){
            for(int j=n-2;j>=0;j--){
                dp[i][j]= Math.min(dp[i-1][j],dp[i][j+1])+map[i][j];
            }
        }
        System.out.println(dp[n-1][0]);
    }
}