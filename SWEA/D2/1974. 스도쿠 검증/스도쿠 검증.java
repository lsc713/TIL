
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
            int[][] map = new int[9][9];
            for(int i =0;i<9;i++){
                for(int j = 0 ; j <9;j++){
                    map[i][j]=sc.nextInt();
                }
            }
            int answer=1;
            loop:for(int i =0;i<9;i++){
                int[] arr = new int[10];
                for(int j = 0 ; j <9;j++){
                    arr[map[i][j]]++;
                    if(arr[map[i][j]]==2){
                        answer=0;
                        break loop;
                    }
                }
                arr = new int[10];
                for(int j = 0 ; j <9;j++){
                    arr[map[j][i]]++;
                    if(arr[map[i][j]]==2){
                        answer=0;
                        break loop;
                    }
                }
            }
            for(int k=0;k<=6;k=k+3){
                int[] arr = new int[10];
                loop:for(int i =0+k;i<3+k;i++){
                    for(int j = 0+k ; j <3+k;j++){
                        arr[map[i][j]]++;
                        if(arr[map[i][j]]==2){
                            answer=0;
                            break loop;
                        }
                    }
//                    System.out.println(Arrays.toString(arr));
                }
            }
//            for (int[] ints : map) {
//                System.out.println(Arrays.toString(ints));
//            }


            System.out.println("#"+test_case+" "+answer);
        }
    }
}