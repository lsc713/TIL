import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
	static int[] dx= {-1,1,0,0};
	static int[] dy = {0,0,-1,1};
	static int r,c;
	static char map[][];
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		r = sc.nextInt();
		c = sc.nextInt();
		map = new char[r][c];
		for(int i=0;i<r;i++) {
			String input =sc.next();
			for(int j = 0 ; j<c;j++) {
				char ch = input.charAt(j);
				map[i][j]=ch;
			}
		}
		visited = new boolean[r][c];
		recur(0,0,visited,0);
		System.out.println(answer);
	}
	static int answer=0;
	static String temp="";
	static Queue<int[]> q = new LinkedList<>();
	static boolean[][] visited;
	static void recur(int x, int y,boolean[][] visited,int sum) {
		q.add(new int[] {x,y});
		visited[x][y]=true;
		temp+=map[x][y];
		sum+=1;
		answer=Math.max(answer, sum);
		while(!q.isEmpty()) {
			int[] cur=q.poll();
			for(int i = 0 ; i <4;i++) {
				int nx = cur[0]+dx[i];
				int ny = cur[1]+dy[i];
			
				if(0<=nx&&nx<r&&0<=ny&&ny<c&&!visited[nx][ny]&&!temp.contains(String.valueOf(map[nx][ny]))) {
					recur(nx,ny,visited,sum);
					temp=temp.substring(0, temp.length()-1);
					visited[nx][ny]=false;
				}
			}
		}
		
	}
}
