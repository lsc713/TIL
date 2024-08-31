
import java.util.Arrays;
import java.util.Scanner;
import java.io.FileInputStream;


class Solution
{

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        int T=sc.nextInt();
        for(int t=1;t<=T;t++){
            String answer = "yes";
            int minx=Integer.MAX_VALUE;
            int miny=Integer.MAX_VALUE;
            int maxx=0;
            int maxy=0;
            int n = sc.nextInt();

            String[][] map= new String[n][n];
            for(int i=0;i<n;i++){
                String input = sc.next();
                for(int j=0;j<n;j++){
                    map[i][j] = input.charAt(j)+"";

                }
            }
            for(int i=0;i<n;i++){
                for(int j=0;j<n;j++){
                    if(map[i][j].equals("#")){
                        minx = Math.min(minx, i);
                        miny = Math.min(miny, j);
                        maxx = Math.max(maxx, i);
                        maxy = Math.max(maxy, j);
                    }
                }
            }
//            for (String[] strings : map) {
//                System.out.println(minx + " " + miny + " " + maxx + " " + maxy);
////                System.out.println(Arrays.toString(strings));
//            }
            loop:for(int i = minx;i<=maxx;i++){
                for(int j = miny;j<=maxy;j++){
                    if (!(map[i][j].equals("#"))) {
                        answer = "no";
                        continue loop;
                    }
                }
            }
            if (minx == Integer.MAX_VALUE){
                answer = "no";
            }
            if (!(maxx-minx == maxy-miny)){
                answer = "no";
            }
            System.out.println("#"+t+" " +answer);
        }

    }
}