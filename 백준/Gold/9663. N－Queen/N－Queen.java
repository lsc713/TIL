import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;

public class Main {
	static int n;
	static int[] arr;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		arr= new int[n];
		visited = new boolean[n];
		recur(0);
		System.out.println(answer);
	}
	static int answer=0;
	static boolean[] visited;
	static void recur(int depth) {
		if(depth==n) {
			answer++;
			return;
		}
		for(int i =0;i<n;i++) {
			if(visited[i])continue;
			visited[i]=true;
			arr[depth]=i;
			if(solve(depth)) {
				recur(depth+1);	
			}
			visited[i]=false;
		}
	}
	static boolean solve(int idx) {
		for(int i = 0;i<idx;i++) {
			if(Math.abs(i-idx)==Math.abs(arr[i]-arr[idx])){//대각선 값이 같다면
				return false;
			}
		}
		return true;
	}
}
