import java.util.Scanner;
import java.io.FileInputStream;
class Solution
{
    static int N;
    static int B;
    static int answer;
    static int[] members;
    static boolean[] visited;
	public static void main(String args[]) throws Exception
	{
		Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();

		for(int test_case = 1; test_case <= T; test_case++)
		{
            N = sc.nextInt();
            visited = new boolean[N];
            members = new int[N];
            B = sc.nextInt();
            for(int i = 0 ; i <N;i++){
            	members[i] = sc.nextInt();
            }
            answer=Integer.MAX_VALUE;
			 recur(0,0);
			System.out.println("#"+test_case+" "+answer);
		}//tc
	}//main
    static int sum;
    static void recur(int depth,int at){
    	if(depth == N || sum>=B){
            answer = Math.min(answer,sum-B);
        	return;
        }
        
        for(int i =at;i<N;i++){
        	if(!visited[i]){
            	visited[i] = true;
                sum+=members[i];
                recur(depth+1,i);
                sum-=members[i];                
                visited[i]=false;
            }
        }
    }
}