import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
class Main{

    static int sharkX,sharkY,minX,minY,minDist;
    static int[] dx = {-1,0,1,0};
    static int[] dy = {0,-1,0,1};
    static int[][] fish;
    static int n,time;
    static int size=2;
    static int sharkStack=0;
    static int[][] map;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        time =0;
        map=new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                map[i][j] = scanner.nextInt();
                if (map[i][j]==9){
                    sharkX=i;
                    sharkY=j;
                    map[i][j]=0;
                }
            }
        }
        while(true){
            fish=new int[n][n];
            minX=Integer.MAX_VALUE;
            minY=Integer.MAX_VALUE;
            minDist=Integer.MAX_VALUE;

            bfs(sharkX, sharkY);

            if (minX != Integer.MAX_VALUE && minY != Integer.MAX_VALUE) {
                sharkStack++;
                map[minX][minY] = 0;
                sharkX = minX;
                sharkY = minY;
                time += fish[minX][minY];

                if (sharkStack == size) {
                    size++;
                    sharkStack = 0;
                }
            } else {
                break;
            }

        }

        System.out.println(time);
    }

    private static void bfs(int sharkX, int sharkY) {
        Queue<Pos> q = new LinkedList<>();
        q.add(new Pos(sharkX, sharkY));
        while (!q.isEmpty()) {
            Pos pos = q.poll();
            int x = pos.x;
            int y = pos.y;
            for (int i = 0; i < 4; i++) {
                int nx = x + dx[i];
                int ny = y + dy[i];
                if(0<=nx&&nx<n&&0<=ny&&ny<n&&map[nx][ny]<=size&&fish[nx][ny]==0){
                    fish[nx][ny]=fish[x][y]+1;
                    if (map[nx][ny] != 0 && map[nx][ny] < size) {
                        if(minDist>fish[nx][ny]){
                            minDist=fish[nx][ny];
                            minX=nx;
                            minY=ny;
                        }else if (minDist == fish[nx][ny]) {
                            if (minX==nx){
                                if (minY > ny) {
                                    minX=nx;
                                    minY=ny;
                                }
                            } else if (minX > nx) {
                                minX = nx;
                                minY = ny;
                            }
                        }
                    }
                    q.add(new Pos(nx, ny));
                }
            }
        }
    }
    static class Pos{
        int x,y;
        public Pos(int x,int y){
            this.x=x;
            this.y=y;
        }
    }
}