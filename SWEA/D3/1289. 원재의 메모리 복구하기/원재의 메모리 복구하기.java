import java.util.Scanner;
import java.io.FileInputStream;

class Solution
{
	public static void main(String args[]) throws Exception
	{

		Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();
sc.nextLine();
		for(int test_case = 1; test_case <= T; test_case++)
		{
            int answer=0;
            StringBuilder sb = new StringBuilder();
		String input = sc.nextLine();
            char[] arr = input.toCharArray();
            for(int i = 0 ; i < arr.length;i++){
            	if(arr[i]=='1'){
                	answer++;
                    for(int j =i+1;j<arr.length;j++){
                    	if(arr[j]=='1'){
                        	arr[j]='0';
                        }else{
                            arr[j]='1';
                        }
                    }
                }
            }
            sb.append("#"+test_case+" " +answer);
            System.out.println(sb);
		}
	}
}