import java.util.Scanner;
import java.util.Stack;

class Solution
{
	static int V,E;
	static int[] adjArr[];
	static boolean visited[];
	static StringBuilder sb;
	static int[] degree;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		for(int tc=1;tc<=10;tc++) {
			sb = new StringBuilder();
			V = sc.nextInt();
			E = sc.nextInt();
			st= new Stack<>();
			visited = new boolean[V+1];
			adjArr = new int[V+1][V+1];
			degree = new int[V+1];
			for(int i = 0 ;i<E;i++) {
				int a = sc.nextInt();
				int b = sc.nextInt();
				adjArr[a][b]=1;
				degree[b]++;
			}
			for(int i = 1;i<=V;i++) {
				if(degree[i]==0) {
					dfs(i);
				}
			}
			sb.append("#"+tc+" ");
			while(!st.isEmpty()) {
				sb.append(st.pop()+" ");
			}
			System.out.println(sb);
		}
		 
	}
	static Stack<Integer> st;
	static void dfs(int curr) {
		visited[curr] = true;
		for(int i = 1;i<=V;i++) {
			if(adjArr[curr][i]==1 && !visited[i]) {
				dfs(i);
			}
		}
		st.push(curr);
	}
	
}
