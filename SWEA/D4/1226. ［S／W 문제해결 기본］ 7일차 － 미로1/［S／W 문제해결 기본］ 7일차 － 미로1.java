import java.util.Scanner;

public class Solution {

	static int[] dx = {-1,1,0,0};
	static int[] dy = {0,0,-1,1};
	static int answer;
	static int arr;
	static int[][] map;
	static boolean[][] visited;
	static int t;
	static int start;
	static int end;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		for(int tc = 1;tc<=10;tc++) {
			t= sc.nextInt();
			answer=0;
			map = new int[16][16];
			visited = new boolean[16][16];
			int startx=0;
			int starty=0;
			for(int i = 0 ; i <16;i++) {
				String input = sc.next();
				for(int j = 0 ; j <16;j++) {
					map[i][j] = Integer.parseInt(String.valueOf(input.charAt(j)));
					if(map[i][j] == 2) {
						startx = i;
						starty = j;
						visited[i][j] = true;
					}
					if(map[i][j] == 3) {
						start = map[i][j];
					}
					if(map[i][j]==1) {
						visited[i][j] = true;
					}
				}
			}
			recur(startx,starty);
			System.out.println("#"+t+" "+answer);
		}
		
	}
	static void recur(int x , int y) {
		if(map[x][y]==3) {
			answer=1;
		}
		for(int i = 0 ; i<4;i++) {
			int nx = x+dx[i];
			int ny = y+dy[i];
			if(0<=nx&&nx<16&&0<=ny&&ny<16&&!visited[nx][ny]) {
				visited[nx][ny]=true;
				map[x][y]=-1;
				recur(nx,ny);
			}
		}
		
	}
}
