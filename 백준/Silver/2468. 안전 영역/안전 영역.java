import java.util.Scanner;

public class Main {
	static int[][] map;
	static int n,min,max;
	static boolean[][] visited,temp;
	static int[] dx = {-1,1,0,0};
	static int[] dy = {0,0,-1,1};
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		map = new int[n][n];
		min = Integer.MAX_VALUE;
		max = Integer.MIN_VALUE;
		visited = new boolean[n][n];
		for(int i = 0 ; i < n;i++) {
			for(int j=0;j<n;j++) {
				map[i][j]=sc.nextInt();
				if(min > map[i][j]) {
					min = map[i][j];
				}else if(max<map[i][j]) {
					max = map[i][j];
				}
			}
		}
		int result =1;
		int answer;
		for(int d =min;d<=max;d++) {
			answer=0;
			for(int i = 0 ; i < n;i++) {
				for(int j=0;j<n;j++) {
					if(map[i][j]<=d) {
						visited[i][j]=true;
					}
				}
			}
			temp = new boolean[n][n];
			for(int b = 0 ; b<n;b++) {
				temp[b] = visited[b].clone();
			}
			
			for(int i = 0 ; i < n;i++) {
				for(int j=0;j<n;j++) {
					if(!temp[i][j]) {
						temp[i][j]=true;
						answer+=dfs(i,j);
					}
					
				}
			}
			result=Math.max(answer, result);
		}
		System.out.println(result);
	}
	static int dfs(int x,int y) {
		
		for(int k=0;k<4;k++) {
			int nx = x+dx[k];
			int ny = y+dy[k];
			if(0<=nx&&nx<n&&0<=ny&&ny<n&&!temp[nx][ny]) {
				temp[nx][ny]=true;
				dfs(nx,ny);
			}
		}
		return 1;
	}
}
