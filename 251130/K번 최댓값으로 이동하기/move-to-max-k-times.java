
import java.util.*;
public class Main {
    static int n,k,ans;
    static int[][] grid;
    static boolean[][] visited;
    static Deque<Pair> dq;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        k = sc.nextInt();
        ans=0;
        grid = new int[n][n];
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                grid[i][j] = sc.nextInt();
        

        int r=sc.nextInt()-1;
        int c =sc.nextInt()-1;
        while(k-->0){
            dq =new LinkedList<>();
            visited=new boolean[n][n];
            dq.add(new Pair(r,c));
            visited[r][c]=true;
            
            int start = grid[r][c];
            int maxVal = Integer.MIN_VALUE;
            int bestX = Integer.MAX_VALUE,bestY = Integer.MAX_VALUE;
            while(!dq.isEmpty()){
                Pair cur = dq.poll();
                int x = cur.x;
                int y = cur.y;
                if(grid[x][y]<start){
                    if(grid[x][y]>maxVal){
                        maxVal=grid[x][y];
                        bestX=x;
                        bestY=y;
                    }else if(grid[x][y]==maxVal){
                        if(x<bestX||(x==bestX&&y<bestY)){
                            bestX=x;
                            bestY=y;
                        }
                    }
                }

                for(int d = 0 ; d<4;d++){
                    int nx=x+dx[d];
                    int ny=y+dy[d];
                    if(in(nx,ny)){
                        if(!visited[nx][ny]){
                            if(grid[nx][ny]<start){
                                visited[nx][ny]=true;
                                dq.add(new Pair(nx,ny));
                            }
                            
                        }
                    }
                }
                
            }
            if(maxVal==Integer.MIN_VALUE){
                break;
            }else{
                r=bestX;
                c=bestY;
            }
        }
        System.out.println((r+1)+" "+(c+1));
    }
    static class Pair{
        int x,y;
        public Pair(int x, int y){
            this.x=x;
            this.y=y;
        }
    }
    static int[] dx = {0,0,-1,1};
    static int[] dy = {1,-1,0,0};
    static boolean in(int x,int y){
        return 0<=x&&x<n&&0<=y&&y<n;
    }
        
}
