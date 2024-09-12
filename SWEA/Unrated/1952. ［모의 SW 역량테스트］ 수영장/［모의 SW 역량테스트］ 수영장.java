import java.util.Scanner;
import java.io.FileInputStream;

class Solution
{
	public static void main(String args[]) throws Exception
	{
		Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();
		for(int test_case = 1; test_case <= T; test_case++)
		{
		

            int tax[] = new int[5];
            int month[] = new int[13];
            for(int i =1;i<=4;i++){
            	tax[i] =sc.nextInt();
            }
            for(int i =1;i<=12;i++){
            	month[i] =sc.nextInt();
            }
            int[] dp = new int[13];
            for(int i =1;i<=12;i++){
            	dp[i] = dp[i-1]+Math.min(tax[1]*month[i],tax[2]);
                if(i>=3){
                	dp[i] = Math.min(dp[i],dp[i-3]+tax[3]);
                }
            }
            int answer=0;
            answer = Math.min(dp[12],tax[4]);
            System.out.println("#"+test_case+" "+answer);
		}
	}
}