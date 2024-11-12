import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

class Main {
    static class Node implements Comparable<Node>{
        int e,w;
        public Node(int e, int w) {
            this.e = e;
            this.w = w;
        }

        @Override
        public int compareTo(Node o) {
            return Integer.compare(this.w, o.w);
        }
    }
    static int N,E;
    static int[] dist;
    static int MAX =2_000_000_000;
    static List<Node>[] lists;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer(br.readLine());
        N=Integer.parseInt(st.nextToken());
        E=Integer.parseInt(st.nextToken());
        lists=new List[N+1];
        dist=new int[N+1];
        Arrays.fill(dist,MAX);
        for(int i=1;i<=N;i++){
            lists[i]=new ArrayList<>();
        }
        for (int i = 0; i < E; i++) {
            st=new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());
            lists[a].add(new Node(b,c));
            lists[b].add(new Node(a,c));
        }
        st=new StringTokenizer(br.readLine());
        int v1 = Integer.parseInt(st.nextToken());
        int v2 = Integer.parseInt(st.nextToken());
        long result=path(v1,v2);
        long result2=path(v2,v1);
        System.out.println((result>=MAX&&result2>=MAX)?-1:Math.min(result2,result));

    }
    static long path(int mid1,int mid2){
        long result =0;
        int[] path = {1, mid1, mid2, N};
        for (int i = 0; i < 3; i++) {
            int dist = dijkstra(path[i], path[i + 1]);
            if (dist > MAX) {
                return MAX;
            }
            result+=dist;
        }
        return result;
    }
    static int dijkstra(int start,int end){
        Arrays.fill(dist,MAX);
        boolean[] visited=new boolean[N+1];
        PriorityQueue<Node> pq = new PriorityQueue<>();
        pq.add(new Node(start,0));
        dist[start]=0;
        visited[start]=true;
        while(!pq.isEmpty()){
            Node cur = pq.poll();
            visited[cur.e]=true;
            for (Node val : lists[cur.e]) {
                if (!visited[val.e]&&dist[val.e] > cur.w + val.w) {
                    dist[val.e] = cur.w + val.w;
                    pq.add(new Node(val.e,dist[val.e]));
                }
            }
        }
        return dist[end];
    }
}