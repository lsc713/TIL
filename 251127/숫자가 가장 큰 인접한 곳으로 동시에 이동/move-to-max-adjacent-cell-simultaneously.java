import java.util.*;
public class Main {
    //UDLR 숫자가 같으면 상하좌우의 우선순위, 그게 아니면 큰 값으로 이동.
    // 구슬을 숫자를 골라 이동을 시킬 것.(격자를 벗어나면안됨,)
    // 겹치면 없애버릴것. 
    // 남은 구슬을 출력할 것.
    static int[] dx = {-1,1,0,0};
    static int[] dy = {0,0,-1,1};
    static int ans;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         n = sc.nextInt();
         m = sc.nextInt();//구슬
         t = sc.nextInt();//시간
        result = new int[n][n];

        ans = 0;
        grid = new int[n][n];
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                grid[i][j] = sc.nextInt();
        marbles = new int[m][2];
        for (int i = 0; i < m; i++) {
            marbles[i][0] = sc.nextInt()-1;
            marbles[i][1] = sc.nextInt()-1;
            result[marbles[i][0]][marbles[i][1]]=1;
        }
        
        for(int i =0;i<t;i++){
            simul();
        }
        
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(result[i][j]>0){
                    ans++;
                }
            }
        }
        System.out.println(ans);
        // Please write your code here.
    }
    static void simul(){
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(result[i][j]>0){
                    select(i,j);
                }
            }
        }
        move();
        // for(int i = 0 ; i < n ; i ++){
        //     for(int j = 0 ; j <n;j++){
        //         System.out.print(result[i][j]+" ");
        //     }
        //     System.out.println();
        // }
        // System.out.println("=====================");
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(result[i][j]>1){
                    result[i][j]=0;
                }
            }
        }
        temp = new ArrayList<>();
    }
    static void move(){
        for(int i = 0 ; i < temp.size();i++){
            int[] tmp = temp.get(i);
            result[tmp[0]][tmp[1]]++;
        }
    }
    static List<int[]> temp = new ArrayList<>();
    static void select(int x,int y){
        int max=0;
        int[] tmp = new int[2];
        for(int d =0;d<4;d++){
            int nx = x+dx[d];
            int ny = y+dy[d];
            if(in(nx,ny)){
                if(grid[nx][ny]>max){
                    max=grid[nx][ny];
                    tmp[0]=nx;
                    tmp[1]=ny;
                }//상하좌우로 확인하므로 최댓값만 확인하면됨.
            }
        }
        result[x][y]=0;
        temp.add(tmp);
    }
    static int[][] result;

    static int n,m,t;
    static int[][] grid,marbles;
    static boolean in(int x,int y){
        return 0<=x&&x<n&&0<=y&&y<n;
    }
}