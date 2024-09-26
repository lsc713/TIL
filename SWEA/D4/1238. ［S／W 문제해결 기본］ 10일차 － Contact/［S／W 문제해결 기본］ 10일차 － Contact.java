import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		for(int t=1;t<=10;t++) {
			int n = sc.nextInt();
			int st= sc.nextInt();
			boolean visited[] = new boolean[101];
			List<Integer>[] list = new ArrayList[101];
			for(int i =1;i<=100;i++) {
				list[i]= new ArrayList<>();
			}
			for(int i = 0 ; i<n/2;i++) {
				int from = sc.nextInt();
				int to =sc.nextInt();
				list[from].add(to);
			}
			Queue<Integer> q = new LinkedList<>();
			q.add(st);
			visited[st]=true;
			int answer=0;
			while(!q.isEmpty()) {
				int size = q.size();
				int result=0;
				for(int i = 0 ; i<size;i++) {
					int tmp = q.poll();
					result=Math.max(result, tmp);
					for(int val : list[tmp]) {
						if(!visited[val]) {
							visited[val]=true;
							q.add(val);
						}
					}
					
				}
//				System.out.println(result);
				answer=result;
			}
			System.out.println("#"+t+" "+answer);
		}
	}
}
