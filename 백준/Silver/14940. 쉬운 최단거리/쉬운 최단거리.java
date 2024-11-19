import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;



public class Main {
	static int[] dx = {-1,0,1,0};
	static int[] dy = {0,-1,0,1};
	static int n,m,destX,destY;
	static int[][] matrix;
	static int[][] answer;
	static StringBuilder sb;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		destX=0;
		destY=0;
		matrix = new int[n][m];
		answer = new int[n][m];
		for(int i = 0 ; i <n;i++) {
			Arrays.fill(answer[i], -1);
		}
		for(int i = 0 ; i <n;i++) {
			st = new StringTokenizer(br.readLine());
			for(int j = 0 ; j<m;j++) {
				matrix[i][j]= Integer.parseInt(st.nextToken());
				if(matrix[i][j]==2) {
					destX=i;
					destY=j;
				}else if(matrix[i][j]==0) {
					answer[i][j]=0;
				}
			}
		}
		sb = new StringBuilder();
		bfs(destX,destY);		
		for(int i = 0 ; i<n;i++) {
			for(int j = 0 ; j<m;j++) {
				sb.append(answer[i][j]+" ");
			}
			sb.append("\n");
		}
		System.out.println(sb);
	}
	static void bfs(int x,int y) {
		Queue<int[]> q = new LinkedList<>();
		q.add(new int[] {x,y,0});
		boolean[][] visited = new boolean[n][m];
		visited[x][y]=true;
		answer[x][y]=0;
		while(!q.isEmpty()) {
			int[] cur = q.poll();
			for(int i = 0 ; i <4;i++) {
				int nx = cur[0]+dx[i];
				int ny = cur[1]+dy[i];
				if(0<=nx&&nx<n&&0<=ny&&ny<m&&matrix[nx][ny]!=0) {
					if(visited[nx][ny])continue;
					q.add(new int[] {nx,ny,cur[2]+1});
					visited[nx][ny]=true;
					answer[nx][ny]=cur[2]+1;
				}
			}
		}
	}
}
		
