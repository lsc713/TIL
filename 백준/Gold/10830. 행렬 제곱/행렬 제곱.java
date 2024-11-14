import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;
import java.util.StringTokenizer;



public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		 N = Integer.parseInt(st.nextToken());
		long B = Long.parseLong(st.nextToken());
		int[][] arr = new int[N][N];
		for(int i =0;i<N;i++) {
			st = new StringTokenizer(br.readLine());
			for(int j=0;j<N;j++) {
				arr[i][j]=Integer.parseInt(st.nextToken())%MOD;
			}
		}
		StringBuilder sb = new StringBuilder();
		int[][] result = pow(arr,B);
		for(int i = 0 ; i <N;i++) {
			for(int j=0;j<N;j++) {
				sb.append(result[i][j]+" ");
			}
			sb.append("\n");
		}
		System.out.println(sb);
	}
	static int[][] pow(int[][] A,long exp){
		if(exp==1L) {
			return A;
		}
		int[][] half = pow(A,exp/2);
		int[][] result = multiply(half,half);
		if(exp%2==1) {
			result = multiply(result, A);
		}
		return result;
	}
	static int N;
	static int MOD = 1000;
	static int[][] multiply(int[][] A,int [][] B){
		int[][] result=new int[N][N];
		for(int i=0;i<N;i++) {
			for(int j =0 ; j<N;j++) {
				for(int k =0;k<N;k++) {
					result[i][j]=(result[i][j]+A[i][k]*B[k][j])%MOD;
				}
			}
		}
//		for(int[] val : A) {
//			System.out.println(Arrays.toString(val));
//		}
//		for(int[] val : B) {
//			System.out.println(Arrays.toString(val));
//		}
//		System.out.println("A and B");
//		for(int[] val : result) {
//			System.out.println(Arrays.toString(val));
//		}
//		System.out.println("-=--");
		return result;
	}
	
}
