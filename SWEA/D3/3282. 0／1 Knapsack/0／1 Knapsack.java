import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int t=1;t<=T;t++) {
			int n =sc.nextInt();//stuff count
			int w = sc.nextInt();//bag weight
			int[][] arr = new int[n+1][2];
			for(int i = 1 ; i <= n ;i++) {
				int weight = sc.nextInt();
				int value = sc.nextInt();
				arr[i][0]=weight;
				arr[i][1]=value;
			}
			int[][] dp = new int[n+1][w+1];
			for(int i = 1 ;i<=n;i++) {
				for(int j = 1;j<=w;j++) {
					if(j<arr[i][0]) {
						dp[i][j]=dp[i-1][j];
					}else {
						dp[i][j] = Math.max(dp[i-1][j], dp[i-1][j-arr[i][0]]+arr[i][1]);
					}
				}
			}

			
			System.out.println("#"+t+" "+dp[n][w]);
		}
	}
}
