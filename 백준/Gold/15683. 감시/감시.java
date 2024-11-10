import java.util.*;
import java.io.*;

class Main {
    static int n,m,answer,total;
    static int[][] map;
    static List<CCTV> cctvs;
    static class CCTV {
        int x,y,type;
        public CCTV(int x, int y, int type) {
            this.x = x;
            this.y = y;
            this.type = type;
        }
    }
    static boolean visited[][];
    static int[] dx = {-1,0,1,0};
    static int[] dy = {0,-1,0,1};
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
         n = scanner.nextInt();
         m = scanner.nextInt();
        answer = Integer.MAX_VALUE;
        visited=new boolean[n][m];
        map=new int[n][m];
        cctvs=new ArrayList<>();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                map[i][j] = scanner.nextInt();
                if(map[i][j]>=1&&map[i][j]<=5){
                    cctvs.add(new CCTV(i, j, map[i][j]));
                }else if(map[i][j]==0){
                    total++;
                }
            }
        }
        recur(0,total);
        System.out.println(answer);
    }
    static void recur(int depth,int result){
        if (depth == cctvs.size()) {
            answer = Math.min(answer, result);
            return;
        }
        int tempTotal = total;
        int[][] temp = new int[n][m];
        for (int i = 0; i < n; i++) {
            temp[i] = map[i].clone();
        }
        CCTV cctv = cctvs.get(depth);
        switch (cctv.type){
            case 1:
                for(int i =0;i<4;i++){
                    total = tempTotal;
                    result = watch(cctv.x,cctv.y,i);
                    recur(depth+1,result);
                    restore(temp);
                }
                break;
            case 2:
                for(int i =0;i<2;i++){
                    total = tempTotal;
                    watch(cctv.x,cctv.y,i);
                    result = watch(cctv.x,cctv.y,(i+2));
                    recur(depth+1,result);
                    restore(temp);
                }
                break;
            case 3:
                for(int i =0;i<4;i++){
                    total = tempTotal;
                    watch(cctv.x,cctv.y,i);
                    result = watch(cctv.x,cctv.y,(i+1)%4);
                    recur(depth+1,result);
                    restore(temp);
                }
                break;
            case 4:
                for(int i =0;i<4;i++){
                    total = tempTotal;
                    watch(cctv.x,cctv.y,i);
                    watch(cctv.x,cctv.y,(i+2)%4);
                    result = watch(cctv.x,cctv.y,(i+1)%4);
                    recur(depth+1,result);
                    restore(temp);
                }
                break;
            case 5:
                total = tempTotal;
                for(int i =0;i<4;i++){
                   result= watch(cctv.x,cctv.y,i);
                }
                recur(depth+1,result);
                restore(temp);
                break;
        }
    }
    static int watch(int x,int y,int direction) {
        int nx =x;
        int ny = y;
        while(true){
             nx +=dx[direction];
             ny +=dy[direction];
            if(!isIn(nx,ny)||map[nx][ny]==6){
                break;
            }
            if(map[nx][ny]==0){
                map[nx][ny]=-1;
                total--;
            }
        }
        return total;
    }
    static boolean isIn(int x,int y){
        return 0<=x&&x<n&&0<=y&&y<m;
    }
    static void restore(int[][] temp){
        for(int i=0;i<temp.length;i++){
            map[i]=temp[i].clone();
        }
    }
}