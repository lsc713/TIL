    import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int[] seq = new int[N+1];
        for (int i = 1; i <= N; i++) {
            seq[i] = sc.nextInt();
        }
        /*
        dp[i][j] 1~i 까지 봤을 때 m이하의 다른 횟수를 가지면서
        유사도(같은 위치에 같은원소가 나온 횟수)가 가장 높을 것
        int[][] dp = new int[N+1][M+1];

        for(int i=1;i<=N;i++){
            for(int j=0;j<M;j++){
                if(seq[i-1] != seq[i] && j>=1){
                    dp[i-1][j-1]+1;
                }else{
                    dp[i-1][j]+1
                }
            }
        }

        


        */
        // Please write your code here.

        int[][][] dp = new int[N+1][M+1][5];
        for(int[][] values : dp){
            for(int[] row : values){
                Arrays.fill(row,-1);
            }
        }
        for(int i = 1;i<=4;i++){
            if(seq[1]==i){
                dp[1][0][i]=1;
            }else{
                dp[1][0][i]=0;
            }
            
        }
        for(int i=2;i<=N;i++){
            for(int j=0;j<=M;j++){
                for(int v=1;v<5;v++){
                    int best =-1;
                    if(dp[i-1][j][v]!=-1){
                        best = Math.max(best,dp[i-1][j][v]);
                    }
                    for(int k=1;k<5;k++){
                        if(v==k)continue;
                        if(j>=1 && dp[i-1][j-1][k]!=-1){
                            best = Math.max(best,dp[i-1][j-1][k]);
                        }
                        
                        
                    }
                    if(best==-1)continue;
                    int gain =0;
                    if(seq[i]==v)gain=1;
                    dp[i][j][v]=best+gain;
                }
                
            }
        }

        int ans =0;
        for(int i = 0 ; i<=M;i++){
            for(int j = 1 ; j <=4;j++){
                ans=Math.max(ans,dp[N][i][j]);    
            }
        }
        
        System.out.println(ans);
        
        
        
    }
}