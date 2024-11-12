import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

class Main {
    static int n,m;
    static int[][] map;
    static int[][] group;
    static Map<Integer,Integer> groupSize;
    static int groupNumber;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
         n = Integer.parseInt(st.nextToken());
         m = Integer.parseInt(st.nextToken());
         map = new int[n][m];
        group = new int[n][m];
        groupNumber=1;
        groupSize = new HashMap<>();
        for (int i = 0; i < n; i++) {
            String line = br.readLine();
            for (int j = 0; j < m; j++) {
                map[i][j] = line.charAt(j) - '0';
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if(map[i][j]==0&&group[i][j]==0){
                    bfs(i, j);
                }
            }
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (map[i][j] == 1) {
                    sb.append(count(i, j));
                }else{
                    sb.append(0);
                }
            }
            sb.append("\n");
        }
        System.out.println(sb);
    }

    static int[] dx = {-1, 0, 1, 0};
    static int[] dy = {0, -1, 0, 1};
    static void bfs(int x,int y) {
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[]{x,y});
        group[x][y] = groupNumber;
        int size =1;
        while (!queue.isEmpty()) {
            int[] cur = queue.poll();
            for(int k = 0; k < 4; k++) {
                int nx = cur[0] + dx[k];
                int ny = cur[1] + dy[k];
                if(0>nx||nx>=n||0>ny||ny>=m) continue;
                if(map[nx][ny]!=0||group[nx][ny]!=0)continue;
                group[nx][ny] = groupNumber;
                queue.add(new int[]{nx,ny});
                size++;
            }
        }
        groupSize.put(groupNumber, size);
        groupNumber++;
    }
    static int count(int x, int y) {
        boolean[] visited  = new boolean[groupNumber+1];
        int sum=1;
        for (int k=0;k<4;k++) {
            int nx =x+dx[k];
            int ny=y+dy[k];
            if(0>nx||nx>=n||0>ny||ny>=m)continue;
            if(map[nx][ny]==1)continue;
            int groupNumber = group[nx][ny];
            if (visited[groupNumber])continue;
            visited[groupNumber] = true;
            sum += groupSize.get(groupNumber);
        }
        return sum % 10;
    }
}