import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T  = scanner.nextInt();
        for (int t = 1; t <= T; t++) {
             n = scanner.nextInt();
             m = scanner.nextInt();
            int r = scanner.nextInt();
            int c = scanner.nextInt();
             l = scanner.nextInt();
            map = new int[n][m];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    map[i][j] = scanner.nextInt();
                }
            }
            int result = bfs(r,c);
            System.out.println("#"+t+" "+result);
        }
    }
    static int[][] map;
    static class Position{
        int r,c,l,answer;
        public Position(int r,int c,int l){
            this.r = r;
            this.c = c;
            this.l = l;
        }
    }
    static int n,m,l;
    static int[] dx = {-1,0,1,0};
    static int[] dy = {0,-1,0,1};
    static int bfs(int r, int c) {
        Queue<Position> queue = new LinkedList<>();
        queue.add(new Position(r,c,1));
        boolean[][] visited = new boolean[n][m];
        visited[r][c] = true;
        int max = 1;
        while (!queue.isEmpty()) {
            Position p = queue.poll();
            max = Math.max(max,p.answer);
            if (p.l == l) {
                continue;
            }
            int type = map[p.r][p.c];
            for (int i = 0; i < 4; i++) {
                if(canMove(type,i)){
                    int nx = p.r + dx[i];
                    int ny = p.c + dy[i];
                    if(0<=nx&&nx<n&&0<=ny&&ny<m&&map[nx][ny]!=0&&!visited[nx][ny]){
                        if(canConnect(i,map[nx][ny])){
                            visited[nx][ny] = true;
                            queue.add(new Position(nx,ny,p.l+1));
                            max++;
                        }
                    }
                }
            }
        }
        return max;
    }

    static boolean canMove(int type,int direction){
        switch (type) {
            case 1 : 
                return true;
            case 2 :
                return direction == 0 || direction == 2;
            case 3 :
                return direction == 1 || direction == 3;
            case 4 :
                return direction == 0 || direction == 3;
            case 5 :
                return direction == 2 || direction == 3;
            case 6 :
                return direction == 1 || direction == 2;
            case 7 :
                return direction == 0 || direction == 1;
            default :
                return false;
        }
    }

    static boolean canConnect(int from,int to){
        int opposite = (from+2)%4;
        return canMove(to,opposite);
    }
}
