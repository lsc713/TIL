import java.util.Scanner;

class Solution
{
	static int n,m,answer;
	static int[] arr;
	
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int T = sc.nextInt();
		for(int t=1;t<=T;t++) {
			n=sc.nextInt();
			m=sc.nextInt();
			answer=0;
			arr=new int[n+1];
			for(int i =1;i<=n;i++) {
				makeSet(i);
			}
			for(int i = 0 ; i <m;i++) {
				int a = sc.nextInt();
				int b = sc.nextInt();
				
				union(a,b);
			}
			for(int i = 1 ; i <=n;i++) {
				if(arr[i] == i)answer++;
			}
			System.out.println("#"+t+" "+answer);
		}//tc
	}//main
	static void makeSet(int i) {
		arr[i] = i;
	}
	static int findSet(int x) {
		if(x!=arr[x]) {
			arr[x] = findSet(arr[x]);
		}
		return arr[x];
	}
	static void union(int x,int y) {
		arr[findSet(y)] = findSet(x);
	}
}