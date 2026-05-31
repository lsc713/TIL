import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[][] data = new int[N+1][3];
        for (int i = 1; i <= N; i++) {
            data[i][0] = sc.nextInt();
            data[i][1] = sc.nextInt();
            data[i][2] = sc.nextInt();
        }
        /*
        1~i까지 봤을때, 
        이전에 어떤 방을 들어갔을떄, 
        현재 갈 수 있는 최대 보물
        */
        int[][] dp = new int[N+1][3];
        for(int i =0;i<=2;i++){
            dp[1][i]=data[1][i];
        }
        for(int i=2;i<=N;i++){
            for(int j=0;j<=2;j++){
                int best =0;
                for(int k = 0;k<=2;k++){
                    if(j==k)continue;
                    best=Math.max(best,dp[i-1][k]);
                }
                dp[i][j]=best+data[i][j];
            }
        }

        int ans =0;
        for(int i =0;i<3;i++){
            ans=Math.max(dp[N][i],ans);
        }
        System.out.println(ans);
        // Please write your code here.
    }
}