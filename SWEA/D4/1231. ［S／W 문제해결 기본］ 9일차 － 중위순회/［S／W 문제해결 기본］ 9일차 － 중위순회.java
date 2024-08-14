
import java.util.*;
import java.io.FileInputStream;

class Solution
{
    static char[] arr; 
    static String answer="";
	public static void main(String args[]) throws Exception
	{
		Scanner sc = new Scanner(System.in);

		for(int test_case = 1; test_case <= 10; test_case++)
		{
            StringBuilder sb = new StringBuilder();
			
            int n = sc.nextInt();
            arr = new char[n+1];
            sc.nextLine();
            for(int i = 1;i<=n;i++){
            	String input = sc.nextLine();
            	String[] strArr = input.split(" ");
//            	System.out.println(input);
            	
                arr[i] =strArr[1].charAt(0);
//                System.out.println(arr[i]);
            }
            inOrder(1);
            
            
            sb.append("#").append(test_case).append(" ").append(answer);
            System.out.println(sb);
            answer="";
		}
	}
    static void inOrder(int root){
        if(root >= arr.length || arr[root]==0){
        	return;
        }
    	inOrder(root*2);
        answer+=arr[root];
        inOrder(root*2+1);
    }
}