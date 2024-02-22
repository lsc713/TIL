package org.example.array;

class Solution1 {
    private static final int[] dx = {0, 1, -1};
    private static final int[] dy = {1, 0, -1};

    public int[] solution(int n) {
        int[][] triangle = new int[n][n];
        int v = 1;
        int x = 0;
        int y = 0;
        int d = 0;

        while (true) {
            triangle[y][x] = v++;
            int nx = x + dx[d];
            int ny = y + dy[d];//이동
            if (nx >= n || ny >= n || nx < 0 || ny < 0 || triangle[ny][nx] != 0) { //방향전환로직
                d = (d + 1) % 3;
                nx = x + dx[d];
                ny = y + dy[d];
                if (nx >= n || ny >= n || nx < 0 || ny < 0 || triangle[ny][nx] != 0) break;//방향전환해도막히면 끝
            }
            x = nx;//방햐전환 후 이동.
            y = ny;
        }

        int[] result = new int[n * (n + 1) / 2];
        int index = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                result[index++] = triangle[i][j];
            }
        }
        return result;
    }
}