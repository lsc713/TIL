import java.util.*;

public class Main {
    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};
    static int[][] grid;
    static int n, m;
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        grid = new int[n][m];
        int cnt = 0;
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                grid[i][j] = sc.nextInt();
                if (grid[i][j] == 1) {
                    cnt++;
                }
            }
        }
        
        int time = 0;
        int lastMelted = 0;
        
        while (cnt > 0) {
            // 매 턴 시작 시 외곽 연결된 0 표시
            boolean[][] isOutside = markOutsideZeros();
            
            int[][] temp = new int[n][m];
            int melt = 0;
            
            for (int i = 0; i < n; i++) {
                System.arraycopy(grid[i], 0, temp[i], 0, m);
            }
            
            for (int i = 1; i < n - 1; i++) {
                for (int j = 1; j < m - 1; j++) {
                    if (grid[i][j] == 1 && hasOutsideZero(i, j, isOutside)) {
                        temp[i][j] = 0;
                        melt++;
                    }
                }
            }
            
            grid = temp;
            cnt -= melt;
            time++;
            
            if (cnt == 0) {
                lastMelted = melt;
            }
        }
        
        System.out.println(time + " " + lastMelted);
    }
    
    // BFS로 외곽과 연결된 0 표시
    static boolean[][] markOutsideZeros() {
        boolean[][] isOutside = new boolean[n][m];
        Queue<int[]> queue = new LinkedList<>();
        
        // 테두리의 0을 시작점으로
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if ((i == 0 || i == n - 1 || j == 0 || j == m - 1) && grid[i][j] == 0) {
                    queue.offer(new int[]{i, j});
                    isOutside[i][j] = true;
                }
            }
        }
        
        // BFS로 연결된 모든 0 탐색
        while (!queue.isEmpty()) {
            int[] cur = queue.poll();
            int x = cur[0], y = cur[1];
            
            for (int d = 0; d < 4; d++) {
                int nx = x + dx[d];
                int ny = y + dy[d];
                
                if (nx < 0 || nx >= n || ny < 0 || ny >= m) continue;
                if (isOutside[nx][ny]) continue;
                if (grid[nx][ny] == 1) continue;
                
                isOutside[nx][ny] = true;
                queue.offer(new int[]{nx, ny});
            }
        }
        
        return isOutside;
    }
    
    // 외곽 연결된 0이 인접한지 확인
    static boolean hasOutsideZero(int x, int y, boolean[][] isOutside) {
        for (int i = 0; i < 4; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];
            
            if (grid[nx][ny] == 0 && isOutside[nx][ny]) {
                return true;
            }
        }
        return false;
    }
}
