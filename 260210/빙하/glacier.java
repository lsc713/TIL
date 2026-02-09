import java.util.Scanner;
public class Main {
    static int[] dx = {-1,1,0,0};
    static int[] dy = {0,0,-1,1};
    static int[][] grid;
    static int n,m;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         n = sc.nextInt();
         m = sc.nextInt();
        grid = new int[n][m];
        int cnt=0;
        for (int i = 0; i < n; i++){
            for (int j = 0; j < m; j++){
                grid[i][j] = sc.nextInt();
                if(grid[i][j]==1){
                    cnt++;
                }
            }
        }
        int time=0;
        int lastMelted=0;
        while(cnt>0){
            int[][] temp = new int[n][m];
            int melt=0;
            for(int i = 0 ; i < n ; i++){
                System.arraycopy(grid[i],0,temp[i],0,m);
            }
            for (int i = 1; i < n-1; i++){
                for (int j = 1; j < m-1; j++){
                    if(temp[i][j]==1 && validZero(i,j)){
                        temp[i][j]=0;
                        melt++;
                        
                    }
                }
            }   
            grid = temp;
            cnt-=melt;
            time++;
            if(cnt==0){
                lastMelted=melt;
            }

        }
            
        System.out.println(time+" "+lastMelted);
    }
    static boolean validZero(int x,int y){
        for(int i = 0 ; i <4;i++){
            int nx = x+dx[i];
            int ny = y+dy[i];
            if(grid[nx][ny]==0&&!isol(nx,ny)){
                return true;
            }
        }
        return false;
    }
    static boolean isol(int x,int y){
        for(int i = 0 ; i <4;i++){
            int nx = x+dx[i];
            int ny = y+dy[i];
            if(nx<0||nx>=n||ny<0||ny>=m) return false;
            if(grid[nx][ny]==0){
                return false;
            }
        }
        return true;
    }
}