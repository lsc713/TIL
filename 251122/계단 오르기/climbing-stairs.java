import java.util.Scanner;
public class Main {
    static int n;
    static int[] dp;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         n = sc.nextInt();
        // Please write your code here.
         dp =new int[n+1];
         
         System.out.println(calc(n));
        

    }
    static int calc(int v){

        dp[2]=1;
       if(v>=3){
        dp[3]=1;
       
       return Math.max(dp[v-2]+1,dp[v-3]+1);
       }
       return dp[v];
    }
}