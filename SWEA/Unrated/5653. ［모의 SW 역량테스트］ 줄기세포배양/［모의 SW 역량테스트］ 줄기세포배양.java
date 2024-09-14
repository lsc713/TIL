import java.util.*;
import java.io.FileInputStream;

class Solution {

    static int N, M, K, answer;  // 맵크기와 시간.. 줄기세포 배양에 대해 비활성 - 활성의 개수. 비활성은 1초가 흐르고 비활성됨.
    static int[] dx = {-1, 1, 0, 0};  // 상하좌우 방향 (1: 상, 2: 하, 3: 좌, 4: 우)
    static int[] dy = {0, 0, -1, 1};  // 상하좌우 방향
    static int[][] map;
    static boolean[][] visited;
    //여기까진 어디에서나 볼 수 있는 입력. bfs를 쓴다면 q를 활용.

    static LinkedList<Cell> queue;

    //문제에서 요구하는 세포는 좌표 - 상태 - 생명주기를 보유. 또한 생명주기는 변경됨.
    static class Cell{
        int x, y;
        String status;
        int lifeTime;//동시번식 - 생명력이 높은 줄기 세포가 독차지.
        int tmp;

        public Cell(int x, int y, String status, int tmp, int lifeTime){
            this.x = x;
            this.y = y;
            this.status = status;
            this.tmp = tmp;
            this.lifeTime = lifeTime;
        }

        public void changeStatus(){
            if(status.equals("inActive")){
                if (--tmp==0){
                    status = "active";
                }
            }
            else if(status.equals("active")){
                if (++tmp == lifeTime) {
                    status = "death";
                }
            }
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        InitInput(T,scanner);
    }

    private static void InitInput(int T,Scanner scanner) {

        for (int t = 1; t <= T; t++) {
            N = scanner.nextInt();
            M = scanner.nextInt();
            K = scanner.nextInt();
            answer = 0;
            queue = new LinkedList<>();
            map = new int[N+2+K][M+2+K];//이론상 맵은 무한하지만 시간*2+길이 만큼 맵이 커지진 않는다.
            visited = new boolean[N+2+K][M+2+K];
            for (int i = K / 2 + 1; i < N + K / 2 + 1; i++) {
                for (int j = K / 2 + 1; j < M + K / 2 + 1; j++) {
                    map[i][j] = scanner.nextInt();
                    if(map[i][j] != 0){
                        queue.add(new Cell(i,j,"inActive",map[i][j],map[i][j]));
                        visited[i][j] = true;
                    }
                }
            }

            answer= bfs();

            System.out.println("#"+t+" "+answer);
        }
    }
    static int bfs() {
        int count = K;
        while(count-- > 0){
            int len = queue.size();
            for(Cell c : queue){
                if (c.status.equals("active")) {
                    check(c);
                }
            }
            for (int i = 0; i < len; i++) {
                Cell cell = queue.poll();
                if (cell.status.equals("active")) {
                    for (int j = 0; j < 4; j++) {
                        int nx = cell.x + dx[j];
                        int ny = cell.y + dy[j];
                        if (visited[nx][ny]){
                            continue;
                        }
                        queue.add(new Cell(nx,ny,"inActive",map[nx][ny],map[nx][ny]));
                        visited[nx][ny] = true;
                    }
                }
                cell.changeStatus();
                if (cell.status.equals("death")) {
                    continue;
                }
                queue.add(cell);
            }
        }
        return queue.size();
    }

    private static void check(Cell c) {
        for(int i =0; i<4;i++){
            int nx = c.x + dx[i];
            int ny = c.y + dy[i];
//            System.out.println(visited[nx][ny]);
            if (visited[nx][ny]){
                continue;
            }
            if (map[nx][ny] < c.lifeTime){
                map[nx][ny] = c.lifeTime;
            }
        }
    }
}
