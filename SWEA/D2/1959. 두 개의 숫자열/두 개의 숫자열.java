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
		int n =sc.nextInt();
		int temp =n;
		
            int m = sc.nextInt();
            int temp1=m;
            int[] arr = new int[n];
            int[] arr1 = new int[m];
            for(int i = 0 ; i <n;i++){
        		arr[i] = sc.nextInt();
            }
            for(int i = 0 ; i <m;i++){
        		arr1[i]=sc.nextInt();
            }
            if(n>m) {
            	int tmp = n;
            	n=m;
            	m=tmp;
            	int[] arr2=arr;
            	arr=arr1;
            	arr1=arr2;
            }
            int answer=0;
            for(int i = 0 ; i <m-n+1;i++){
                int result = 0;
            	for(int j = 0 ; j<n;j++){
                	result+=arr[j]*arr1[j+i];
                }
                answer=Math.max(result,answer);
            }
			StringBuilder sb = new StringBuilder();
            
            sb.append("#"+test_case+" "+answer);
            System.out.println(sb);
		}
	}
}