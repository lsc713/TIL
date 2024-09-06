import java.util.*;
import java.io.FileInputStream;

class Solution
{
    static int len,st,answer;
    static boolean visited[];
    static class Node{
    	int B,W;
        public Node(int B,int W){
        	this.B = B;
            this.W= W;
        }
    }
    static List<Node>[] arr;
	public static void main(String args[]) throws Exception
	{
		Scanner sc = new Scanner(System.in);

		for(int test_case = 1; test_case <= 10; test_case++)
		{
len = sc.nextInt();
            st = sc.nextInt();
            arr = new ArrayList[101];
            visited = new boolean[101];
            for(int i = 1 ; i < 101;i++){
            	arr[i] = new ArrayList<>();
            }
            for(int i =0;i<len/2;i++){
            	int from = sc.nextInt();
                int to = sc.nextInt();
                arr[from].add(new Node(to,1));
            }
            answer=find(st);
            System.out.println("#"+test_case+" "+answer);
		}//tc
	}//main
    static Queue<Integer> q = new LinkedList<>();
    static int find(int st){
    	q.add(st);
        visited[st]=true;
        int max =0;
        while(!q.isEmpty()){
            int size = q.size();
				int curr = 0;

            for(int i = 0 ; i < size;i++){
        		int tmp = q.poll();                
                curr = Math.max(curr,tmp);
                for(Node node : arr[tmp]){
            		if(!visited[node.B]){
                		q.add(node.B);
                    	visited[node.B]=true;
                	}
	            }
            }
	max = curr;
        }
        return max;
    }//find
}