import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         n = sc.nextInt();
         x = sc.nextInt()-1;
         y = sc.nextInt()-1;
         maze = new char[n][n];
        for (int i = 0; i < n; i++) {
            String line = sc.next();
            for (int j = 0; j < n; j++) {
                maze[i][j] = line.charAt(j);
            }
        }
        time=0;
        idx =0;
        move();

        
        // Please write your code here.
    }
    static int time;
    static boolean hasrightwall(int x,int y,int idx){
        //nx,ny좌표의 idx-1로 이동시 좌표가 '#'인가?
        int r = (idx+3)%4;
        int nx = x+dx[r];
        int ny = y+dy[r];
        return maze[nx][ny] =='#'&&inrange(nx,ny);
    }
    static void move(){
        int guard = 4*n*n;
        while(guard-->0){
            int fx = x+dx[idx];
            int fy = y+dy[idx];

            if(!inrange(fx,fy)){
                System.out.println(time+1);return;
            }
            if(maze[fx][fy]=='#'){
                idx = (idx+1)%4;continue;
            }
            if(hasrightwall(fx,fy,idx)){
                x=fx;y=fy;time++;
            }else{
                x=fx;y=fy;time++;
                idx=(idx+3)%4;
                int sx = x+dx[idx];
                int sy = y+dy[idx];
                if(!inrange(sx,sy)){
                    System.out.println(time+1);return;
                }
                if(maze[sx][sy]=='#')continue;
            }
        }
        System.out.println(-1);
    }
    static boolean nowall(){
        int nx = x+dx[idx];
        int ny = y+dy[idx];
        if(!inrange(nx,ny))return true;
        return maze[nx][ny]!='#';
    }
    static boolean inrange(int x,int y){
        return 0<=x&&x<n&&0<=y&&y<n;
    }
    //우 상 좌 하
    static int[] dx = {0,-1,0,1};
    static int[] dy = {1,0,-1,0};
    static int n,x,y,idx;
    static char[][] maze;
}