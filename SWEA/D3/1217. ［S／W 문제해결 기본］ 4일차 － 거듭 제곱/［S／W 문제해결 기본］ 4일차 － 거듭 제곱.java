
import java.util.Scanner;


class Solution
{
    static int m,l,answer;
	public static void main(String args[]) throws Exception
	{

		Scanner sc = new Scanner(System.in);


		for(int test_case = 1; test_case <= 10; test_case++)
		{
		int n = sc.nextInt();
            m =sc.nextInt();
            l=sc.nextInt();
            answer=1;
            recur(0);

            System.out.println("#"+n+" "+answer);
		}
	}
    static void recur(int depth){
    	if(depth==l){
        	return;
        }
        answer*=m;
        recur(depth+1);
    }
}