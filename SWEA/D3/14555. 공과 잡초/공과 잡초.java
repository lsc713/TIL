import java.util.*;
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
		String input = sc.nextLine();
            String[] strArr = input.split("");
            Stack<String> stack = new Stack<>();
            for(int i = 0 ; i <strArr.length;i++){
            	stack.push(strArr[i]);
            }
            int cnt=0;
            while(!stack.isEmpty()){
            	String popItem = stack.pop();
                if(popItem.equals(")") && (stack.peek().equals("(") || stack.peek().equals("|"))){
                    stack.pop();
                    cnt++;
                }else if(!stack.isEmpty() && popItem.equals("|") && (stack.peek().equals("("))){
                    stack.pop();
                    cnt++;
                }
            }
            System.out.println("#"+test_case+" "+cnt);

		}
	}
}