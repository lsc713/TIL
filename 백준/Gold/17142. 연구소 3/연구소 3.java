import java.io.*;
import java.util.*;

public class Main {

    static int n;
    static int m;
    static int[][] map;
    static int empty;
    static int answer=Integer.MAX_VALUE;
    static List<int[]> virusList=new ArrayList<>();
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        m = scanner.nextInt();
        map=new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                map[i][j] = scanner.nextInt();
                if (map[i][j]==2){
                    virusList.add(new int[]{i,j});
                    empty++;
                }
                if (map[i][j]==0){
                    empty++;
                }
            }
        }
        empty-= virusList.size();

        dfs(0,0,new int[m]);

        System.out.println(answer==Integer.MAX_VALUE? -1 : answer);
    }
    static int[] dx = {-1,0,1,0};
    static int[] dy = {0,-1,0,1};
    static void dfs(int depth, int at, int[] selected){
        if (depth==m){
            bfs(selected);
            return;
        }
        for (int i = at; i < virusList.size(); i++) {
            selected[depth]=i;
            dfs(depth+1,i+1,selected);
        }
    }
    static void bfs(int[] selected) {
        Queue<int[]> q = new LinkedList<>();
        boolean[][] visited = new boolean[n][n];
        int[][] time = new int[n][n];
        for (int i = 0; i < n; i++) {
            Arrays.fill(time[i],-1);
        }
        for(int i : selected){
            int[] tmp = virusList.get(i);
            int x = tmp[0];
            int y = tmp[1];
            q.add(new int[]{x,y,0});
            visited[x][y] = true;
        }
        int vispace=0;
        int minTime=0;
        while(!q.isEmpty()){
            int[] tmp = q.poll();
            int x = tmp[0];
            int y = tmp[1];
            int t = tmp[2];
            for (int i=0;i<4;i++){
                int nx=x+dx[i];
                int ny=y+dy[i];
                if (0<=nx&&nx<n&&0<=ny&&ny<n&&time[nx][ny]==-1&&map[nx][ny]!=1){
                    visited[nx][ny] = true;
                    time[nx][ny]=t+1;
                    q.add(new int[]{nx, ny,t+1});
                    if (map[nx][ny]==0){
                      vispace++;
                      minTime=t+1;
                    }
                }
            }
        }
        if (empty==vispace){
            answer=Math.min(answer,minTime);
        }
    }
}