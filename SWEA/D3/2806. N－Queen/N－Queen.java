
import java.util.Scanner;
import java.io.FileInputStream;


class Solution
{
    static int n ;
    static int[] arr;
    static int answer;
	public static void main(String args[]) throws Exception
	{


		Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();


		for(int test_case = 1; test_case <= T; test_case++)
		{
	 n =sc.nextInt();
             answer=0;
            arr = new int[n];
            recur(0);
            System.out.println("#"+test_case+" "+answer);
		}
	}
    static void recur(int depth){
    	if(depth == n){
        	answer++;
            return;
        }
        for(int i = 0 ; i < n ; i++){
        	arr[depth]=i;
            if(promising(depth)){
            	recur(depth+1);
            }
        }
    }
    static boolean promising(int depth){
    	for(int i = 0; i<depth;i++){
            if(arr[depth]==arr[i]||Math.abs(arr[depth]-arr[i]) == depth-i){
            	return false;
            }
        	
        }
        return true;
    }
}