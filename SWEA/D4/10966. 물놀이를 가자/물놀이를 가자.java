

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Solution {
	static int[] dx = {-1,1,0,0};
	static int[] dy = {0,0,-1,1};
	static Queue<Node> q;
	static class Node{
		int x,y,result;
		public Node(int x,int y, int result) {
			this.x=x;
			this.y=y;
			this.result=result;
		}
	}
	static int n,m,size;
	static int sum;
	static char[][] map;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int t=1;t<=T;t++) {
			n = sc.nextInt();
			m = sc.nextInt();
			map = new char[n][m];
			boolean[][] visited = new boolean[n][m];
			q = new LinkedList<>();
			for(int i = 0 ; i < n;i++) {
				String input = sc.next();
				map[i]=input.toCharArray();
				for(int j = 0 ; j <m;j++) {
					if(map[i][j]=='W') {
						visited[i][j]=true;
						q.add(new Node(i,j,0));
					}
				}
			}
			sum=0;
			while(!q.isEmpty()) {
				Node cur = q.poll();
				sum+=cur.result;
				for(int a = 0 ; a <4;a++) {
					int nx = cur.x+dx[a];
					int ny = cur.y+dy[a];
					if(0<=nx&&nx<n&&0<=ny&&ny<m&&!visited[nx][ny]) {
						visited[nx][ny]=true;
						q.add(new Node(nx,ny,cur.result+1));
					}
				}
			}
			System.out.println("#"+t+" " +sum);
		}
	}
}
