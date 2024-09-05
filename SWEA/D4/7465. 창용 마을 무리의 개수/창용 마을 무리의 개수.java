import java.util.Scanner;
import java.io.FileInputStream;

class Solution
{
    static int answer;
    static int[] arr;
	public static void main(String args[]) throws Exception
	{
		Scanner sc = new Scanner(System.in);
		int T;
        
		T=sc.nextInt();
		
		for(int test_case = 1; test_case <= T; test_case++)
		{
            answer=0;
			int n =sc.nextInt();
            arr = new int[n+1];
            int m = sc.nextInt();
            for(int i = 1;i<=n;i++){
            	makeSet(i);
            }
            for(int i = 0 ;i<m;i++){
            	int a = sc.nextInt();
                int b= sc.nextInt();
                if(findSet(a) != findSet(b)){
                	union(a,b);
                }
            }
            for(int i =1;i<=n;i++){
            	if(arr[i] == i){
                answer++;
                }
            }
            
            System.out.println("#"+test_case+" "+answer);
		}
	}
    static int findSet(int x){
    	if(x!=arr[x]){
        	arr[x] = findSet(arr[x]);
        }
        return arr[x];
    }
    static void union(int x,int y){
    	arr[findSet(y)] = findSet(x);
    }
    static void makeSet(int x){
    	arr[x] = x;
    }
}