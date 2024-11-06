import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;
import java.util.Scanner;

public class Solution {
    static int[] dx = {-1,1,0,0};//상하좌우
    static int[] dy = {0,0,-1,1};
    static class Node{
        int x,y,direction,memory;
        public Node(int x, int y, int direction, int memory) {
            this.x = x;
            this.y = y;
            this.direction = direction;
            this.memory = memory;
        }
        public Node copy(){
            return new Node(x,y,direction,memory);
        }
    }
    static int r,c;
    static char[][] map;
    static int MAX = 1000000;
    static boolean exist;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        for (int t = 1; t <= T; t++) {
             r = scanner.nextInt();
             c = scanner.nextInt();
             map = new char[r][c];
             exist = false;
            for (int i = 0; i < r; i++) {
                String input = scanner.next();
                map[i] = input.toCharArray();
                for (int j = 0; j < c; j++) {
                    if(map[i][j] == '@') {
                        exist = true;
                    }
                }
            }
            String answer = "NO";
            if(exist&&simul(new Node(0,0,3,0))){
                answer = "YES";
            }
            System.out.println("#"+t+" "+answer);
        }
    }
    private static boolean simul(Node start){
        return dfs(start,0,new boolean[r][c][16][4]);
    }
    static boolean dfs(Node cur,int depth,boolean[][][][] visited){
        if(visited[cur.x][cur.y][cur.memory][cur.direction]) return false;
        if(depth==MAX)return false;
        visited[cur.x][cur.y][cur.memory][cur.direction] = true;
        char command = map[cur.x][cur.y];
        if (command=='@')return true;
        if (command=='?'){
            for (int i=0;i<4;i++){
                Node next = cur.copy();
                next.direction=i;
                next.x =(next.x+dx[next.direction]+r)%r;
                next.y =(next.y+dy[next.direction]+c)%c;
                if (dfs(next, depth + 1, visited)) {
                    return true;
                }
            }
            return false;
        }else{
            if (!processCommand(cur)) {
                return true;
            }
            cur.x=(cur.x+dx[cur.direction]+r)%r;
            cur.y=(cur.y+dy[cur.direction]+c)%c;
            return dfs(cur, depth + 1, visited);
        }
    }
    private static boolean processCommand(Node node) {
        switch (map[node.x][node.y]) {
            case '<':
                node.direction = 2;
                break;
            case '>':
                node.direction = 3;
                break;
            case '^':
                node.direction = 0;
                break;
            case 'v':
                node.direction = 1;
                break;
            case '_':
                if(node.memory==0){
                    node.direction=3;
                }else{
                    node.direction=2;
                }
                break;
            case '|':
                if (node.memory==0){
                    node.direction=1;
                }else{
                    node.direction=0;
                }
                break;
            case '.':
                break;
            case '@':
                return false;
            case '+':
                if(node.memory==15){
                    node.memory=0;
                }else{
                    node.memory+=1;
                }
                break;
            case '-':
                if(node.memory==0){
                    node.memory=15;
                }else{
                    node.memory-=1;
                }
            default:
                if(map[node.x][node.y]>='0'&&map[node.x][node.y]<='9'){
                    node.memory=map[node.x][node.y]-'0';
                }
                break;
        }
        return true;
    }
}
