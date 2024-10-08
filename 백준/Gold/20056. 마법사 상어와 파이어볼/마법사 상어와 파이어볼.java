import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	static List<Meteor>[][] map;
	static int n,m,k;
	static class Meteor{
		int r,c,m1,s,d;
		public Meteor(int r, int c, int m1, int s ,int d) {
			this.r = r;
			this.c = c;
			this.m1 = m1;
			this.s = s;
			this.d =d;
		}
		
		public String toString() {
			return "Meteor : "+r+" " +c+" "+m1+ " "+s+ " "+" "+d;
		}
	}
	static int[] dx = {-1,-1,0,1,1,1,0,-1};
	static int[] dy = {0,1,1,1,0,-1,-1,-1};
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		m = sc.nextInt();
		k = sc.nextInt();
		
		map = new ArrayList[n][n];
		for(int i = 0 ; i < n ; i++) {
			for(int j=0;j<n;j++) {
				map[i][j]=new ArrayList<>();
			}
		}
		
		for(int i = 0 ; i<m;i++) {
			int r = sc.nextInt()-1;
			int c = sc.nextInt()-1;
			int m1 = sc.nextInt();
			int s = sc.nextInt();
			int d = sc.nextInt();
			Meteor meteor = new Meteor(r,c,m1,s,d);
			map[r][c].add(meteor);
		}
		
//		for(int j = 0 ; j<n;j++) {
//			for(List<Meteor> list : map[j]) {
//				System.out.println(list);
//			}
//		}
		
		
		for(int i = 0; i<k;i++) {
//			System.out.println("========================move");
			move();
//			for(int j = 0 ; j<n;j++) {
//				for(List<Meteor> list : map[j]) {
//					System.out.println(list);
//				}
//			}
//			System.out.println("===========process start");
			process();
//			for(int j = 0 ; j<n;j++) {
//				for(List<Meteor> list : map[j]) {
//					System.out.println(list);
//				}
//			}
//			System.out.println("===========process");
		}
		int answer=0;
		for(int i = 0 ; i < n ;i++) {
			for(int j=0;j<n ;j++) {
				for(Meteor fire : map[i][j]) {
					answer+=fire.m1;
				}
			}
		}
		System.out.println(answer);
	}
	static void move() {
		List<Meteor>[][] newMap = new ArrayList[n][n];
		for(int i = 0 ; i <n;i++) {
			for(int j = 0;j<n;j++) {
				newMap[i][j]=new ArrayList<>();
			}
		}
		for(int i = 0 ; i <n;i++) {
			for(int j = 0;j<n;j++) {
				for(Meteor meteor : map[i][j]) {
					//1번 행은 N번과 연결되어 있고, 1번 열은 N번 열과 연결되어 있다.
					int nx = (meteor.r + dx[meteor.d] * meteor.s % n + n)%n;
					int ny = (meteor.c + dy[meteor.d] * meteor.s % n + n)%n;
					Meteor movedMeteor = new Meteor(nx,ny,meteor.m1,meteor.s,meteor.d); 
					newMap[nx][ny].add(movedMeteor);
				}
			}
		}
		map = newMap;
	}
	
	static void process() {
		List<Meteor>[][] newMap = new ArrayList[n][n];
		for(int i = 0 ; i < n ;i++) {
			for(int j=0;j<n;j++) {
				newMap[i][j] = new ArrayList<>();
			}
		}
		for(int i = 0 ; i <n;i++) {
			for(int j = 0;j<n;j++) {
				if(map[i][j].size()>1) {//4개로 나뉘어진다...
					int totalM =0;
					int ds = 0;
					boolean odd=true;;
					boolean even=true;
					int size = map[i][j].size();
					for(Meteor meteor : map[i][j]) {
						totalM+=meteor.m1;
						ds += meteor.s;
						//합쳐지는 파이어볼의 방향이 모두 홀수이거나 모두 짝수
						if(meteor.d %2 ==0) odd =false;
						else even = false;
					}
					int newM = totalM/5;
					int newS = ds/size;
					int[] newD = odd || even ? new int[] {0,2,4,6} : new int[] {1,3,5,7};
					if(newM >0) {
						for(int l = 0 ; l<4;l++) {
							newMap[i][j].add(new Meteor(i,j,newM,newS,newD[l]));	
						}
					}
				}else if(map[i][j].size()==1){
					newMap[i][j].add(map[i][j].get(0));
				}
			}
		}
		map = newMap;
	}
}
