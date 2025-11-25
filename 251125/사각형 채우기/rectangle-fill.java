import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // Please write your code here.
        //2 1 1개
        //2 2 2
        //2 3 3
        //2 4 5
        int[] dp = new int[1001];
        dp[1]=1;
        dp[2]=2;
        dp[3]=3;
        for(int i = 4;i<=1000;i++){
            dp[i]=(dp[i-1]+dp[i-2])%10007;
        }
        System.out.println(dp[n]);
    }
}