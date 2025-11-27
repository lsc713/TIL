import java.util.Scanner;
public class Main {
    //UDLR
    static int[] dx = new int[]{-1,1,0,0};
    static int[] dy = new int[]{0,0,-1,1};
    //UDLR로 진행시
    static int[] mir1 = new int[]{3,2,1,0};
    static int[] mir2 = new int[]{2,3,0,1};
    static int n;
    static int[][] grid;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         n = sc.nextInt();
         grid = new int[n][n];
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                grid[i][j] = sc.nextInt();
        // Please write your code here.
        int cnt=0;
        for(int i =0;i<n;i++){
            int tmp = simul(i,-1,3);
            cnt= Math.max(tmp,cnt);
        }
        for(int j = 0 ; j < n;j++){
            int tmp = simul(-1,j,1);
            cnt= Math.max(tmp,cnt);
        }
        for(int j = 0 ; j < n;j++){
            int tmp = simul(n,j,2);
            cnt= Math.max(tmp,cnt);
        }
        for(int i = 0 ; i<n;i++){
            int tmp = simul(i,n,0);
            cnt= Math.max(tmp,cnt);
        }
        System.out.println(cnt);
    }
    static int simul(int x,int y, int dir){
        int time =0;
        boolean[][][] visited = new boolean[n][n][4];
        int nx = x;
        int ny = y;
        while(true){
            nx+=dx[dir];
            ny+=dy[dir];
            time++;
            if(!in(nx,ny)||visited[nx][ny][dir]){
                return time;
            }else{
                visited[nx][ny][dir]=true;
                if(grid[nx][ny]==1){
                    dir = mir1[dir];
                }else if(grid[nx][ny]==2){
                    dir= mir2[dir];
                }
            }
        }
        
    }
    static boolean in(int x,int y){
        return 0<=x&&x<n&&0<=y&&y<n;
    }
}