import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] data = new int[n+1][3];
        for(int i = 1 ; i <=n;i++){
            data[i][0]= sc.nextInt();
            data[i][1]= sc.nextInt();
            data[i][2]= sc.nextInt();
        }

        int[][][] dp = new int[n+1][3][3];
        for(int i=0;i<=2;i++){
            dp[1][i][i]=data[1][i];
        }
        /*1~n j번째 방을 봤을때 얻을 수 있는 최대 값*/
        for(int i = 2;i<=n;i++){
            for(int j=0;j<=2;j++){
                for(int s=0;s<=2;s++){
                    int best =0;
                    for(int k=0;k<=2;k++){
                        if(j==k)continue;
                        best=Math.max(best,dp[i-1][k][s]);
                    }
                    dp[i][j][s]=best+data[i][j];
                }
                
            }
        }
        int ans =0;
        for(int i=0;i<=2;i++){
            for(int j = 0 ; j <=2;j++){
                if(i==j)continue;
                ans=Math.max(ans,dp[n][i][j]);
            }
        }

        System.out.println(ans);
        // Please write your code here.
    }
}