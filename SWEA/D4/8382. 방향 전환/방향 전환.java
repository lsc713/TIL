import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;
import java.util.Scanner;

public class Solution {
    static class Node{
        int x,y,dist;
        boolean direction;
        public Node(int x,int y,int dist,boolean direction){
            this.x=x;
            this.y=y;
            this.dist=dist;
            this.direction=direction;
        }
    }
    static int targetX,targetY;
    static int[] dx = {-1,1,0,0};
    static int[] dy = {0,0,-1,1};
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        for (int t = 1; t <= T; t++) {
            int x1 = scanner.nextInt()+100;
            int y1 = scanner.nextInt()+100;
            int x2 = scanner.nextInt()+100;
            int y2 = scanner.nextInt()+100;
            targetX=x2;
            targetY=y2;
            int answer =move(x1,y1);
            System.out.println("#"+t+" "+answer);
        }
    }
    static boolean isIn(int x,int y){
        return 0<=x&&x<=200&&0<=y&&y<=200;
    }
    static int move(int startX,int startY){
        Queue<Node> queue = new LinkedList<>();
        queue.offer(new Node(startX,startY,0,false));
        boolean[][][] visited = new boolean[201][201][2];
        queue.offer(new Node(startX,startY,0,true));
        visited[startX][startY][0] = true;
        visited[startX][startY][1] = true;
        while(!queue.isEmpty()){
            Node cur = queue.poll();
            if(cur.x==targetX && cur.y==targetY){
                return cur.dist;
            }
            if(!cur.direction){
                for(int i=0;i<2;i++){
                    int nx = cur.x+dx[i];
                    int ny = cur.y+dy[i];
                    if (!isIn(nx,ny)||visited[nx][ny][1])continue;
                    visited[nx][ny][1]=true;
                    queue.add(new Node(nx,ny,cur.dist+1,true));
                }
            }else{
                for(int i=2;i<4;i++){
                    int nx = cur.x+dx[i];
                    int ny = cur.y+dy[i];
                    if (!isIn(nx,ny)||visited[nx][ny][0])continue;
                    visited[nx][ny][0]=true;
                    queue.add(new Node(nx,ny,cur.dist+1,false));
                }
            }
        }
        return -1;
    }
}
