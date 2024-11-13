import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.StringTokenizer;



public class Main {
	static int[][][] map;
	static int[] dx = {-1,0,1,0};
	static int[] dy = {0,-1,0,1};
//	static List<Tomato> list;
	static class Tomato{
		int h,x,y,result;
		public Tomato(int h,int x,int y,int result) {
			this.h=h;
			this.x=x;
			this.y=y;
			this.result=result;
		}
		@Override
		public String toString() {
			return "Tomato [h=" + h + ", x=" + x + ", y=" + y + ", result=" + result + "]";
		}
		
	}
	static int N,M,H;
	static int EXO;
	static Queue<Tomato> q = new LinkedList<>();
	public static void main(String[] args) throws IOException {
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		 M = Integer.parseInt(st.nextToken());
		N = Integer.parseInt(st.nextToken());
		H = Integer.parseInt(st.nextToken());
//		list = new ArrayList<>();
		map=new int[H][N][M];
		EXO=0;
		for(int i = 0 ; i<H;i++) {
			for(int j=0;j<N;j++) {
				st=new StringTokenizer(br.readLine());
				for(int k = 0 ; k<M;k++) {
					map[i][j][k]=Integer.parseInt(st.nextToken());
					if(map[i][j][k]==1) {
						q.add(new Tomato(i,j,k,0));
					}
					if(map[i][j][k]==0) {
						EXO++;
					}
				}
			}
		}
		answer=0;
//		System.out.println(q.peek().toString());
		bfs();
//		System.out.println(EXO);
//		for(int[][] val : map) {
//			for(int[] value: val) {
//				System.out.println(Arrays.toString(value));
//			}
//		}
		
		if(EXO>0) {
			System.out.println(-1);
		}else {
			System.out.println(answer);	
		}
		
	}
	static int answer;
	static void bfs() {
		boolean[][][] visited = new boolean[H][N][M];
		while(!q.isEmpty()) {
			Tomato cur = q.poll();
//			System.out.println(cur.toString());
			answer=Math.max(answer, cur.result);
			visited[cur.h][cur.x][cur.y]=true;
			for(int i = 0 ; i <4;i++) {
				int nx = cur.x+dx[i];
				int ny = cur.y+dy[i];
				if(0<=nx&&nx<N&&0<=ny&&ny<M&&map[cur.h][nx][ny]==0) {
					visited[cur.h][nx][ny]=true;
					map[cur.h][nx][ny]=1;
					q.add(new Tomato(cur.h,nx,ny,cur.result+1));
					EXO--;
				}
				
			}
			int nx = cur.x,ny=cur.y;
			if(0<=nx&&nx<N&&0<=ny&&ny<M&&0<=cur.h-1&&map[cur.h-1][nx][ny]==0) {
				visited[cur.h-1][nx][ny]=true;
				map[cur.h-1][nx][ny]=1;
				q.add(new Tomato(cur.h-1,nx,ny,cur.result+1));
				EXO--;
			}
			if(0<=nx&&nx<N&&0<=ny&&ny<M&&0<=cur.h+1&&cur.h+1<H&&map[cur.h+1][nx][ny]==0) {
				visited[cur.h+1][nx][ny]=true;
				map[cur.h+1][nx][ny]=1;
				q.add(new Tomato(cur.h+1,nx,ny,cur.result+1));
				EXO--;
			}
			
		}
	}
}
