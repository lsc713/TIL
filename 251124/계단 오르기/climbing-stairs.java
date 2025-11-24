import java.util.Scanner;
public class Main {
    static int n;
    static int[] dp;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         n = sc.nextInt();
        // Please write your code here.
         dp =new int[n+1];
         dp[0]=1;
         dp[1]=0;
         dp[2]=1;
         if(n>=3){
            dp[3]=1;
            for(int i =4;i<=n;i++){
                dp[i]=dp[i-2]+dp[i-3];
            }
         }
         System.out.println(dp[n]);
    }
    
}