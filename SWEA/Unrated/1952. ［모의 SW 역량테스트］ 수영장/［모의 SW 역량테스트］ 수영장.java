import java.util.Scanner;
import java.io.FileInputStream;

class Solution
{
	static int[] min,tax,month;
	static int answer;
	public static void main(String args[]) throws Exception
	{
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int tc=1;tc<=T;tc++) {
			
			tax = new int[5];
			month = new int[13];
			
			for(int i=1;i<tax.length;i++) {
				tax[i] = sc.nextInt();
			}
			answer=tax[4];
			for(int i=1;i<month.length;i++) {
				month[i] = sc.nextInt();//각 월에 대한 이용 계획
			}
			
			min = new int[13];
			for(int i=1;i<month.length;i++) {
				min[i] = Math.min(tax[1]*month[i], tax[2]);//하루*이용계획 , 한달
			}
			
			recur(1,0);
			System.out.println("#"+tc+" "+answer);
		}//tc
	}//main
	static void recur(int depth,int sum) {
		if(depth >= month.length) {
			answer=Math.min(answer, sum);
			return;
		}
		recur(depth+1,sum+min[depth]);
		recur(depth+3,sum+tax[3]);
	}
}