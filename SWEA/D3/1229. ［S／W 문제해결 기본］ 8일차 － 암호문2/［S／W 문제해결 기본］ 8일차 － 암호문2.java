import java.util.*;
import java.io.FileInputStream;

class Solution
{
    public static void main(String args[]) throws Exception
    {

        Scanner sc = new Scanner(System.in);
        for(int test_case = 1; test_case <= 10; test_case++)
        {
            int n = sc.nextInt();
            sc.nextLine();
            String input = sc.nextLine();
            List<String> strArr = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                strArr.add(input.split(" ")[i]);
            }

            int m = sc.nextInt();
            sc.nextLine();
            String add = sc.nextLine();
            String[] addArr = add.split(" ");
            for (int i = 0; i < addArr.length; i++) {
                if (addArr[i].equals("I")) {
                    for (int j = i+2+Integer.parseInt(addArr[i+2]); j >= i+3 ; j--) {
                        strArr.add(Integer.parseInt(addArr[i+1]),addArr[j]);
                    }
                }else if (addArr[i].equals("D")) {
                    for (int j = 0; j < Integer.parseInt(addArr[i+2]) ; j++) {
                        strArr.remove(Integer.parseInt(addArr[i+1]));
                    }
                }
            }
            String answer = "";
            for (int i = 0; i < 10; i++) {
                answer+=strArr.get(i)+" ";
            }
            System.out.println("#"+test_case+" "+ answer);
        }
    }
}