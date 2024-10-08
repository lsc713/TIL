import java.util.Arrays;
import java.util.Scanner;

public class Solution {
    static int[] end;
    static char[][] map;
    static int n,answer;
    static int[] dx = {-1,0,1,0};
    static int[] dy = {0,-1,0,1};
    static StringBuilder sb;
    static Scanner sc = new Scanner(System.in);
    static Pos pos;
    static class Pos{
        int x,y,direction;
        public Pos(int x,int y,int direction) {
            this.x=x;
            this.y=y;
            this.direction = direction;
        }
    }
    public static void main(String[] args) {
        int T = sc.nextInt();
        for(int t=1;t<=T;t++) {
            n =sc.nextInt();
            sb=new StringBuilder();
            map = new char[n][n];
            for(int i = 0 ; i<n;i++) {
                String input = sc.next();
                for(int j = 0 ; j<n;j++) {
                    map[i][j] = input.charAt(j);
                    if(map[i][j]=='X') {
                        pos = new Pos(i,j,0);
                    }
                    if(map[i][j]=='Y') {
                        end = new int[] {i,j};
                    }
                }
            }

            int q = sc.nextInt();
            for(int i = 0 ; i <q;i++) {
                char[][] newMap = new char[n][n];
                for(int j = 0 ; j<n;j++) {
                    newMap[j] = map[j].clone();
                }
                Pos tempPos = new Pos(pos.x,pos.y,0);
                race(tempPos,newMap);
            }

            System.out.println("#"+t+" " +sb);
        }
    }
    static void race(Pos pos, char[][] newMap){
        answer=0;
        int c = sc.nextInt();
        String command = sc.next();
        for(int j = 0 ; j <c;j++) {
            char ch = command.charAt(j);
            if(ch=='A') {
                int nx = pos.x+dx[pos.direction];
                int ny = pos.y+dy[pos.direction];
//                System.out.println(nx+" " +ny);
                if(0<=nx&&nx<n&&0<=ny&&ny<n&&newMap[nx][ny] != 'T') {
                    if(newMap[nx][ny] == 'Y') {
                        answer=1;
                    }else{
                        answer=0;
                    }
                    newMap[pos.x][pos.y]='G';
                    newMap[nx][ny] = 'X';
                    pos.x=nx;
                    pos.y=ny;
                }
            }else if(ch=='L') {
                pos.direction=((pos.direction+1)%4+4)%4;
            }else if(ch=='R') {
                pos.direction = ((pos.direction-1)%4+4)%4;
//                System.out.println(pos.direction);
            }
//            System.out.println("-----------------------");
//            for(char[] val : newMap) {
//
//                System.out.println(Arrays.toString(val));
//            }
        }
        sb.append(answer+" ");
    }
}
