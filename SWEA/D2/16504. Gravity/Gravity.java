import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

class Solution
{
	static int n;
	static int[] ing;
	static int[][] map;
	static int[][] map90;
	static int answer;
	public static void main(String[] args) throws FileNotFoundException {
		Scanner sc = new Scanner(System.in);
//		Scanner sc = new Scanner(new FileInputStream("input.txt"));
		
		int T = sc.nextInt();
		for(int tc =1 ;tc<=T;tc++) {
			n = sc.nextInt();
			ing = new int[n];
			map = new int[n][100];
			map90 = new int[100][n];
			answer =0;
			for(int i = 0 ; i < n;i++) {
				ing[i]=sc.nextInt();
			}
			for(int i = 0 ; i < n ; i++) {
				for(int j = 0 ; j < ing[i];j++) {
					map[i][j] = 1;
				}
			}
			
			for(int i = 0 ; i < n ; i++) {
				for(int j=0;j<100;j++) {
					map90[100-1-j][i]= map[i][j];
				}
			}
			
			out:for(int i = 0 ; i < 100 ; i++) {
				for(int j=0;j<n;j++) {
					int result =0;
					if(map90[i][j]==1) {
						for(int k=j+1;k<n;k++) {
							if(map90[i][k]==0) result++;
						}
						answer=Math.max(answer, result);
					}
				}
			}
//			System.out.println(Arrays.deepToString(map));
//			System.out.println(Arrays.deepToString(map90));
			System.out.println("#"+tc+" "+answer);
		}
	}
}