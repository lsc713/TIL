import java.util.*;
class Main{
    static int m,n,k,answer;
    static int[][] map;
    static int[] dx ={-1,1,0,0};
    static int[] dy={0,0,-1,1};
    static boolean visited[][];
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for(int t=1;t<=T;t++){
            m = sc.nextInt();
            n =sc.nextInt();
            k=sc.nextInt();
            answer=0;
            map  = new int[n][m];
            visited  = new boolean[n][m];
            for(int i = 0 ;i<k;i++){
                int a = sc.nextInt();
                int b = sc.nextInt();
//                for(int[] val : map){
//                    System.out.println(Arrays.toString(val));
//                }
//                System.out.println("===============");
                map[b][a] = 1;
                visited[b][a] = true;
            }
            for(int i = 0 ;i<n;i++){
                for(int j=0;j<m;j++){
                    if(map[i][j]==1&&visited[i][j]){
//                        System.out.println(i+""+j);
                        answer++;
                        bfs(i,j);
                    }
                }
            }
            System.out.println(answer);
        }//tc
    }//main
    static void bfs(int x ,int y){
        visited[x][y] = false;
        for(int k=0;k<4;k++){
            int nx = x+dx[k];
            int ny = y+dy[k];
            if(0<=nx&&nx<n&&0<=ny&&ny<m&&map[nx][ny]==1&&visited[nx][ny]){
                map[x][y] = 0;
                bfs(nx,ny);
            }
        }
    }
}