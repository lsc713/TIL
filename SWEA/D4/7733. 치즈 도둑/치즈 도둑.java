import java.util.Arrays;
import java.util.Scanner;

public class Solution {

	static int n;
	static int[][] map;
	static int max;
	static int answer;
	static int result;
	static int[] dx = {-1,1,0,0};
	static int[] dy = {0,0,-1,1};
	static boolean[][] visited;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int tc = 1;tc<=T;tc++) {
			n = sc.nextInt();
			map = new int[n][n];
			
			max=0;
			answer=0;
			result=0;
			for(int i = 0 ; i < n ; i++) {
				for(int j = 0 ; j < n ; j++) {
					map[i][j] = sc.nextInt();
					max = Math.max(max, map[i][j]);
				}
			}
			for(int i = 0;i<max;i++) {
				visited = new boolean[n][n];
				result=0;
				for(int k = 0;k<n;k++) {
					for(int j = 0 ; j<n;j++) {
						if(i >= map[k][j]) {
							visited[k][j]=true;
							map[k][j] = -1;
						}
					}
				}
				for(int k = 0;k<n;k++) {
					for(int j = 0 ; j<n;j++) {
//						System.out.println(visited[k][j]+" "+k+" "+j);
						if(!visited[k][j]) {
//							System.out.println("??");
							visited[k][j]=true;
							
//							System.out.println(result);
							bfs(k,j);
							result++;
						}
					}
				}
				answer=Math.max(answer, result);
				//덩어리를 알려면 맵을 순회하며 4방으로 돌게시키는건 어때?
			}
			System.out.println("#"+tc+" "+answer);
		}
	}
	
	static void bfs(int x,int y) {
		for(int i =0;i<4;i++) {
			int nx = x+dx[i];
			int ny = y+dy[i];
			if(0<=nx&&nx<n&&0<=ny&&ny<n&&!visited[nx][ny]&&map[nx][ny] != -1) {
				visited[nx][ny]=true;
				bfs(nx,ny);
			}
		}
		
	}
}
