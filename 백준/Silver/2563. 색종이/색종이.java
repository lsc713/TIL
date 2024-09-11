import java.util.Scanner;
class Main{
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[][] map = new int[100][100];
		int n = sc.nextInt();
		int answer=0;
		for(int a = 0 ; a < n ; a ++) {
			//x y  좌표가 주어진다.
			int x = sc.nextInt();
			int y = sc.nextInt();//한 꼭짓점
			
			int widx = x+10; //오른쪽 꼭지점
			int heighty = y+10;//상단 꼭지점 //둘다 사용하면 대각선에 해당하는 꼭짓점이 정해진다.
			for(int i = x ; i <widx;i++) {
				for(int j =y ;j<heighty;j++) {
					map[i][j]=1;
				}
			}
		}
		for(int i = 0 ; i <100;i++) {
			for(int j =0 ;j<100;j++) {
				if(map[i][j]==1) {
					answer++;
				}
			}
		}
		System.out.println(answer);
	}
}
    