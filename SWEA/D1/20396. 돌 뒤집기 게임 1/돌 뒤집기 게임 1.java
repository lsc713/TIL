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
            int m =sc.nextInt();
            int[] arr = new int[n+1];
            for(int i = 1 ;i<=n;i++){
                arr[i] = sc.nextInt();
            }
//            System.out.println(Arrays.toString(arr));
            for(int i = 0 ; i<m;i++){
                int a = sc.nextInt();
                int b = sc.nextInt();
                int idx = a+b;
                if(a+b>=n+1){
                    idx = n+1;
                }
                for(int j = a+1;j<idx;j++){

                    if(arr[a] != arr[j]){
//                        System.out.println("?");
                        arr[j]=1-arr[j];
                    }
                }
            }

            System.out.print("#"+test_case+" ");
            for(int i = 1;i<=n;i++){
                System.out.print(arr[i]+" ");
            }
            System.out.println();
        }
    }
}