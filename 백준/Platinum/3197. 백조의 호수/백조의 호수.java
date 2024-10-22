import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {

    static int[] pos1,pos2;
    static int r,c;
    static char[][] map;
    static boolean[][] visited;
    static int[] dx = {-1, 0, 1, 0};
    static int[] dy = {0, -1, 0, 1};
    static Queue<int[]> waterQ;
    static Queue<int[]> swanQ;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        r = Integer.parseInt(st.nextToken());
        c = Integer.parseInt(st.nextToken());
        waterQ = new LinkedList<>();
        swanQ = new LinkedList<>();
        map = new char[r][c];
        boolean swan=true;
        for (int i = 0; i < r; i++) {
            String s = br.readLine();
            for (int j = 0; j < s.length(); j++) {
                map[i][j] = s.charAt(j);
                if(map[i][j] == 'L'){
                    if(swan){
                        pos1 = new int[]{i,j};
                        swan=false;
                    }else{
                        pos2 = new int[]{i,j};
                    }
                    map[i][j]='.';
                }
                if(map[i][j] != 'X'){
                    waterQ.add(new int[]{i,j});
                }
            }
        }
        swanQ.add(pos1);
        visited = new boolean[r][c];
        visited[pos1[0]][pos1[1]] = true;
        int day =0;
        while(!meet()){
            melt();
            day++;
        }
        System.out.println(day);
    }

    private static boolean meet() {
        Queue<int[]> newSwanQ = new LinkedList<>();
        while(!swanQ.isEmpty()){
            int[] pos = swanQ.poll();
            for (int i = 0; i < 4; i++) {
                int nx = pos[0] + dx[i];
                int ny = pos[1] + dy[i];
                if(nx==pos2[0] && ny==pos2[1]){
                    return true;
                }
                if(0<=nx && nx<r && 0<=ny && ny<c && !visited[nx][ny]){
                    if(map[nx][ny] == 'X'){
                        newSwanQ.add(new int[]{nx,ny});
                    }else{
                        swanQ.add(new int[]{nx,ny});
                    }
                    visited[nx][ny] = true;
                }
            }
        }
        swanQ=newSwanQ;
        return false;
    }

    static void melt(){
        int size = waterQ.size();
        for (int j = 0; j < size; j++) {
            int[] pos = waterQ.poll();
            for(int i = 0; i < 4; i++){
                int nx = pos[0] + dx[i];
                int ny = pos[1] + dy[i];
                if(0<=nx && nx<r && 0<=ny && ny<c){
                    if (map[nx][ny] == 'X'){
                        map[nx][ny] = '.';
                        waterQ.add(new int[]{nx, ny});
                    }
                }
            }
        }
    }
}