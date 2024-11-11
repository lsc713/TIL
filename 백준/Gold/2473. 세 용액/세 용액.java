import java.util.Arrays;
import java.util.Queue;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		long[] arr = new long[N];
		
		for(int i = 0 ; i <N;i++) {
			arr[i] = sc.nextInt();
		}
		long[] temp = new long[3];
		Arrays.sort(arr);
		long answer=3_000_000_000L;
		for(int i = 0 ;i<N-2;i++) {
			int L = i+1;
			int R = arr.length-1;
			while(L<R) {
				long sum = arr[i]+arr[L]+arr[R];
				if(sum==0) {
					System.out.println(arr[i]+" "+arr[L]+" "+arr[R]);
					return;
				}
				if(answer>Math.abs(arr[i]+arr[L]+arr[R])) {
					answer=Math.abs(arr[i]+arr[L]+arr[R]);
					temp[0]=arr[i];
					temp[1]=arr[L];
					temp[2]=arr[R];
				}
				if(sum>0) {
					R--;
				}else {
					L++;
				}
			}
		}
		System.out.println(temp[0]+" "+temp[1]+" " +temp[2]);
	}
}
