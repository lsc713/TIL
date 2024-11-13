import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;
import java.util.StringTokenizer;



public class Main {
	static int N,M;
	static class Node implements Comparable<Node>{
		int to,weight;
		public Node(int to,int weight) {
			this.to=to;
			this.weight = weight;
		}
		@Override
		public int compareTo(Node o) {
			return Integer.compare(this.weight, o.weight);
		}
	}
	static List<Node>[] lists;
	static int[] dist;
	static int[] result;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		lists = new ArrayList[N+1];
		for(int i = 1;i<=N;i++) {
			lists[i] = new ArrayList<>();
		}
		dist = new int[N+1];
		result = new int[N+1];
		Arrays.fill(result, Integer.MAX_VALUE);
		
		for(int i = 0 ; i < M;i++) {
			st = new StringTokenizer(br.readLine());
			int A = Integer.parseInt(st.nextToken());
			int B = Integer.parseInt(st.nextToken());
			lists[A].add(new Node(B,1));
			lists[B].add(new Node(A,1));
		}
		for(int i = 1;i<=N;i++) {
			dijkstra(i);
		}
		int sum=Integer.MAX_VALUE;
		int answer =0;
//		System.out.println(Arrays.toString(result));
		for(int i = 1;i<=N;i++) {
			if(result[i]<sum) {
				sum=result[i];
				answer=i;
			}
		}
		System.out.println(answer);
	}
	static void dijkstra(int start) {
		Arrays.fill(dist, Integer.MAX_VALUE);
		boolean[] visited = new boolean[N+1];
		PriorityQueue<Node> pq = new PriorityQueue<>();
		pq.add(new Node(start,0));
		while(!pq.isEmpty()) {
			Node cur = pq.poll();
			visited[cur.to]=true;
			for(Node val : lists[cur.to]) {
				if(visited[val.to])continue;
				if(dist[val.to]>val.weight+cur.weight) {
					dist[val.to]=val.weight+cur.weight;
					pq.add(new Node(val.to,dist[val.to]));
				}
			}
		}
		for(int i = 1;i<=N;i++) {
			result[start]+=dist[i];
		}
	}
}
