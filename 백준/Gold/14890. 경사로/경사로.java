import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        l = scanner.nextInt();
        map = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                map[i][j] = scanner.nextInt();
            }
        }
        int answer = 0;
        for (int i = 0; i < n; i++) {
            if (check(i, 0, 0)) answer++;
            if (check(0, i, 1)) answer++;
        }
        System.out.println(answer);
    }

    static int n, l;
    static int[][] map;

    static boolean check(int x, int y, int k) {
        int[] heights = new int[n];
        boolean[] visited = new boolean[n];

        for (int i = 0; i < n; i++) {
            heights[i] = (k == 0) ? map[x][i] : map[i][y];
        }

        for (int i = 0; i < n - 1; i++) {
            if (heights[i] == heights[i + 1]) continue; 

            int diff = heights[i] - heights[i + 1];

            if (Math.abs(diff) > 1) return false; 

            if (diff > 0) {
                for (int j = i + 1; j < i + 1 + l; j++) {
                    if (j < 0 || j >= n || heights[j] != heights[i + 1] || visited[j]) return false;
                    visited[j] = true;
                }
            }
            else {
                for (int j = i; j > i - l; j--) {
                    if (j < 0 || j >= n || heights[j] != heights[i] || visited[j]) return false;
                    visited[j] = true;
                }
            }
        }
        return true;
    }
}
