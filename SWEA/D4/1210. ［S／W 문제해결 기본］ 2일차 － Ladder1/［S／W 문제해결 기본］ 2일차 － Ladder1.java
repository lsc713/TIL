import java.awt.image.ImageProducer;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Scanner;

class Solution {

    static int[] dx = {0,  0, -1};
    static int[] dy = {1,  -1, 0};//우 좌 상

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        for (int t = 1; t <= 10; t++) {
            int map[][] = new int[100][100];
            in.nextInt();
            int st = 0;
            int sx =0;
            int sy = 0;
            for (int i = 0; i < 100; i++) {
                for (int j = 0; j < 100; j++) {
                    map[i][j] = in.nextInt();
                    if (map[i][j] == 2) {
                        st = map[i][j];
                        sx = i;
                        sy = j;
                    }
                }
            }
//            System.out.println(sx+" "+sy);
            int answer=0;
            loop: while (sx != 0){
                int cnt=0;
                for (int i = 0;i<3;i++){
                    int nx = sx + dx[cnt%3];
                    int ny = sy + dy[cnt%3];
                    if (!(0<=nx && nx<100 && 0<=ny && ny<100)|| map[nx][ny]==0) {
                        cnt++;
                    }else if (map[nx][ny]==1) {
                        map[sx][sy]=0;
                        sx = nx;
                        sy = ny;
                        continue loop;
                    }
//                    System.out.println(map[sx][sy]+" "+sx+" "+sy+" "+nx+" "+ny);

                }
            }
            System.out.println("#"+t+" "+sy);
        }//tc
    }//main
}
