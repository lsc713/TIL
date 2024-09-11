import java.util.Scanner;
class Main{
	static int[] money = {25,10,5,1};
	static int[] count = new int[4];
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int tc=1;tc<=T;tc++) {
			int n = sc.nextInt();
			for(int i = 0 ; i < 4;i++) {
				count[i] =n/money[i];
				n%=money[i];
//				System.out.println(n+" "+count[i]);
			}
			for(int val : count) {
				System.out.print(val+" ");	
			}
			System.out.println();
		}
		
		
	}
}
    