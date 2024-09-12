import java.util.Scanner;

class Solution
{
	static int N,L,answer;
	static int[] arr[];
	static int[][] dp;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int tc=1;tc<=T;tc++) {
			N =sc.nextInt();//물건개수
			answer=0;
			L = sc.nextInt();//칼로리 한계
			arr = new int[N+1][2];//각 음식의 맛과 칼로리
			dp = new int[N+1][L+1];//메모이제이션을 위한 2차원 배열
			for(int i = 1 ;i <= N;i++) {//각 물건에 대한
				int V = sc.nextInt();//맛
				int C= sc.nextInt();//칼로리
				arr[i][1] = V;//맛
				arr[i][0] = C;//칼로리
			}
			answer = 0;
			
			for(int i = 1;i<=N;i++) {
				for(int j =1;j<=L;j++) {
					if(arr[i][0] > j ) {//만약에 가방 무게보다 큰 무게를 갖는 물건인 경우
						dp[i][j] = dp[i-1][j];//이전 물건의 내용을 기입.
					}else {//가방에 들어갈 수 있는 무게의 물건이라면.. 이전 내용물과 
						dp[i][j] = Math.max(dp[i-1][j], dp[i-1][j-arr[i][0]]+arr[i][1]);
					}
				}
			}
			answer = dp[N][L];
			System.out.println("#"+tc+" "+answer);
		}//tc
	}//main
	
}
