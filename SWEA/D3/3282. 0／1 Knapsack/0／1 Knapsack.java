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
		int n = sc.nextInt();
            int k = sc.nextInt();
            int[][] dp= new int[n+1][k+1];
            int[][] arr = new int[n+1][2];
            for(int i = 1;i<=n;i++){
            int v = sc.nextInt();
                int c= sc.nextInt();
                arr[i][0]=v;
                arr[i][1]=c;
            }
            for(int i = 1;i<=n;i++){
            	for(int j =1;j<=k;j++){
                	if(arr[i][0]>j){
                    	dp[i][j]=dp[i-1][j];
                    }else{
                    	dp[i][j]=Math.max(dp[i-1][j],dp[i-1][j-arr[i][0]]+arr[i][1]);
                    }
                }
            }
            int answer = dp[n][k];
System.out.println("#"+test_case+" "+answer);
		}
	}
}