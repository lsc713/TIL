import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long N = sc.nextLong();
		long[] arr = new long[(int) N];
		
		for(long i = 0 ; i <N;i++) {
			arr[(int) i] = sc.nextInt();
		}
		long[] temp = new long[3];
		Arrays.sort(arr);
		long answer=3_000_000_000L;
		for(int i = 0 ;i<N-2;i++) {
			long idx = i;
			long L = idx+1;
			long R = arr.length-1;
			while(L<R) {
				long mid = arr[(int) idx]+arr[(int) L]+arr[(int) R];
				if(mid==0) {
					System.out.println(arr[(int) idx]+" "+arr[(int) L]+" "+arr[(int) R]);
					return;
				}
				if(mid>0) {
					if(answer>Math.abs(arr[(int) idx]+arr[(int) L]+arr[(int) R])) {
						answer=Math.abs(arr[(int) idx]+arr[(int) L]+arr[(int) R]);
						temp[0]=arr[(int) idx];
						temp[1]=arr[(int) L];
						temp[2]=arr[(int) R];
					}
					R--;
				}else {
					if(answer>Math.abs(arr[(int) idx]+arr[(int) L]+arr[(int) R])) {
						answer=Math.abs(arr[(int) idx]+arr[(int) L]+arr[(int) R]);
						temp[0]=arr[(int) idx];
						temp[1]=arr[(int) L];
						temp[2]=arr[(int) R];
					}
					L++;
				}
			}
		}
		System.out.println(temp[0]+" "+temp[1]+" " +temp[2]);
	}
}
