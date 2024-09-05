import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Solution {
	static int[] parent;
	static int n;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int tc =1;tc<=T;tc++) {
			n = sc.nextInt();
			int m =sc.nextInt();
			
			parent = new int[n+1];
			makeSet();
			
			for(int i = 0 ; i<m;i++) {
				int a =sc.nextInt();
				int b =sc.nextInt();
				
				if(findSet(a)!=findSet(b)) {
					union(a,b);
				}
			}
			int answer=0;
			for(int i = 1 ; i <=n;i++) {
				if(findSet(i)==i) {
					answer++;
				}
			}
			System.out.println("#"+tc+" "+answer);
		}
	}
	static void makeSet() {
		for(int i = 1 ; i <=n;i++) {
			parent[i] = i;//각 목의 주인은 본인
		}
	}
	
	static void union(int x,int y) {
		parent[findSet(y)] = findSet(x);
	}
	
	static int findSet(int x) {
		if(x!=parent[x]) {
			parent[x] = findSet(parent[x]);
		}
		return parent[x];
	}
}
