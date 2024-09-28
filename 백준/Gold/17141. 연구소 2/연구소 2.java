import java.io.*;
import java.util.*;

public class Main {

    static int n,m,answer=Integer.MAX_VALUE;
    static int[][] map;
    static List<int[]> virusList;
    static int space=0;
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        m=sc.nextInt();
        map=new int[n][n];
        virusList=new ArrayList<>();
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                map[i][j]=sc.nextInt();
                if(map[i][j]==2){
                    virusList.add(new int[]{i,j});
                    space++;
                }else if(map[i][j]==0){
                    space++;
                }
            }
        }
        space-=m;//0인 부분은 선택된2가 아닌 모든 부분들이므로 처리.
        dfs(0,0,new int[m]);
        System.out.println(answer == Integer.MAX_VALUE? -1 : answer);
    }

    private static void dfs(int depth, int at, int[] selected) {
        if(depth==m){
            bfs(selected);
            return;
        }
        for(int i=at;i<virusList.size();i++){
            selected[depth]=i;//visited배열을 이곳에서 관리했었는데, 실제 퍼지는건 bfs에서 되므로 유예
            dfs(depth+1,i+1,selected);
        }
    }
    static int[] dx = {-1,1,0,0};
    static int[] dy = {0,0,-1,1};
    private static void bfs(int[] selected) {
        Queue<int[]> q=new LinkedList<>();
        boolean[][] visited = new boolean[n][n];
        int[][] time=new int[n][n];
        int[][] copy=new int[n][n];

        for (int i=0;i<n;i++) {
            copy[i] = map[i].clone();
        }

        //새로운 맵배열에서 바이러스배열에 없는 곳은 빈칸으로.
        for(int i = 0 ;i<virusList.size();i++){
            int[] tmp = virusList.get(i);
            if (Arrays.binarySearch(selected, i) < 0) {
                copy[tmp[0]][tmp[1]]=0;
            }
        }
//        System.out.println(virusList);

        for (int val : selected){
            int[] tmp = virusList.get(val);
            int x = tmp[0];
            int y = tmp[1];
            q.offer(new int[]{x,y});
            visited[x][y]=true;
        }

        int emptyTmp=0;
        int minTime=0;
        while(!q.isEmpty()){
            int[] tmp = q.poll();
            for (int i = 0;i<4;i++){
                int nx = tmp[0]+dx[i];
                int ny = tmp[1]+dy[i];
                if (0<=nx && 0<=ny && nx<n && ny<n && !visited[nx][ny] && copy[nx][ny]!=1){
                    visited[nx][ny]=true;
                    time[nx][ny] = time[tmp[0]][tmp[1]]+1;
                    q.add(new int[]{nx,ny});
                    if (copy[nx][ny] == 0) {
                       emptyTmp++;
                       minTime=Math.max(minTime,time[nx][ny]);
                    }
                }
            }
        }
        if(space==emptyTmp){
            answer=Math.min(answer,minTime);
        }
    }
}