import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         n = sc.nextInt();
         m = sc.nextInt();
         q = sc.nextInt();
         building = new int[n][m];
        for (int i = 0; i < n; i++)
            for (int j = 0; j < m; j++)
                building[i][j] = sc.nextInt();
        int[][] queries = new int[q][4];
        for (int i = 0; i < q; i++){
                int r1 = sc.nextInt()-1;
                int c1 = sc.nextInt()-1;
                int r2 = sc.nextInt()-1;
                int c2 = sc.nextInt()-1;

                rotate(r1,c1,r2,c2);
                calc(r1,c1,r2,c2);
        }
        for(int i =0;i<n;i++){
            for(int j = 0 ; j < m;j++){
                System.out.print(building[i][j]+" ");
            }
            System.out.println();
        }
    }
    static void rotate(int r1,int c1,int r2,int c2){
        int temp = building[r1][c1];
        int[][] tmp = new int[n][m];
        for(int i = 0 ; i < n ;i++){
            System.arraycopy(building[i],0,tmp[i],0,m);
        }
        for(int x=r1;x<r2;x++){
            tmp[x][c1]=building[x+1][c1];
        }
        for(int y = c1;y<c2;y++){
            tmp[r2][y]=building[r2][y+1];
        }
        for(int x=r2;x>r1;x--){
            tmp[x][c2]=building[x-1][c2];
        }
        for(int y = c2;y>c1;y--){
            tmp[r1][y]=building[r1][y-1];
        }
        tmp[r1][c1+1]=temp;
        for(int i = r1;i<=r2;i++){
            for(int j = c1;j<=c2;j++){
                building[i][j]=tmp[i][j];
            }
        }
        
    }
    static int n,m,q;
    static int[][] building;
    static boolean in(int x,int y){
        return 0<=x&&x<n&&0<=y&&y<m;
    }
    static int[] dx = {-1,1,0,0};
    static int[] dy = {0,0,-1,1};
    static void calc(int r1,int c1,int r2,int c2){
        int[][] tmp = new int[n][m];
        for(int i = 0 ; i < n;i++){
            System.arraycopy(building[i],0,tmp[i],0,m);
        }
        
        for(int x =r1;x<r2;x++){
            for(int y=c1;y<c2;y++){
                int sum=building[x][y];
                int cnt=1;
                for(int d=0;d<4;d++){
                    int nx = x+dx[d];
                    int ny = y+dy[d];
                    if(in(nx,ny)){
                        sum+=building[nx][ny];
                        cnt++;
                    }
                }
                tmp[x][y] = sum/cnt;
            }
        }
        for(int i = 0 ; i < n ;i++){
            for(int j = 0 ; j<m;j++){
                building[i][j]=tmp[i][j];
            }
        }
    }
}