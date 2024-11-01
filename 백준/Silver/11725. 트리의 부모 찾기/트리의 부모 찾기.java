import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		arr = new ArrayList[n+1];
		temp = new int[n+1];
		for(int i =1;i<=n;i++) {
			arr[i]=new ArrayList<>();
		}
		for(int i = 0 ; i < n-1 ;i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			arr[a].add(b);
			arr[b].add(a);
		}
//		for(List<Integer> val : arr) {
//			System.out.println(val);
//		}
		bfs(1);
		for(int i = 2;i<=n;i++) {
			System.out.println(temp[i]);
		}
	}
	static int n ;
	static List<Integer>[] arr;
	static int[] temp;
	static void bfs(int idx) {
		Queue<Integer> q = new LinkedList<>();
		boolean[] visited = new boolean[n+1];
		visited[idx]=true;
		q.add(idx);
		while(!q.isEmpty()) {
			int cur = q.poll();
			for(int i = 0;i<arr[cur].size();i++) {
				int item = arr[cur].get(i);
				if(temp[item]==0) {
					temp[item]=cur;	
					
				}
				if(visited[item])continue;
				visited[item]=true;
				q.add(item);
				
			}
		}
	}
	
}
