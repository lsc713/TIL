import java.util.*;

class Main{
    static int n;
    static int[] shark;
    static List<int[]> fishList = new ArrayList<>();
    static int[][] map;
    static int sharkStack=0;
    static int sharkSize=2;
    static int[] dx = {-1,1,0,0};
    static int[] dy = {0,0,-1,1};
    static int answer=0;
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        n=sc.nextInt();
        map= new int[n][n];
        for(int i = 0;i<n;i++){
            for(int j = 0 ; j <n;j++){
                map[i][j]=sc.nextInt();
                if(map[i][j]==9){
                    map[i][j]=0;
                    shark = new int[]{i,j};
                }else if(map[i][j]!=9&&map[i][j]!=0){
                    fishList.add(new int[]{i,j});
                }
            }
        }
        while(true){
            int[] tmp = bfs();
            if(tmp==null)break;
            answer+=tmp[2];
            map[tmp[0]][tmp[1]]=0;
            sharkStack++;
            shark=new int[]{tmp[0],tmp[1]};
            if(sharkStack==sharkSize){
                sharkStack=0;
                sharkSize++;
            }
            fishList.removeIf(fish->fish[0]==tmp[0]&&fish[1]==tmp[1]);
        }
        System.out.println(answer);
    }
    static int[] bfs(){
        PriorityQueue<int[]> pq = new PriorityQueue<>((a,b)->{
            if(a[2]!=b[2])return a[2]-b[2];
            if(a[0]!=b[0])return a[0]-b[0];
            return a[1]-b[1];
        });
        pq.add(new int[]{shark[0],shark[1],0});
        boolean[][] visited = new boolean[n][n];
        visited[shark[0]][shark[1]]=true;
        while(!pq.isEmpty()){
            int[] tmp = pq.poll();
            int x=tmp[0],y=tmp[1],d=tmp[2];
            if(map[x][y]<sharkSize&&map[x][y]!=0){
                return tmp;
            }
            for(int i = 0;i<4;i++){
                int nx = x+dx[i];
                int ny = y+dy[i];
                if(0<=nx&&nx<n&&0<=ny&&ny<n&&!visited[nx][ny]&&map[nx][ny]<=sharkSize){
                    pq.add(new int[]{nx,ny,d+1});
                    visited[nx][ny]=true;
                }
            }
        }
        return null;
    }
}