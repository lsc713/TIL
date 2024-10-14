import java.util.*;
class Main{
    static int v,e,k;
    static class Pos implements Comparable<Pos>{
        int V,W;
        public Pos(int V,int W){
            this.V=V;
            this.W=W;
        }
        @Override
        public int compareTo(Pos o){
            return Integer.compare(this.W,o.W);
        }

    }
    static int[] dist;
    static List<Pos>[] list;
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        v=sc.nextInt();
        e=sc.nextInt();
        k=sc.nextInt();
        list=new ArrayList[v+1];
        dist = new int[v+1];
        Arrays.fill(dist,Integer.MAX_VALUE);
        for(int i =1;i<=v;i++){
            list[i]=new ArrayList<>();
        }
        for(int i = 0;i<e;i++){
            int u=sc.nextInt();
            int V=sc.nextInt();
            int W=sc.nextInt();
            list[u].add(new Pos(V,W));
        }
        dijkstra(k);
        for(int i = 1;i<=v;i++){
            if (dist[i]==Integer.MAX_VALUE){
                System.out.println("INF");
            }else{
                System.out.println(dist[i]);
            }
        }
    }
    static void dijkstra(int start){
        PriorityQueue<Pos> pq = new PriorityQueue<>();
        boolean[] visited = new boolean[v+1];
        pq.add(new Pos(start,0));
        dist[start]=0;
        while(!pq.isEmpty()){
            Pos temp = pq.poll();
            int cur = temp.V;
            if(visited[cur])continue;
            visited[cur]=true;
            for(Pos val : list[cur]){
                if(dist[val.V]>dist[cur]+val.W){
                    dist[val.V]=dist[cur]+val.W;
                    pq.add(new Pos(val.V,dist[val.V]));
                }
            }
        }

    }
}