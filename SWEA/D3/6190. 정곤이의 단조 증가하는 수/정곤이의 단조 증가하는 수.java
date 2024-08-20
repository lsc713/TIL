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
            StringBuilder sb = new StringBuilder();
			int n =sc.nextInt();
            int answer=-1;
            int[] arr = new int[n];
            for(int i = 0 ; i < n ; i++){
            	arr[i] = sc.nextInt();
            }
            
            for(int i = 0 ; i <n-1;i++){
            	loop:for(int j =i+1;j<n;j++){
                	int temp = arr[i]*arr[j];
                    int tmp = temp;
                    while(temp!=0){
                        if(temp%10<temp/10%10){
                        	continue loop;
                        }else{
                        	temp/=10;
                        }
                    }
                    answer=Math.max(tmp,answer);
                }
            }
            
            sb.append("#"+test_case+" "+answer);
            System.out.println(sb);
            
		}
	}
}