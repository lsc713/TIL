import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;



public class Main {
	static int[][] map;
	static int N,M,K,answer;
	static int[] dx = {-1,0,1,0};
	static int[] dy = {0,-1,0,1};
	static class Node{
		int x,y,result,night,chance;
		public Node(int x,int y, int result, int night,int chance){
			this.x=x;
			this.y=y;
			this.result=result;
			this.night=night;
			this.chance=chance;
		}
		@Override
		public String toString() {
			return "Node [x=" + x + ", y=" + y + ", result=" + result + ", night=" + night + ", chance=" + chance + "]";
		}
		
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		K = Integer.parseInt(st.nextToken());
		answer=0;
		map = new int[N][M];
		for(int i = 0 ; i<N;i++) {
			String input = br.readLine();
			for(int j=0;j<M;j++) {
				map[i][j] = input.charAt(j)-'0';
			
			}
		}
		answer =bfs(new Node(0,0,1,1,K));
		System.out.println(answer);
	}
	static int bfs(Node node) {
		Queue<Node> q = new LinkedList<>();
		q.add(node);
		boolean[][][][] visited = new boolean[N][M][2][K+1];
		visited[node.x][node.y][node.night][node.chance]=true;
		while(!q.isEmpty()) {
			Node cur = q.poll();
//			System.out.println(cur.toString());
			if(cur.x==N-1&&cur.y==M-1) {
				
				return cur.result;
			}
			for(int i = 0 ; i<4;i++) {
				int nx = cur.x+dx[i];
				int ny = cur.y+dy[i];
				if(0<=nx&&nx<N&&0<=ny&&ny<M&&map[nx][ny]==0&&!visited[nx][ny][cur.night][cur.chance]) {
					visited[nx][ny][cur.night][cur.chance]=true;
					q.add(new Node(nx,ny,cur.result+1,cur.night==1?0:1,cur.chance));
				}else if(0<=nx&&nx<N&&0<=ny&&ny<M&&map[nx][ny]==1&&cur.night==1&&cur.chance>0&&!visited[nx][ny][cur.night][cur.chance-1]) {
					visited[nx][ny][1][cur.chance-1]=true;
					q.add(new Node(nx,ny,cur.result+1,cur.night==1?0:1,cur.chance-1));
				}else if(0<=nx&&nx<N&&0<=ny&&ny<M&&map[nx][ny]==1&&cur.night==0&&cur.chance>0) {
					q.add(new Node(cur.x,cur.y,cur.result+1,cur.night==1?0:1,cur.chance));
				}
			}
		}
		return -1;
	}
}
