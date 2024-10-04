import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;

public class Main {
	static int n,m,answer;//바구니에 물의 양의 합
	static int[][] map;
	static boolean[][] visited;
	static int[][] movArr;
	static int[] dx = {0,-1,-1,-1,0,1,1,1};
	static int[] dy = {-1,-1,0,1,1,1,0,-1};
	static List<int[]> cloudList;
	static int[] dgx = {-1,-1,1,1};
	static int[] dgy = {1,-1,1,-1};
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		m=sc.nextInt();
		map=new int[n][n];
		for(int i = 0 ; i<n;i++) {
			for(int j =0  ; j<n;j++) {
				map[i][j]=sc.nextInt();
			}
		}
		cloudList = new ArrayList<>();
		movArr = new int[m][2];//이동 관련 저장 배열
		for(int i = 0 ; i<m;i++) {
			int d = sc.nextInt();//direction
			int s = sc.nextInt();//s칸이동
			
			movArr[i] = new int[] {d-1,s};
		}
		visited=new boolean[n][n];
		answer=0;
		/*가장 위쪽은 1,1 가장 아래는 n,n(0~n-1 이 아님)
		 * -1,n이 연결됨
		 * 
		 * ---
		 * 0: 비바라기 ->구름생성
		 * (n,1) (n,2) (n-1,1) (n-1,2)
		 * 
		 * 1:
		 * 구름들이 이동 
		 * 
		 * 2.
		 * 이후 물 양 1 증가 ***여기
		 * 
		 * 3.
		 * 구름 사라짐.(해당 칸은 또 생성안됨)
		 * 
		 * 4.
		 * ***여기에 물복사 해당 칸의 4대각방향 거리가 1인 칸에 물이 있는 수 만큼 물의 양증가
		 * (문제의 경계가 아님)
		 * 
		 * 5.
		 * 물의양이 2이상인 모든칸에 구름이 생기고, 물의 양이 2 줄어든다.(사라진 곳은 아닐 것)
		 * */
		
		
		biba();//spell~0   4-2구조의 2차원배열 반환
		List<int[]> movedCloud = move(cloudList,movArr[0]);// 1
//		for(int[] val : movedCloud) {
//			System.out.println(Arrays.toString(val));
//		}
		
		for(int i = 0 ; i <movedCloud.size();i++) {
			map[movedCloud.get(i)[0]][movedCloud.get(i)[1]]++;
			visited[movedCloud.get(i)[0]][movedCloud.get(i)[1]]=true;
		}
		
		
		
		for(int i = 0 ; i<cloudList.size();i++) {
			for(int j = 0 ; j <4;j++) {
				int nx =movedCloud.get(i)[0]+dgx[j];
				int ny =movedCloud.get(i)[1]+dgy[j];
				if(0<=nx&&nx<n&&0<=ny&&ny<n&&map[nx][ny]>0) {
					map[movedCloud.get(i)[0]][movedCloud.get(i)[1]]++;
				}
			}
		}
		
		
		
		for(int t = 1 ; t < m;t++) {
			cloudList = new ArrayList<>();
			
			for(int i = 0 ; i <n;i++) {
				for(int j = 0 ; j <n;j++) {
					if(map[i][j]>=2&&!visited[i][j]) {
						cloudList.add(new int[] {i,j});//구름들을 만들고
						map[i][j]=map[i][j]-2;
					}
				}
			}
//			System.out.println("==================");
//			for(int[] val : map) {
//				System.out.println(Arrays.toString(val));
//			}
			visited = new boolean[n][n];
			List<int[]> newList = move(cloudList,movArr[t]);
			for(int i = 0 ; i <newList.size();i++) {
				map[newList.get(i)[0]][newList.get(i)[1]]++;
//				System.out.println("gd"+newList.get(i)[0]+" "+newList.get(i)[1]);
				
				visited[newList.get(i)[0]][newList.get(i)[1]]=true;
			}
			
			for(int i = 0 ; i<newList.size();i++) {
				for(int j = 0 ; j <4;j++) {
					int nx =newList.get(i)[0]+dgx[j];
					int ny =newList.get(i)[1]+dgy[j];
					if(0<=nx&&nx<n&&0<=ny&&ny<n&&map[nx][ny]>0) {
						map[newList.get(i)[0]][newList.get(i)[1]]++;
					}
				}
			}
		}
//		for(int[] val : map) {
//			System.out.println(Arrays.toString(val)+"  99");
//		}
		for(int i = 0 ; i <n;i++) {
			for(int j = 0 ; j <n;j++) {
				if(map[i][j]>=2&&!visited[i][j]) {
					map[i][j]=map[i][j]-2;
				}
				answer+=map[i][j];
			}
		}
		
		System.out.println(answer);
	}
	static List<int[]> move(List<int[]> bibaMap, int[] movArr) {
		List<int[]> list = new ArrayList<>();
		for(int i = 0 ; i<bibaMap.size();i++) {//비바라기 x,y좌표에 방향*이동거리 만큼 연산
			int nx = bibaMap.get(i)[0] + dx[movArr[0]]*movArr[1];
			int ny = bibaMap.get(i)[1] + dy[movArr[0]]*movArr[1];//범위 넘어가면 %로 다시 해버리기.
//			System.out.println("move"+nx+" " +ny+" "+nx%n);
			//연산 이후 범위 벗어나면 문제의 요구대로 조정
			
			if(nx != 0) {
				nx%=n;
			}
			if(ny!=0) {
				ny%=n;
			}
			
			if(nx<0) {
				nx=n+nx;
			}else if(nx>=n) {
				nx=nx-n;
			}
			if(ny<0) {
				ny=n+ny;
			}else if(ny>=n){
				ny=ny-n;
			}
//			System.out.println("move2"+nx+" " +ny+" "+nx%n);
			list.add(new int[] {nx,ny});
			
		}
		return list;
	}
	static void biba() {
		cloudList.add(new int[] {n-1,0});
		cloudList.add(new int[] {n-1,1});
		cloudList.add(new int[] {n-2,0});
		cloudList.add(new int[] {n-2,1});
	}
	static void cloud() {
		
	}
}
