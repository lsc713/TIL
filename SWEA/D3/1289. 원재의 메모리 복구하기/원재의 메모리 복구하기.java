import java.util.Scanner;
import java.io.FileInputStream;

class Solution
{
	public static void main(String args[]) throws Exception
	{

		Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();
		for(int test_case = 1; test_case <= T; test_case++)
		{
            String input = sc.next();
            StringBuilder sb = new StringBuilder();
            int answer=0;
            int change =0;
            for(int i = 0 ; i < input.length();i++){
            	if(input.charAt(i)-'0' != change){
                    answer++;
                	change = input.charAt(i)-'0';
                }
            }
			
            sb.append("#"+test_case+" " +answer);
            System.out.println(sb);
		}
	}
}