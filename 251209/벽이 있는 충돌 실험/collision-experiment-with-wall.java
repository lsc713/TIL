import java.util.*;
import java.io.*;
public class Main {
    static class Node{
        int x,y;
        char d;
        public Node(int x,int y,char d){
            this.x=x;
            this.y=y;
            this.d=d;
        }
    }
    static int[] dx = {-1,1,0,0};
    static int[] dy = {0,0,-1,1};
    static char[] chars = {'D','U','R','L'};
    static List<Node> list;
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int T = Integer.parseInt(br.readLine());
        while(T-- > 0) {
            st = new StringTokenizer(br.readLine());
            n = Integer.parseInt(st.nextToken());
            list = new ArrayList<>();
            int[][] cnt = new int[n][n];
            m = Integer.parseInt(st.nextToken());
            for (int i = 0; i < m; i++) {
                st = new StringTokenizer(br.readLine());
                int x = Integer.parseInt(st.nextToken())-1;
                int y = Integer.parseInt(st.nextToken())-1;
                char d = st.nextToken().charAt(0);
                list.add(new Node(x,y,d));
            }
            for(int a=0;a<200;a++){
                for(int i = 0 ; i < list.size();i++){
                    move(list.get(i));
                }
                for(int i = 0 ; i < list.size();i++){
                    cnt[list.get(i).x][list.get(i).y]++;
                }
                List<Node> newList = new ArrayList<>();
                for(int i = 0 ; i < list.size();i++){
                    if(cnt[list.get(i).x][list.get(i).y]==1){
                        newList.add(list.get(i));
                    }
                }
                for(int i = 0 ; i < list.size() ;i++){
                    cnt[list.get(i).x][list.get(i).y]--;
                }
                list=newList;

            }
            
            System.out.println(list.size());


            // Please write your code here.
        }
        
    }
    static int n,m;
    static boolean in(int x,int y){
        return 0<=x&&x<n&&0<=y&&y<n;
    }
    static void move(Node node){
        int x = node.x;
        int y = node.y;
        char d = node.d;
        int direction = dir(d);
        int nx = x+dx[direction];
        int ny = y+dy[direction];
        if(in(nx,ny)){
            node.x=nx;
            node.y=ny;
        }else{
            node.d = chars[direction];
        }
    }
    static int dir(char d){
        if(d=='D'){
            return 1;
        }else if(d=='U'){
            return 0;
        }else if(d=='L'){
            return 2;
        }else {
            return 3;
        }

    }
}