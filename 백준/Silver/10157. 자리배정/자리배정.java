import java.util.*;

public class Main {

    static int[] dx = {-1,0,1,0};
    static int[] dy = {0,1,0,-1};
    static int startX;
    static int startY,r,c,pointer;
    static int[][] map;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
         c = scanner.nextInt();
         r = scanner.nextInt();
        int k = scanner.nextInt();
        map = new int[r][c];
         startX =r-1;
         startY =0;
         pointer = 0;
         map[startX][startY] = 1;
         boolean flag = true;
        for (int i = 2; i <= c*r; i++) {
            point(startX,startY,i);
            if (i == k) {
                int temp = startY+1;
                System.out.println(temp+ " " +(r-startX));
                flag=false;
                break;
            }
        }
        if (k==1) {
            System.out.println(1+ " " +1);
            flag=false;
        }
        if (flag)
        System.out.println(0);
    }

    private static void point(int x, int y, int i) {
        int nx = x + dx[pointer];
        int ny = y + dy[pointer];
        if (0 <= nx && nx < r && 0 <= ny && ny < c && map[nx][ny] == 0) {
            startX = nx;
            startY = ny;
            map[nx][ny] = i;
        } else {
            pointer = pointer + 1;
            pointer %= 4;
            nx = x + dx[pointer];
            ny = y + dy[pointer];
            if (0 <= nx && nx < r && 0 <= ny && ny < c && map[nx][ny] == 0) {
                startX = nx;
                startY = ny;
                map[nx][ny] = i;
            }
        }
    }
}