import java.util.*;
import java.io.FileInputStream;

class Main
{
	static int n,m,answer,wallCount;
	static int[] dx = {-1,1,0,0};
	static int[] dy = {0,0,-1,1};
	/*
	 * 3개의 벽 다 써야 (표식 1이 3개 생겨야하는데, 0인 곳을 바꾸자)
	 * 그래서 0의 최댓값을 찾아야하는데 1을 어디다가 둘까를 쭉 돌면서 다 확인하되,
	 * 기존것 보다 커지면 return
	 * 
	 * 
	 * virus 2~10
	 * */
	static boolean[][] visited;//방문 배열이 필요하고, 처음에 0아니면 못감 표시
	static int[][] map;
	public static void main(String[] args) {
		//벽은 다 써야함.
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		m = sc.nextInt();
		visited = new boolean[n][m];
		answer =0;
		map = new int[n][m];
		for(int i = 0 ; i <n;i++) {
			for(int j = 0 ; j <m;j++) {
				map[i][j] = sc.nextInt();
				if(map[i][j]!=0) {
					visited[i][j] = true;
				}
			}
		}
		wallCount=3;
		int depth = wallCount;
		int[][] clone = new int[map.length][map[0].length];
		for(int i = 0 ;i<map.length;i++) {
			clone[i]=map[i].clone();
		}
		recur(depth,clone);
		
//		for(int[] arr: clone) {
//			System.out.println(Arrays.toString(arr));
//		}
		
		System.out.println(answer);
	}
	//방문배열도 새롭게 해야함.
	static int[][] idx;
	static boolean[][] check;
	static void recur(int depth,int[][] clone) {
		if(depth==0) {
			idx = new int[clone.length][clone[0].length];
			for(int i = 0 ; i < n ; i++) {
				idx[i]=clone[i].clone();
			}
			check = new boolean[n][m];
			for(int i = 0 ; i<visited.length;i++) {
				check[i]=visited[i].clone();
			}
			for(int i = 0 ; i<n;i++) {
				for(int j = 0 ; j<m;j++) {
					doVirus(i,j);
				}
			}
//			System.out.println("==============");
//			for(int[] arr : idx) {
//				System.out.println(Arrays.toString(arr));
//			}
//			for(boolean[] arr : check) {
//				System.out.println(Arrays.toString(arr));
//			}
//			System.out.println("===============");
//			for(int[] arr : clone) {
//				System.out.println(Arrays.toString(arr));
//			}
			int result=0;
			for(int i = 0 ; i<n;i++) {
				for(int j = 0 ; j<m;j++) {
					if(idx[i][j]==0) {
						result++;
					}
				}
			}
//			System.out.println(result);
			answer = Math.max(answer, result);
			
			return;
		}
//		System.out.println(1+" "+"?");
		for(int i = 0 ; i <n;i++) {
			for(int j = 0 ; j < m;j++) {
				if(clone[i][j] == 0&&!visited[i][j]) {
					visited[i][j]=true;
					depth--;
					clone[i][j]=1;//벽세우고..
//					System.out.println(i+" "+j);
//					for(int[] arr : clone) {
//						System.out.println(Arrays.toString(arr));
//					}
					recur(depth,clone);
					
					visited[i][j]=false;
					depth++;
					clone[i][j]=0;
				}
			}
		}
	}
	
	static void doVirus(int i,int j) {
//		System.out.println(i+"??"+j);
		if(idx[i][j]==2) {
			for(int k=0;k<4;k++) {
				int nx = i+dx[k];
				int ny = j+dy[k];
				if(0<=nx&&nx<n&&0<=ny&&ny<m && idx[nx][ny] ==0 && !check[nx][ny]) {
					idx[nx][ny]=2;
					check[nx][ny]=true;
//					for(int[] arr : idx) {
//						System.out.println(Arrays.toString(arr));
//					}
					doVirus(nx,ny);
				}
			}
		}
	}
}