import java.util.Scanner;

class Solution
{
	static int answer;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int tc=1;tc<=T;tc++) {
			int n = sc.nextInt();
			int m5=0;
			int m1=0;
			int t5=0;
			int t1=0;
			int h5=0;
			int h1=0;
			int w50=0;
			int w10=0;
			if(n>=50000) {
				m5 = n/50000;
				n%=50000;
			}
			if(n>=10000) {
				m1 = n/10000;
				n%=10000;
			}
			if(n>=5000) {
				t5 = n/5000;
				n%=5000;
			}
			if(n>=1000) {
				t1 = n/1000;
				n%=1000;
			}
			if(n>=500) {
				h5 = n/500;
				n%=500;
			}
			if(n>=100) {
				h1 = n/100;
				n%=100;
			}
			if(n>=50) {
				w50 = n/50;
				n%=50;
			}
			if(n>=10) {
				w10 = n/10;
				n%=10;
			}
			System.out.println("#"+tc+" ");
			System.out.println(m5+" "+m1+" "+t5+" "+t1+" "+h5+" "+h1+" "+w50+" "+w10);
		}
	}
	
}
