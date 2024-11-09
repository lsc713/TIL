import java.util.*;
import java.io.*;

class Main {
    static int n;
    static int[][] map;
    static int answer = Integer.MAX_VALUE;
    static int totalsize=0;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
         n = scanner.nextInt();
         map=new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                map[i][j] = scanner.nextInt();
                totalsize+=map[i][j];
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                for (int d1 = 1; d1 < n; d1++) {
                    for (int d2 = 1; d2 < n; d2++) {
                        if(i+d1+d2>=n)continue;
                        if(j+d2>=n||j-d1<0)continue;
                        calculate(i, j, d1, d2);
                    }
                }
            }
        }
        System.out.println(answer);
    }

    static void calculate(int x, int y, int d1, int d2) {
        boolean[][] visited = new boolean[n][n];
        for (int i = 0; i <= d1; i++) {
            visited[x + i][y - i] = true;
            visited[x+d2+i][y+d2-i] = true;
        }
        for (int i = 0; i <= d2; i++) {
            visited[x+i][y+i] = true;
            visited[x+d1+i][y-d1+i] = true;
        }

        int[] sum = new int[5];
        for (int i = 0; i < x + d1; i++) {
            for (int j = 0; j <= y; j++) {
                if (visited[i][j]) {
                    break;}
                sum[0]+=map[i][j];
            }
        }
        for (int i = 0; i <= x + d2; i++) {
            for (int j = n-1; j >y;j--) {
                if (visited[i][j]) {
                    break;}
                sum[1]+=map[i][j];
            }
        }
        for (int i = x + d1; i < n; i++) {
            for (int j = 0; j < y - d1 + d2; j++) {
                if (visited[i][j]) {break;}
                sum[2]+=map[i][j];
            }
        }
        for (int i = x + d2+1; i < n; i++) {
            for (int j =n-1;j >=y-d1+d2;j--) {
                if (visited[i][j]) {break;}
                sum[3]+=map[i][j];
            }
        }
        sum[4] = totalsize;
        for (int i = 0; i < 4; i++) {
            sum[4]-=sum[i];
        }
        Arrays.sort(sum);
        answer = Math.min(answer, sum[4] - sum[0]);
    }
}