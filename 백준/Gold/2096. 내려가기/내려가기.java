import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int[][] arr = new int[n][3];
		StringBuilder sb = new StringBuilder();
		int maxScore = Integer.MIN_VALUE;
		int minScore = Integer.MAX_VALUE;
		
		for(int i = 0;i<n;i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			arr[i][0] = Integer.parseInt(st.nextToken());
			arr[i][1]=Integer.parseInt(st.nextToken());
			arr[i][2] = Integer.parseInt(st.nextToken());
			
		}
		
		int[][] dp = new int[n][3];
		for(int i = 0;i<n;i++) {
			for(int j=0;j<3;j++) {
				dp[i][j]= arr[i][j];	
			}
		}
		for(int i =1;i<n;i++) {
			dp[i][1] += Math.max(dp[i-1][0],Math.max(dp[i-1][1], dp[i-1][2]));
			dp[i][0] += Math.max(dp[i-1][1], dp[i-1][0]);
			dp[i][2] += Math.max(dp[i-1][1], dp[i-1][2]);
		}
		int[][] dp2 = new int[n][3];
		for(int i = 0;i<n;i++) {
			for(int j=0;j<3;j++) {
				dp2[i][j]= arr[i][j];	
			}
		}
		
		for(int i =1;i<n;i++) {
			dp2[i][1] += Math.min(dp2[i-1][0],Math.min(dp2[i-1][1], dp2[i-1][2]));
			dp2[i][0] += Math.min(dp2[i-1][1], dp2[i-1][0]);
			dp2[i][2] += Math.min(dp2[i-1][1], dp2[i-1][2]);
		}
		for(int i = 0 ;i<3;i++) {
			maxScore =Math.max(maxScore, dp[n-1][i]);
		}
		for(int i = 0 ;i<3;i++) {
			minScore =Math.min(minScore, dp2[n-1][i]);
		}
		sb.append(maxScore).append(" ").append(minScore);
		
		System.out.println(sb);
	}
}
