import java.util.*;
import java.io.*;
class Main{
    static int[][] map;
    static boolean[][] visited;
    static int N;
    static int[] answer;
    static List<int[]> black;
    static List<int[]> white;
    public static void main(String[]args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        map=new int[N][N];
        visited=new boolean[N][N];
        answer=new int[2];
        black =new ArrayList<>();
        white = new ArrayList<>();
        for(int i = 0 ; i<N;i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int j = 0;j<N;j++){
                map[i][j]=Integer.parseInt(st.nextToken());
                if(map[i][j]==1){
                    if((i+j)%2==0){
                        black.add(new int[]{i,j});
                    }else{
                        white.add(new int[]{i,j});
                    }
                }
            }
        }
        backTracking(0,0,white,0);
        backTracking(0,0,black,1);
        System.out.println(answer[0]+answer[1]);
    }
    static void backTracking(int depth,int at,List<int[]> position,int color){
        answer[color]=Math.max(answer[color],depth);
        for(int i = at ;i<position.size();i++){
            int[] temp = position.get(i);
            int x = temp[0], y= temp[1];
            if(!visited[x][y]&&canPlace(x,y)){
                visited[x][y]=true;
                backTracking(depth+1,i+1,position,color);
                visited[x][y]=false;
            }
        }
    }
    static int[] dx ={-1,1,1,-1};
    static int[] dy ={1,1,-1,-1};
    static boolean canPlace(int x,int y){

        for(int i=0;i<4;i++){
            int nx = x;
            int ny =y;
            while (true) {
                nx+=dx[i];
                ny+=dy[i];
                if(0>nx||nx>=N||0>ny||ny>=N)break;
                if(visited[nx][ny])return false;
            }
        }
        return true;

    }
}