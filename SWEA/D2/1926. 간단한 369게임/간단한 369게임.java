import java.util.*;
import java.io.*;

/*
   사용하는 클래스명이 Solution 이어야 하므로, 가급적 Solution.java 를 사용할 것을 권장합니다.
   이러한 상황에서도 동일하게 java Solution 명령으로 프로그램을 수행해볼 수 있습니다.
 */
class Solution
{
	public static void main(String args[]) throws Exception
	{

		//Scanner sc = new Scanner(System.in);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
		String T;
		T=br.readLine();

        String answer="";
		for(int i = 1 ; i  <= Integer.parseInt(T);i++){
            String a = String.valueOf(i);
            if(!(a.contains("3")||a.contains("6")||a.contains("9"))){
            	answer+=i+" ";
            }else if(a.contains("33") || a.contains("66")|| a.contains("99")|| (a.contains("3")&&a.contains("6"))|| (a.contains("6")&&a.contains("9")) || (a.contains("3")&&a.contains("9"))){
                answer+="-- ";
            }else{
                
            	answer+="- ";
            }
        	
        }
		
        


        sb.append(answer);
        System.out.println(sb);
	}
}