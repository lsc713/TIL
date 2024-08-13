import java.util.*;
import java.io.FileInputStream;

class Solution
{
	public static void main(String args[]) throws Exception
	{
		
		Scanner sc = new Scanner(System.in);
//		Scanner sc = new Scanner(new FileInputStream("input (2).txt"));
		
	

		for(int test_case = 1; test_case <= 10; test_case++)
		{
            StringBuilder sb = new StringBuilder();
			String answer="";
			int n = sc.nextInt();
			List<Integer> arr = new ArrayList<>();
			for(int i = 0 ; i<n;i++) {
				arr.add(sc.nextInt());	
			}
			int m = sc.nextInt();
			sc.nextLine();
			String str = sc.nextLine();
			
			String[] strArr = str.split(" ");
			for(int i  = 0 ; i<strArr.length;i++) {
				if(strArr[i].equals("I")) {
					for(int j = 0 ; j<Integer.parseInt(strArr[i+2]);j++) {
//						System.out.println(strArr[i+3+Integer.parseInt(strArr[i+2])-1-j]);
						arr.add(Integer.parseInt(strArr[i+1]),Integer.parseInt(strArr[i+3+Integer.parseInt(strArr[i+2])-1-j]));
					}
				}else if(strArr[i].equals("D")) {
					for(int j = 0 ; j<Integer.parseInt(strArr[i+2]);j++) {
//						System.out.println(strArr[i+1]);
						arr.remove(Integer.parseInt(strArr[i+1]));
					}
				}else {
					continue;
				}
			}
			
			for(int i = 0 ; i <10;i++) {
				answer+=arr.get(i)+" ";
			}
			sb.append("#"+test_case+" "+answer.trim());
            System.out.println(sb);
		}
	}
}