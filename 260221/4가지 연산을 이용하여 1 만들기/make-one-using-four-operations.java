import java.util.*;
public class Main {
    static int n,ans;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         n = sc.nextInt();
         ans=0;
         
         System.out.println(bfs(n));
        // Please write your code here.
    }
    static boolean in(int x){
        return 0<x&&x<=1000000;
    }
    static int bfs(int x){
        Queue<Integer> q = new LinkedList<>();
        boolean[] visited = new boolean[1000001];
        q.add(x);
        visited[x]=true;
        while(!q.isEmpty()){
            int size = q.size();
            for(int i = 0 ; i <size;i++){
                int cur = q.poll();
                if(cur==1)return ans;
                for(int d=0;d<4;d++){
                    int nx=0;
                    if(d==0){
                        nx = cur-1;
                    }else if(d==1){
                        nx = cur+1;
                    }else if(d==2){
                        if(cur%2==0) nx= cur/2;
                    }else{
                        if(cur%3==0) nx= cur/3;
                    }
                    if(!in(nx))continue;
                    if(visited[nx])continue;
                    visited[nx]=true;
                    q.add(nx);
                }
            }
            ans++;
        }
        return -1;
    }
}