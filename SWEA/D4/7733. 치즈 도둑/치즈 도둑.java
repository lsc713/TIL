import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Solution {

	static int n;
	static int[][] map;
	static int[] dx = {-1,1,0,0};
	static int[] dy = {0,0,-1,1};
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int t=1;t<=T;t++) {
			n =sc.nextInt();
			int max = 0;
			result =0;
			map = new int[n][n];
			for(int i = 0 ; i < n;i++) {
				for(int j=0;j<n;j++) {
					map[i][j] = sc.nextInt();
					if(max<map[i][j]) {
						max = map[i][j];
					}
				}
			}
			
			for(int i = 0 ;i<max;i++) {
				int answer=0;
				simul(i,new boolean[n][n],answer);
			}
			
			System.out.println("#"+t+" "+result);
			
		}
	}
	static void simul(int day, boolean[][] visited,int answer) {
		for(int i = 0;  i < n ; i++) {
			for(int j =0;j<n;j++) {
				if(map[i][j]<=day) {
					visited[i][j]=true;
					map[i][j]=-1;
				}
			}
		}//치즈먹기 끝 이하는 계산되어야함.
//		for(boolean[] arr: visited) {
//			System.out.println(Arrays.toString(arr));	
//		}
//		System.out.println("==================");
		for(int i = 0 ; i < n ; i ++) {
			for(int j =0;j<n;j++) {
				if(visited[i][j])continue;
				visited[i][j]=true;
				bfs(i,j,visited);
				answer++;
			}
		}
		result = Math.max(answer, result);
	}
	static int result;
	static void bfs(int x, int y,boolean visited[][]) {
		for(int k=0;k<4;k++) {
			int nx = x+dx[k];
			int ny = y+dy[k];
			if((0<=nx&&nx<n&&0<=ny&&ny<n)&&visited[nx][ny]==false&&map[nx][ny]!=-1) {
				visited[nx][ny]=true;
				bfs(nx,ny,visited);
			}
		}
	}
}
