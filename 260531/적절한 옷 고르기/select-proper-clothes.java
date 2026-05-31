import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] s = new int[n+1];
        int[] e = new int[n+1];
        int[] v = new int[n+1];
        for (int i = 1; i <= n; i++) {
            s[i] = sc.nextInt();
            e[i] = sc.nextInt();
            v[i] = sc.nextInt();
        }
        int[][] dp = new int[m+1][n+1];
        for(int[] row : dp ){
            Arrays.fill(row,-1);
        }
        for(int i =1 ;i<=n;i++){
            if(s[i]<=1 && e[i] >=1){
                dp[1][i]=0;
            }
        }
        for(int i = 2;i<=m;i++){
            for(int j =1 ;j<=n;j++){
                int best =-1;
                if(!(s[j]<=i && e[j]>=i))continue;
                for(int k = 1;k<=n;k++){
                    if(dp[i-1][k]!= -1){
                        best = Math.max(best,dp[i-1][k]+Math.abs(v[j]-v[k]));
                    }
                    
                }
                dp[i][j]= best;
            }
        }
        int ans =0;
        for(int i = 1;i<=n;i++){
            ans=Math.max(dp[m][i],ans);
        }
        System.out.println(ans);
        // Please write your code here.
    }
}