import java.util.*;
import java.io.FileInputStream;


class Solution
{
    static int[] dx = {-1,1,0,0};
    static int[] dy = {0,0,-1,1};
    static int answer;
    static boolean[][] visited;
    static int n,m;
    public static void main(String args[]) throws Exception
    {
        Scanner sc = new Scanner(System.in);
        int T;
        T=sc.nextInt();

        for(int test_case = 1; test_case <= T; test_case++)
        {
            n = sc.nextInt();
            m = sc.nextInt();
            answer=0;
            visited = new boolean[n][m];
            Queue<int[]> q = new LinkedList<>();
            for(int i = 0 ; i < n;i++){
                String input = sc.next();
                for(int j=0;j<m;j++){
                    if(input.charAt(j)=='W'){
                        visited[i][j] = true;
                        q.offer(new int[]{i,j,0});
                    }
                }
            }
            while(!q.isEmpty()){
                int[] now = q.poll();
                int x = now[0];
                int y = now[1];
                int l = now[2];
                answer += l;

                for(int i = 0 ; i<4;i++){
                    int nx = x+dx[i];
                    int ny = y+dy[i];
                    if(0<=nx&&nx<n&&0<=ny&&ny<m&&!visited[nx][ny]){
                        visited[nx][ny]=true;
                        q.offer(new int[]{nx,ny,l+1});
                    }
                }

            }
            System.out.println("#"+test_case+" "+answer);

        }
    }
}