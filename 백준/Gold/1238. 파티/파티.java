import java.util.*;
import java.io.*;
class Main{

    static class Node implements Comparable<Node>{
        int to,weight;
        Node(int to, int weight){
            this.to = to;
            this.weight = weight;
        }
        @Override
        public int compareTo(Node o) {
            return Integer.compare(this.to, o.to);
        }
    }
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int x = Integer.parseInt(st.nextToken());
        List<Node>[] from = new ArrayList[n+1];
        List<Node>[] to = new ArrayList[n+1];
        for (int i = 1; i <= n; i++) {
            from[i] = new ArrayList<>();
            to[i] = new ArrayList<>();
        }
        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());
            int weight = Integer.parseInt(st.nextToken());
            from[start].add(new Node(end, weight));
            to[end].add(new Node(start, weight));
        }
        int maxTime=0;
        int[] fromX = dijkstra(from,x,n);
        int[] toX = dijkstra(to,x,n);
        for(int i = 0 ;i <=n;i++){
            maxTime = Math.max(maxTime, fromX[i] + toX[i]);
        }
        System.out.println(maxTime);
    }

    static int[] dijkstra(List<Node>[] from, int x,int n){
        int[] dist = new int[n+1];
        Arrays.fill(dist, Integer.MAX_VALUE);
        PriorityQueue<Node> pq = new PriorityQueue<>();
        dist[x] = 0;
        pq.add(new Node(x,0));
        while(!pq.isEmpty()){
            Node cur = pq.poll();
            int curTo = cur.to;
            int curWeight = cur.weight;
            if(dist[curTo]<curWeight)continue;
            for(Node next : from[curTo]){
                int nextTo = next.to;
                int nextWeight = next.weight+curWeight;
                if(dist[nextTo]>nextWeight){
                    dist[nextTo]=nextWeight;
                    pq.offer(new Node(nextTo, nextWeight));
                }
            }
        }
        return dist;
    }
}