import java.util.*;
public class Main {
    static class Pair{
        int to;
        int weight;
        public Pair(int to,int weight){
            this.to=to;
            this.weight=weight;
        }
    }
    static int n,bestnode,ans;
    static List<Pair>[] list;
    static boolean[] visited;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         n = sc.nextInt();
        list = new ArrayList[n+1];
        for(int i =1;i<=n;i++){
            list[i]=new ArrayList<>();
        }
        for (int i = 0; i < n - 1; i++) {
            int u = sc.nextInt();
            int v = sc.nextInt();
            int w = sc.nextInt();
            list[u].add(new Pair(v,w));
            list[v].add(new Pair(u,w));
        }

        visited = new boolean[n+1];
        visited[1]=true;
        bestnode = -1;
        ans=-1;
        dfs(1,0);
        // visited = new boolean[n+1];
        // ans=-1;
        // dfs(bestnode,0);
        System.out.println(ans);
        // Please write your code here.
    }
    static void dfs(int idx,int cnt){
        visited[idx]=true;
        if(ans<cnt){
            ans=cnt;
            bestnode = idx;
        }
        for(Pair p : list[idx]){
            if(!visited[p.to]){
                dfs(p.to,cnt+p.weight);
            }
        }
    }
}