import java.util.Scanner;
import java.io.FileInputStream;

class Solution
{
    static int[] arr;
	public static void main(String args[]) throws Exception
	{

        Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();

		for(int test_case = 1; test_case <= T; test_case++)
		{
            StringBuilder sb = new StringBuilder();
            sb.append("#"+test_case+" ");
			int n =sc.nextInt();
            int m =sc.nextInt();
            arr = new int[n+1];
            for(int i =1;i<=n;i++){
            	arr[i] = i;
            }
            for(int i = 0 ; i < m;i++){
            	int a = sc.nextInt();
                int b = sc.nextInt();
                int c = sc.nextInt();
                if(a==0){
                	union(b,c);
                }else{
                	if(findSet(b)==findSet(c)){
                    	sb.append("1");
                    }else{
                    	sb.append("0");
                    }
                }
            }
            
			System.out.println(sb);
		}
	}
    static int findSet(int x){
        if(x!=arr[x]){
        	arr[x] = findSet(arr[x]);
        }
    	return arr[x];
    }
    static void union(int x, int y){
    	arr[findSet(y)] = findSet(x);
    }
}