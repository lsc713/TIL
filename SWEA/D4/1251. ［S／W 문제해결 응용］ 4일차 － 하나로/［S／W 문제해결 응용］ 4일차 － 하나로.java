import java.util.*;
import java.io.FileInputStream;

class Solution
{
    static class Edge implements Comparable<Edge>{
    	int A,B;
        double W;
        public Edge(int A,int B, double W){
        	this.A =A;
            this.B=B;
            this.W=W;
        }
        @Override
        public int compareTo(Edge o){
        	return Double.compare(this.W,o.W);
        }
    }
	public static void main(String args[]) throws Exception
	{
		Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();

		for(int test_case = 1; test_case <= T; test_case++)
		{
            int n =sc.nextInt();
           	int[][] map = new int[n][n];
            for(int i = 0;i<2;i++){
            	for(int j = 0 ; j<n;j++){
                	map[j][i]=sc.nextInt();
                }
            }
            double E = sc.nextDouble();
            List<Edge>[] list = new ArrayList[n];
            for(int i = 0 ; i<n;i++){
            	list[i] = new ArrayList<>();
            }
            double answer=0;
            for(int i = 0 ; i<n-1;i++){
            	for(int j=i+1;j<n;j++){
                	double len = Math.pow(map[i][0]-map[j][0],2)+Math.pow(map[i][1]-map[j][1],2);
                    list[i].add(new Edge(i,j,len));
                    list[j].add(new Edge(j,i,len));
                }
            }
            boolean[] visited = new boolean[n];
            PriorityQueue<Edge> pq = new PriorityQueue<>();
            pq.addAll(list[0]);
            visited[0]=true;
            int pick=1;
            while(pick!=n){
            	Edge edge = pq.poll();
                if(visited[edge.B])continue;
                visited[edge.B]=true;
                answer += edge.W*E;
                pick++;
                pq.addAll(list[edge.B]);
            }
            
            answer= Math.round(answer);
			System.out.println("#"+test_case+" "+(long)answer);
		}//tc
	}
}