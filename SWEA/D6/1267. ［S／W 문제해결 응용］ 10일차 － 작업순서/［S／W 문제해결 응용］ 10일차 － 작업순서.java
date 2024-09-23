import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Solution {
//	static class Edges implements Comparable<Edges>{
//		int A,B,W;
//		public Edges(int A, int B,int W) {
//			this.A = A;
//			this.B = B;
//			this.W = W;
//			
//		}
//		@Override
//		public int compareTo(Edges o) {
//			return Integer.compare(this.W, o.W);
//		}
//	}
	static boolean visited[];
	static ArrayList<Integer>[] arr;
	static int[] degree;
	static int V,E;
	static String answer;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = 10;
		for(int t = 1; t<=T;t++) {
			V=sc.nextInt();
			answer="";
			visited = new boolean[V+1];
			E=sc.nextInt();
			degree = new int[V+1];
			arr = new ArrayList[V+1];
			for(int i =1;i<=V;i++) {
				arr[i] = new ArrayList<>();
			}
			for(int i =1;i<=E;i++) {
				int a = sc.nextInt();
				int b = sc.nextInt();
				arr[a].add(b);
				degree[b]++;
			}
			for(int i=1;i<=V;i++) {
				if(degree[i]==0&&!visited[i]) {
					
					answer+=i+" ";
					
					topol(i);
				}
			}
			
			System.out.println("#"+t+" "+answer);
		}//tc
	}//main
	static void topol(int x) {
		visited[x]=true;
		for(int val : arr[x]) {
			degree[val]--;
			if(!visited[val]&&degree[val]==0) {
				visited[val]=true;
				answer+=val+" ";
				topol(val);
			}
		}
	}
}
