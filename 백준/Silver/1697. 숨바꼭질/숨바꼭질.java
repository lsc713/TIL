import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
	static class Node{
		int loc,sum;
		public Node(int loc,int sum) {
			this.loc = loc;
			this.sum=sum;
		}
	}
	static int n,k,answer=Integer.MAX_VALUE;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n =sc.nextInt();
		k = sc.nextInt();
		arr = new int[100001];
		recur(n);
		System.out.println(answer);
	
	}
	static int[] arr;
	static void recur(int idx) {
		boolean[] visited = new boolean[100001];
		Queue<Node> q = new LinkedList<>();
		q.add(new Node(idx,0));
		while(!q.isEmpty()) {
			Node cur = q.poll();
			int subin = cur.loc;
			int time = cur.sum;
			if(subin==k) {
				answer=Math.min(answer, time);
			}
			int[] move = new int[] {subin-1,subin+1,subin*2};
			for(int i = 0 ; i <3;i++) {
				if(0<=move[i]&&move[i]<100001&&!visited[move[i]]) {
					q.add(new Node(move[i],time+1));
					visited[move[i]]=true;
				}
			}
		}
	}
}
