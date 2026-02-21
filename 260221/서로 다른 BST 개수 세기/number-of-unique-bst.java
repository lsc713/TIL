import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] dp = new int[20];
        dp[0]=1;
        dp[1]=1;
        for(int i=2;i<=n;i++){
            int total =0;
            for(int j =1;j<=i;j++){
                total+=dp[j-1]*dp[i-j];
            }
            dp[i]=total;
            
        }
        System.out.println(dp[n]);

        // Please write your code here.
    }
}