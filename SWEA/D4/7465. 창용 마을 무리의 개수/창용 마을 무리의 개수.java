import java.util.*;
import java.io.FileInputStream;

class Solution
{
    static int n;
    static int m;
    static List<Integer>[] arr;
    static boolean visited[];
    static int answer;
	public static void main(String args[]) throws Exception
	{
		Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();

		for(int test_case = 1; test_case <= T; test_case++)
		{
			n=sc.nextInt();
            m =sc.nextInt();
            answer=0;
			arr = new ArrayList[n+1];
            visited = new boolean[n+1];
            
            for(int i = 1;i<=n;i++){
            	arr[i] = new ArrayList<>();
            }
            for(int i = 0 ; i < m;i++){
                int a = sc.nextInt();
                int b =sc.nextInt();
            	arr[a].add(b);
                arr[b].add(a);
            }
            for(int i =1;i<=n;i++){
            	if(!visited[i]){
                	dfs(i);
                    answer++;
                }
            }
            System.out.println("#"+test_case+" "+answer);
		}
	}
    static void dfs(int idx){
    	visited[idx]=true;
        for(int val : arr[idx]){
        	if(!visited[val]){
            	dfs(val);
            }
        }
    }
}