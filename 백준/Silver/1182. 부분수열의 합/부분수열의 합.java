import java.util.Scanner;

public class Main {
	static int n,s;
	static int[] arr;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		s = sc.nextInt();
		arr = new int[n];
		for(int i =0 ; i <n;i++) {
			arr[i]=sc.nextInt();
		}
		recur(0,0,0);
				
		
		System.out.println(answer);
	}
	static int answer;
	static void recur(int depth,int sum,int cnt) {
		if(depth==n&&cnt!=0) {
			if(sum==s) {
				answer++;
			}
			return;
		}else if(depth==n&&cnt==0) {
			return;
		}
		recur(depth+1,sum,cnt);
		recur(depth+1,sum+arr[depth],cnt+1);
	}
}
