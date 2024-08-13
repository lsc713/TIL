import java.util.Arrays;
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
            int temp= n;
            int answer=0;
            int cnt=0;
            StringBuilder sb = new StringBuilder();
            int[] arr = new int[10];
            int pyo=0;
            loop:while(pyo!=1){
                if(cnt>0){
                	
                	n+=temp;
                }
            	String tmp = String.valueOf(n);
            	String[] strArr = tmp.split("");
            	for(int i=0;i<strArr.length;i++){
            		arr[Integer.parseInt(strArr[i])]++;
            	}
            	cnt++;
            	for(int i = 0 ; i <arr.length;i++){
            		if(arr[i] ==0){
                    	
                		continue loop;
                	}
            	}
            	pyo=1;
            }
            answer=cnt*temp;
            sb.append("#").append(test_case).append(" ").append(answer);
            System.out.println(sb);
		}
	}
}