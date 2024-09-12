import java.util.Scanner;
import java.io.FileInputStream;

class Main
{
	public static void main(String args[]) throws Exception
	{
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		System.out.println(fibo(n));
		
	}
	static long[] dp = new long[91]; 
	static long fibo(int n) {
		if(n<2) {
			return n;
		}
		if(dp[n]!=0) {
			return dp[n];
		}
		return dp[n] = fibo(n-1)+fibo(n-2);
	}
}