
import java.util.*;
import java.io.FileInputStream;


class Solution
{
    static int N;
    static int B;
    static int[] arr;
    static boolean visited[];
    static int answer;
	public static void main(String args[]) throws Exception
	{

		Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();

		for(int test_case = 1; test_case <= T; test_case++)
		{
		N=sc.nextInt();B=sc.nextInt();
            arr = new int[N];
            answer =Integer.MAX_VALUE;
            for(int i = 0;i<N;i++){
            	arr[i] = sc.nextInt();
            }
            sum=0;
            visited = new boolean[N];
            recur(0,0);
            System.out.println("#"+test_case+" "+answer);
		}//tc
	}//main
    static int sum;
    static void recur(int depth,int cnt){
    	if(depth==N|| sum-B>=0){
        	answer = Math.min(answer,sum-B);
        }
        for(int i=cnt;i<N;i++){
        	if(!visited[i]){
            	visited[i] = true;
                sum+=arr[i];
                recur(depth+1,i);
                sum-=arr[i];
                visited[i]=false;
            }
        }
    }
}