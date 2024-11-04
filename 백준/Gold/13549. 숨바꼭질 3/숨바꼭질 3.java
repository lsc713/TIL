

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
	static class Node{
		int idx;
		int time;
		public Node(int idx,int time) {
			this.idx = idx;
			this.time = time;
		}
		@Override
		public String toString() {
			return "Node [idx=" + idx + ", time=" + time + "]";
		}
		
	}
	static int n,k,time=Integer.MAX_VALUE;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		k = sc.nextInt();
		
		bfs(n);
		
		System.out.println(time);
	}
	static int[] moveIdx = new int[] {2,-1,1};
	static int bfs(int idx) {
		Queue<Node> q = new LinkedList<>();
		boolean[] visited = new boolean[100001];
		visited[idx]=true;
		q.add(new Node(idx,0));
		while(!q.isEmpty()) {
			Node temp = q.poll();
			if(temp.idx==k) return time=Math.min(time,temp.time);
			for(int i = 0;i<3;i++) {
				int nextIdx;
				if(i==0) {
					nextIdx=temp.idx*2;
				}else {
					nextIdx=temp.idx+moveIdx[i];
				}
				if(nextIdx>=0 && nextIdx<=100000&&!visited[nextIdx]) {
					visited[nextIdx]=true;
					q.add(new Node(nextIdx,temp.time+(i==0?0:1)));
				}
			}
		}
		return -1;
	}
}
