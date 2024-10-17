import java.util.*;
class Main{

    static int n;
    static String[][] map;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        map = new String[n][n];
        for (int i = 0; i < n; i++) {
            String input = scanner.next();
            for (int j = 0; j < n; j++) {
                map[i][j] = input.charAt(j) + "";
            }
        }
        int result1 = ordinary(map);

        int result2 = extraOrdinary(map);
        System.out.println(result1+" "+result2);
    }

    private static int extraOrdinary(String[][] map) {
        boolean[][] visited = new boolean[n][n];
        int result=0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (!visited[i][j]) {
                    bfs2(i,j,map,map[i][j],visited);
                    result++;
                }
            }
        }
        return result;
    }

    private static int ordinary(String[][] map) {
        int result=0;
        boolean[][] visited = new boolean[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (!visited[i][j]) {
                    bfs(i,j,map,map[i][j],visited);
                    result++;
                }
            }
        }
        return result;
    }

    static int[] dx = {-1,0,1,0};
    static int[] dy = {0,-1,0,1};
    private static void bfs2(int i, int j, String[][] map, String s, boolean[][] visited) {
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[]{i,j});
        if(s.equals("R")||s.equals("G")){
            while (!queue.isEmpty()) {
                int[] poll = queue.poll();
                visited[poll[0]][poll[1]] = true;
                for (int k = 0; k < 4; k++) {
                    int x = poll[0] + dx[k];
                    int y = poll[1] + dy[k];
                    if(0<=x && x<n && 0<=y && y<n&& !visited[x][y]&&(map[x][y].equals("R")||map[x][y].equals("G"))){
                        visited[x][y] = true;
                        queue.add(new int[]{x,y});
                    }
                }
            }
        }else{
            while (!queue.isEmpty()) {
                int[] poll = queue.poll();
                visited[poll[0]][poll[1]] = true;
                for (int k = 0; k < 4; k++) {
                    int x = poll[0] + dx[k];
                    int y = poll[1] + dy[k];
                    if(0<=x && x<n && 0<=y && y<n&& !visited[x][y]&&map[x][y].equals(s)){
                        visited[x][y] = true;
                        queue.add(new int[]{x,y});
                    }
                }
            }
        }
    }
    private static void bfs(int i, int j, String[][] map, String key, boolean[][] visited) {
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[]{i,j});
        while (!queue.isEmpty()) {
            int[] poll = queue.poll();
            visited[poll[0]][poll[1]] = true;
            for (int k = 0; k < 4; k++) {
                int x = poll[0] + dx[k];
                int y = poll[1] + dy[k];
                if(0<=x && x<n && 0<=y && y<n&& !visited[x][y]&&map[x][y].equals(key)){
                    visited[x][y] = true;
                    queue.add(new int[]{x,y});
                }
            }
        }
    }
}