import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

class Main {
    static int[][] map;
    static int n,m;
    static class Node{
        int x,y,result;
        int chance;
        public Node(int x,int y,int result,int chance){
            this.x = x;
            this.y = y;
            this.result = result;
            this.chance = chance;
        }

        @Override
        public String toString() {
            return x+","+y+","+result+","+chance;
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
         n = Integer.parseInt(st.nextToken());
         m = Integer.parseInt(st.nextToken());
         visited = new boolean[n][m][2];
         map = new int[n][m];
        for (int i = 0; i < n; i++) {
            String input = br.readLine();
            for (int j = 0; j < m; j++) {
                map[i][j] = input.charAt(j)-'0';
            }
        }
        Node node = new Node(0, 0,1, 1);
        answer =recur(node);
        System.out.println(answer);
    }
    static int answer = Integer.MAX_VALUE;
    static boolean[][][] visited;
    static int[] dx = {-1, 0, 1, 0};
    static int[] dy = {0, -1, 0, 1};
    static int recur(Node node){
        Queue<Node> q = new LinkedList<>();
        q.add(node);
        boolean[][][] visited = new boolean[n][m][2];
        visited[node.x][node.y][node.chance]=true;
        while(!q.isEmpty()){
            Node cur = q.poll();
            if (cur.x==n-1 && cur.y==m-1){
                return answer=Math.min(cur.result,answer);
            }
            for (int i = 0; i < 4; i++) {
                int nx = cur.x+dx[i];
                int ny = cur.y+dy[i];
                if(!isIn(nx,ny)||visited[nx][ny][cur.chance])continue;
                if (map[nx][ny] == 0&&!visited[nx][ny][cur.chance]) {
                    visited[nx][ny][cur.chance] = true;
                    q.add(new Node(nx,ny,cur.result+1,cur.chance));
                }else if (map[nx][ny] == 1 && cur.chance==1&&!visited[nx][ny][cur.chance]) {
                    visited[nx][ny][cur.chance] = true;
                    q.add(new Node(nx,ny,cur.result+1,0));
                }
            }
        }
        return -1;
    }
    static boolean isIn(int x,int y){
        return x>=0&&x<n&&y>=0&&y<m;
    }
}