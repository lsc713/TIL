import java.util.*;
public class Main {
    static int[][][] dir = new int[][][]{
        {{-1,0},{1,0},{0,-1},{0,1},{0,0}},
        {{1,-1},{1,1},{-1,-1},{-1,1},{0,0}},
        {{-1,0},{1,0},{2,0},{-2,0},{0,0}}
    };
    static List<int[]> list = new ArrayList<>();
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         n = sc.nextInt();
         max=0;
         grid = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                grid[i][j] = sc.nextInt();
                if(grid[i][j]==1){
                    list.add(new int[]{i,j});
                }
            }
        }
        boolean[][] covered = new boolean[n][n];
        recur(0,covered);
        // Please write your code here.
        System.out.println(max);
    }
    static int[][] grid;
    static int n,max;
    static void recur(int idx, boolean[][] covered){
        if(idx==list.size()){
            int cnt=0;
            for(int i = 0 ; i < n ; i ++){
                for(int j = 0 ; j < n ; j++){
                    if(covered[i][j])cnt++;
                }
            }
            max = Math.max(max,cnt);
            return;
        }
        int[] pos = list.get(idx);
        int x = pos[0],y=pos[1];

        for(int i=0;i<3;i++){
            List<int[]> temp = new ArrayList<>();
            for(int[] d : dir[i]){
                int nx = x+d[0];
                int ny = y+d[1];
                if(in(nx,ny)&&!covered[nx][ny]){
                    covered[nx][ny]=true;
                    temp.add(new int[]{nx,ny});
                }
            }
            recur(idx+1,covered);
            for(int[] c : temp){
                covered[c[0]][c[1]]=false;
            }
            
        }
    }
    static boolean in(int nx,int ny){
        return 0<=nx&&nx<n&&0<=ny&&ny<n;
    }
}