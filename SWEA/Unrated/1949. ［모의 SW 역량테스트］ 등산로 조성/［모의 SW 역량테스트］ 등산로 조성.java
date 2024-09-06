import java.util.Arrays;
import java.util.Scanner;
import java.io.FileInputStream;

class Solution
{
	static int n ;
	static int k;
	static int[][] map;
	static int maxH;
	static int answer;
	static boolean visited[][];
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int tc =1;tc<=T;tc++) {
			n=sc.nextInt();
			answer=0;
			k=sc.nextInt();
			visited = new boolean[n][n];
			map=new int[n][n];
			maxH = 0;
			
			for(int i = 0;i<n;i++) {
				for(int j=0;j<n;j++) {
					map[i][j] = sc.nextInt();
					if(map[i][j] > maxH) {
						maxH = map[i][j];
					}
				}
			}
//			for(int[] arr : map) {
//				System.out.println(Arrays.toString(arr)+" "+maxH);
//			}
			for(int i = 0 ; i < n ; i++) {
				for(int j=0;j<n;j++) {
					if(map[i][j]==maxH) {
						//함수를 만든다 ( 재귀)
						dfs(i,j,1,true);
					}
				}
			}
			System.out.println("#"+tc+" "+answer);
			
		}//tc
	}//main
	
	static int[] dx = {-1,1,0,0};
	static int[] dy = {0,0,-1,1};
	static void dfs(int x , int y, int dist,boolean construct) {
		if(dist > answer) {
			answer=dist;
		}
		visited[x][y]=true;
		
		for(int i = 0 ; i < 4;i++) {
			int nx = x+dx[i];
			int ny = y+dy[i];
			if(isIn(nx,ny)&&!visited[nx][ny]) {
				if(map[nx][ny]<map[x][y]) {
					dfs(nx,ny,dist+1,construct);
				}else if(construct && map[nx][ny]-k < map[x][y]) {
					int tmp = map[nx][ny];
					map[nx][ny] = map[x][y]-1;
					dfs(nx,ny,dist+1,false);
					map[nx][ny]= tmp;
				}
			}
		}
		visited[x][y]=false;
	}
	static boolean isIn(int nx, int ny) {
		return 0<=nx&&nx<n&&0<=ny&&ny<n;
	}
}
