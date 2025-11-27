import java.util.*;
public class Main {
    static int[][] map;
    static int[][] cnt;
    static int[] dx = {-1,1,0,0};
    static int[] dy = {0,0,1,-1};
    static class Dummy{
        int x,y;
        char d;
        public Dummy(int x,int y,char d){
            this.x=x;
            this.y=y;
            this.d=d;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         T = sc.nextInt();
        int ans=0;
        
        while(T-- > 0) {
             n = sc.nextInt();
            map = new int[n][n];
            cnt = new int[n][n];
            // for(int i = 0 ; i < n ; i ++){
            //     for(int j=0;j<n;j++){
            //     }
            // }
             m = sc.nextInt();
             list = new ArrayList<>();
            for (int i = 0; i < m; i++) {
                 x = sc.nextInt()-1;
                 y = sc.nextInt()-1;
                 d = sc.next().charAt(0);
                 list.add(new Dummy(x,y,d));
            }


            for(int t=0;t<200;t++){
                for(int i = 0;i<list.size();i++){
                    move(list.get(i));
                }
                for(int i = 0;i<list.size();i++){
                    Dummy dummy = list.get(i);
                    cnt[dummy.x][dummy.y]++;
                }
                List<Dummy> newList = new ArrayList<>();
                for(int i = 0 ; i < list.size();i++){
                    Dummy dummy = list.get(i);
                    if(cnt[dummy.x][dummy.y]==1){
                        newList.add(dummy);
                    }
                }
                list=newList;
                for(int i = 0 ; i < n ;i++){
                    Arrays.fill(cnt[i],0);
                }
                
            }
            
            System.out.println(list.size());
        }
        
    }
    static List<Dummy> list;
    static void move(Dummy dummy){
        int dir = findDir(dummy.d);
        int nx = dummy.x+dx[dir];
        int ny = dummy.y+dy[dir];
        if(in(nx,ny)){
            dummy.x=nx;
            dummy.y=ny;
        }else{
            dummy.d = dirs[dir];
        }
    }
    static char[] dirs = new char[]{'D','U','L','R'};
    static int findDir(char d){
        if(d=='U'){
            return 0;
        }else if(d=='D'){
            return 1;
        }else if(d=='R'){
            return 2;
        }else{
            return 3;
        }
    }
    static int n,m,T,x,y;
    static char d;
    static boolean in(int x,int y){
        return 0<=x&&x<n&&0<=y&&y<n;
    }
}