import java.util.Scanner;
import java.io.FileInputStream;
class Solution
{
    static char[] c;
    static int n;
    static int answer;
    public static void main(String args[]) throws Exception
    {
        Scanner sc = new Scanner(System.in);
        int T;
        T=sc.nextInt();

        for(int test_case = 1; test_case <= T; test_case++)
        {
            initInput(sc);
            if (n > c.length) {
                n = c.length;
            }
            recur(0);
            System.out.println("#"+test_case+" "+answer);
        }
    }

    static void recur(int depth){
        if(depth==n){
            answer=Math.max(answer,Integer.parseInt(new String(c)));
            return;
        }
        for(int i=0;i<c.length;i++){
            for(int j=i+1;j<c.length;j++){
                swap(j, i);
                recur(depth+1);
                swap(j, i);
            }
        }
    }

    private static void swap(int depth, int i) {
        char tmp = c[i];
        c[i] = c[depth];
        c[depth] = tmp;
    }

    private static void initInput(Scanner sc) {
        String input = sc.next();
        n = sc.nextInt();
        c = input.toCharArray();
        answer=0;
    }
}

