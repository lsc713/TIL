import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        
        char[] arr = sc.next().toCharArray();
        
        //0~n-1
        int[][][] dp = new int[n+1][k+1][2];
        for(int[][] values : dp){
            for(int[] row : values){
                Arrays.fill(row,-1);
            }
        }
        dp[0][0][0]=0;

        //1~i, k번 기회를 썼을 때 L에 있을떄, R에 있을 때 최대 수정개수
        //각 샘터에 가는 경우 계산해되, 기회를차감? 
        //아니, 어디에있을때 거기에있는경우, 기회를 없애서 다른곳가는 경우

        for(int i = 1;i<=n;i++){
            for(int j=0;j<=k;j++){
                for(int s=0;s<2;s++){
                    int best =-1;
                    if(dp[i-1][j][s]!=-1){
                        best = Math.max(best,dp[i-1][j][s]);
                    }
                    if(j>=1&&dp[i-1][j-1][1-s]!=-1){
                        best = Math.max(best,dp[i-1][j-1][1-s]);
                    }
                    int gain = 0;
                    if(arr[i-1]=='L' && s==0 )gain=1;
                    if(arr[i-1]=='R'&&s==1) gain=1;
                    dp[i][j][s]=best+gain;
                    
                }
            }
        }
        int ans =0;
        for(int i=0;i<=k;i++){
            for(int s=0;s<=1;s++){
                ans=Math.max(ans,dp[n][i][s]);
            }
        }


        System.out.println(ans);

        // Please write your code here.
    }
}