import java.util.*;
import java.io.*;
public class Main {
    static class Node{
        int x,y,d;
        public Node(int x,int y,int d){
            this.x=x;
            this.y=y;
            this.d=d;
        }
    }
    static int[] dx = {-1,0,0,1};
    static int[] dy = {0,-1,1,0};
    static List<Node> list;
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
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
                int dir=0;
                if(d=='U')dir=0;
                else if(d=='D')dir=3;
                else if(d=='L')dir=1;
                else dir=2;
                list.add(new Node(x,y,dir));
            }
            for(int a=0;a<2*n;a++){
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
            sb.append(list.size()).append("\n");


            // Please write your code here.
        }
        System.out.println(sb.toString());
        
    }
    static int n,m;
    static boolean in(int x,int y){
        return 0<=x&&x<n&&0<=y&&y<n;
    }
    static void move(Node node){
        int x = node.x;
        int y = node.y;
        int nx = x+dx[node.d];
        int ny = y+dy[node.d];
        if(in(nx,ny)){
            node.x=nx;
            node.y=ny;
        }else{
            node.d = 3-node.d;
        }
    }
}