import java.util.Scanner;
public class Main {
    static int[] dp;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        dp=new int[n+1];
        dp[1]=1;dp[2]=1;
        System.out.println(fibo(n));
        // Please write your code here.
    }
    static int fibo(int idx){
        if(dp[idx]!=0){
            return dp[idx];
        }
        if(idx>2){return dp[idx]=fibo(idx-1)+fibo(idx-2);}else{return dp[idx];}
    }

}