import java.util.*;
import java.io.FileInputStream;

class Solution
{
    static int n;
    static int map[][];
    static int[][] dist;
    static boolean[][] visited;
    static int INF = Integer.MAX_VALUE;
    static int[] dx ={-1,1,0,0};
    static int[] dy = {0,0,-1,1};
	public static void main(String args[]) throws Exception
	{
		Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();

		for(int test_case = 1; test_case <= T; test_case++)
		{
			n=sc.nextInt();
            dist = new int[n][n];
            visited = new boolean[n][n];
            for(int i = 0 ; i<n;i++){
            	Arrays.fill(dist[i],INF);
            }
            map= new int[n][n];
            for(int i = 0 ; i<n;i++){
                String input = sc.next();
            	for(int j = 0;j<n;j++){
                char c = input.charAt(j);
                    map[i][j] = c-'0';
                }
            }
            dijkstra();
            System.out.println("#"+test_case+" "+dist[n-1][n-1]);
		}//tc
	}//main
    static class Node implements Comparable<Node>{
    	int A,B,W;
        public Node(int A,int B, int W){
        	this.A=A;
            this.B=B;
            this.W=W;
        }
        @Override
        public int compareTo(Node o){
        	return Integer.compare(this.W,o.W);
        }
    }
    static void dijkstra(){
    	PriorityQueue<Node> pq = new PriorityQueue<>();
        dist[0][0]=0;
        visited[0][0]=true;
        pq.add(new Node(0,0,0));
        while(!pq.isEmpty()){
        	Node node = pq.poll();
            for(int i = 0 ; i<4;i++){
            	int nx = node.A+dx[i];
                int ny = node.B + dy[i];
                if(0<=nx&&nx<n&&0<=ny&&ny<n&&!visited[nx][ny]){
                	int nw = node.W+map[nx][ny];
                    if(dist[nx][ny]>nw){
                    	dist[nx][ny]=nw;
                        visited[nx][ny]=true;
                        pq.add(new Node(nx,ny,nw));
                    }
                }
            }
        }
    }
}