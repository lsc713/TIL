import java.util.*;
import java.io.FileInputStream;

class Solution
{
	public static void main(String args[]) throws Exception
	{
		
		Scanner sc = new Scanner(System.in);
		
	

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
			String[] strArr = str.split("I");
//			System.out.println(arr);
			for(int i = 0 ; i <strArr.length;i++) {
				strArr[i]=strArr[i].trim();
				if(strArr[i].equals("")) {
					continue;
				}
				String[] tempArr = strArr[i].split(" ");
				if(Integer.parseInt(tempArr[0])>=10) {
					continue;
				}
//				System.out.println(Arrays.toString(tempArr));
				for(int j = Integer.parseInt(tempArr[1])+1 ; j>=2;j--) {
					arr.add(Integer.parseInt(tempArr[0]),Integer.parseInt(tempArr[j]));
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