import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n+2];
        int[] b = new int[n+2];
        for (int i = 1; i <= n; i++) {
            a[i] = sc.nextInt();
        }
        for (int i = 1; i <= n; i++) {
            b[i] = sc.nextInt();
        }
        /*
        Dㅣ건 좀 어렵구만..
        int[] dp = new int[n];
        1~n까지 선택했을때 얻을 수 있는 최대 점수
        근데 뭘 낼지는 몰라.
        2 5 6
        1 6 7
        적으면 버리고 점수먹고, 같으면 버리기만.
        또는 버리기만.
        -> 적으면 버리고 같은데 더 작은거 없으면 버리기 + 더 큰거는 버리기

        상대 카드에 따라 가변이라 어떻게 풀어야하지
        같은카드가 나올 수 도 있는건가 예제는 그런거없는데 카드니까 같은 카드 안나



        */
        // Please write your code here.
        int[][] dp = new int[n+1][n+1];
        for(int[] row : dp) Arrays.fill(row,-1);
        dp[0][0]=0;

        for(int i = 0;i<=n;i++){
            for(int j = 0 ; j <=n;j++){
                if(i==0&&j==0)continue;
                int best =-1;
                if(i>=1&&j>=1&&dp[i-1][j-1]!=-1){
                    best=Math.max(best,dp[i-1][j-1]);
                }
                if(i>=1&&j+1<=n&&a[i]<b[j+1]&&dp[i-1][j]!=-1){
                    best=Math.max(best,dp[i-1][j]);
                }
                if(j>=1&&i+1<=n&&a[i+1]>b[j]&&dp[i][j-1]!=-1){
                    best=Math.max(best,dp[i][j-1]+b[j]);
                }
                dp[i][j]=best;
            }
        }
        int ans=0;
        for(int i = 0;i<=n;i++){
            ans=Math.max(ans,dp[i][n]);
            ans=Math.max(ans,dp[n][i]);
        }
        System.out.println(ans);
    }
}