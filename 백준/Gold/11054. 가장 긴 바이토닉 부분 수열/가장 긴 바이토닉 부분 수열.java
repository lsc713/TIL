import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr= new int[n];
		for(int i = 0 ; i < n;i++) {
			arr[i]=sc.nextInt();
		}
		int answer = 0;
		int[] dp1 = new int[n];
		int[] dp2 = new int[n];
		Arrays.fill(dp1, 1);
		Arrays.fill(dp2, 1);
		
		for(int i = 0 ; i < n;i++) {
			for(int j=0;j<i;j++) {
				if(arr[i]>arr[j]&&dp1[i]<dp1[j]+1) {
					dp1[i] = dp1[j]+1;
				}
			}
		}
		for(int i =n-1;i>=0;i--) {
			for(int j =n-1;j>=i;j--) {
				if(arr[i]>arr[j]&&dp2[i]<dp2[j]+1) {
					dp2[i]=dp2[j]+1;
				}
			}
		}
		for(int i = 0 ; i<n;i++) {
			answer=Math.max(answer, dp1[i]+dp2[i]-1);
		}
		
		System.out.println(answer);
	}
}
