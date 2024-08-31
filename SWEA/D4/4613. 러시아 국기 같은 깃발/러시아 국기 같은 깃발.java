
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
            String[][] map = new String[n][m];
            for(int i =0;i<n;i++){
                String input = sc.next();
                for(int j = 0 ; j <m;j++){
                    map[i][j]=input.charAt(j)+"";
                }
            }
            int answer=Integer.MAX_VALUE;
            for(int i = 0 ;i<n-2;i++){
                for(int j = i+1;j<n-1;j++){
                    int result=0;
                    for(int a=0;a<=i;a++){
                        for(int b = 0;b<m;b++){
                            if(!(map[a][b].equals("W"))){
                                result++;
                            }
                        }
                    }
                    for(int a=i+1;a<=j;a++){
                        for(int b = 0;b<m;b++){
                            if(!(map[a][b].equals("B"))){
                                result++;
                            }
                        }
                    }
                    for(int a=j+1;a<n;a++){
                        for(int b = 0;b<m;b++){
                            if(!(map[a][b].equals("R"))){
                                result++;
                            }
                        }
                    }
                    answer=Math.min(answer,result);
                }
            }
            System.out.println("#"+test_case+" "+answer);
        }
    }
}