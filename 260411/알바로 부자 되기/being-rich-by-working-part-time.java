import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] s = new int[n];
        int[] e = new int[n];
        int[] p = new int[n];
        int[] dp = new int[n];
        int[][] jobs = new int[n][3];
        for (int i = 0; i < n; i++) {
            jobs[i][0] = sc.nextInt();
            jobs[i][1] = sc.nextInt();
            jobs[i][2] = sc.nextInt();
        }
        Arrays.sort(jobs,(a1,b1)-> a1[1]-b1[1]);
        int ans =0;
        for(int i = 0 ; i < n ;i++){
            dp[i]=jobs[i][2];
            for(int j = 0 ; j <i;j++){
                if(jobs[j][1]<jobs[i][0]){
                    dp[i]=Math.max(dp[i],dp[j]+jobs[i][2]);
                }
            }
            ans=Math.max(ans,dp[i]);
        }
        
        System.out.println(ans);
        // Please write your code here.
    }
}