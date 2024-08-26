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
            int m =sc.nextInt();
            String answer="ON";
            String str = Integer.toBinaryString(m);
            int length = str.length();
            if(n>length){
                answer = "OFF";
            }else{
                for(int i=0;i<n;i++){
                    if(str.charAt(str.length()-1-i)=='0'){
                        answer="OFF";
                        break;
                    }
                }
            }
            System.out.println("#"+test_case+" "+answer);

        }
    }
}