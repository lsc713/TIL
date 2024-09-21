
import java.util.Scanner;
import java.io.FileInputStream;
class Solution
{
    static int n,answer;
    static int[] fibo;
	public static void main(String args[]) throws Exception
	{
		Scanner sc = new Scanner(System.in);
		int T=5;

		for(int test_case = 1; test_case <= T; test_case++)
		{
            n = sc.nextInt();
            fibo=new int[n+1];
            answer = fibo(n);
            System.out.println(answer);

		}
	}//main
    static int fibo(int n){
    	if(n<=1){
        	return n;
        }
        if(fibo[n]>0){
        	return fibo[n];
        }
        return fibo[n] = fibo(n-1)+fibo(n-2);
    }
}