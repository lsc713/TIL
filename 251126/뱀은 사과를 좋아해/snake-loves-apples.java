import java.util.*;
public class Main {
    static int n,m,k;
    static int[][] map;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         n = sc.nextInt();
         m = sc.nextInt();
         k = sc.nextInt();
        int time=0;
        map = new int[n][n];
        for (int i = 0; i < m; i++) {
            int x = sc.nextInt()-1;
            int y = sc.nextInt()-1;
            map[x][y]=2;
        }
        Deque<int[]> snake = new ArrayDeque<>();
        int r = 0,c=0;
        snake.addFirst(new int[]{r,c});
        map[r][c]=1;
        
        for (int i = 0; i < k; i++) {
            char d = sc.next().charAt(0);
            int p = sc.nextInt();
            for(int a=0;a<p;a++){
                int nr=0,nc=0;
                if(d=='U'){
                     nr = r+dx[0];
                     nc = c+dy[0];
                }else if(d=='D'){
                     nr = r+dx[1];
                     nc = c+dy[1];
                }else if(d=='R'){
                     nr = r+dx[2];
                     nc = c+dy[2];
                }else if(d=='L'){
                     nr = r+dx[3];
                     nc = c+dy[3];
                }
                    time++;

                if(in(nr,nc)){
                    if(map[nr][nc]==1){//꼬리와 머리가 겹치면 종료
                        int[] tail = snake.peekLast();
                        if(!(tail[0]==nr&&tail[1]==nc)){
                            System.out.println(time);
                            return;
                        }
                            
                    }
                    if(map[nr][nc]==2){
                        //꼬리가 사라지면 안됨.
                        snake.addFirst(new int[]{nr,nc});
                        map[nr][nc]=1;
                    }else{
                        snake.addFirst(new int[]{nr,nc});
                        map[nr][nc]=1;
                        int[] tail = snake.removeLast();
                        map[tail[0]][tail[1]]=0;
                    }
                    r=nr;
                    c=nc;
                    //몸 전체가 움직이면 시간 증가
                }else{
                    //범위를 벗어나면 종료
                    System.out.println(time);
                    return;            
                }
            }
        }
        // Please write your code here.
        System.out.println(time);
    }
    static boolean in(int x,int y){
        return 0<=x&&x<n&&0<=y&&y<n;
    }
    static int[] dx = {-1,1,0,0};
    static int[] dy = {0,0,1,-1};
}
