import java.util.*;
import java.io.FileInputStream;

class Solution
{
    static int[] weight;
    static int[] arr;
    static List<int[]> list;
    static int N;
    static int answer;
	public static void main(String args[]) throws Exception
	{

		Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();

		for(int test_case = 1; test_case <= T; test_case++)
		{
		N = sc.nextInt();
            weight = new int[N];
            arr = new int[N];
            list = new ArrayList<>();
            for(int i = 0 ; i <N;i++){
            	weight[i]=sc.nextInt();
            }
            answer=0;
            perm(0,new boolean[N]);
            for(int[] arr : list){
            	recur(0,0,0,arr);
            }
            System.out.println("#"+test_case+" "+answer);
		}//tc
	}//main
    static void perm(int depth,boolean[] visited){
    	if(depth==N){
        	list.add(arr.clone());
            return;
        }
        for(int i = 0 ; i < N;i++){
        	if(visited[i])continue;
            visited[i]=true;
            arr[depth]=weight[i];
            perm(depth+1,visited);
            visited[i]=false;
        }
    }
    static void recur(int depth,int left, int right,int[] arr){
        if(left<right)return;
    	if(depth==N){
            answer++;
        	return;
        }
        recur(depth+1,left+arr[depth],right,arr);
        recur(depth+1,left,right+arr[depth],arr);
    }
}