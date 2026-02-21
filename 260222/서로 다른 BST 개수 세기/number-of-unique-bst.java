import java.util.Scanner;
public class Main {
    static int[] dp =new int[20];
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        dp[0]=1;dp[1]=1;
        System.out.println(calc(n));

        // Please write your code here.
    }
    static int calc(int n){
        if(dp[n]!=0) return dp[n];
        if(n<=1)return 1;
        int total=0;
        for(int i=1;i<=n;i++){
            total+=calc(i-1)*calc(n-i);
        }
        return dp[n]=total;
    }
}