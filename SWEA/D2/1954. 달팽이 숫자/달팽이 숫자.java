import java.awt.image.ImageProducer;
import java.util.Collections;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Scanner;

class Solution {

    static int[] dx = {0, 1, 0, -1};
    static int[] dy = {1, 0, -1, 0};//우 하 좌 상
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int T
            = in.nextInt();
        for (int t = 1; t <= T; t++) {
            int n = in.nextInt();
            int[][] map = new int[n][n];
            int x = 0, y = 0;
            map[x][y] = 1;
            int cnt = 0;
            for (int i = 2; i <= n*n; i++) {
                int nx = x + dx[cnt%4];
                int ny = y + dy[cnt%4];
                if(!(0<=nx && nx<n && 0<=ny && ny<n) || map[nx][ny] != 0) {
                    cnt++;
                    nx = x+dx[cnt%4];
                    ny = y+dy[cnt%4];
                }
//                System.out.println(nx+" "+ny+" "+cnt);
                map[nx][ny] = i;
                x=nx;
                y=ny;
            }
            System.out.println("#"+t);
            for (int[] arr : map) {
                for (int i : arr) {
                    System.out.print(i + " ");
                }
                System.out.println();
            }
        }
    }
}
