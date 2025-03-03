import java.util.*;
import java.io.*;
class Main{
    static class Node implements Comparable<Node>{
        int e,w;
        public Node(int e, int w){
            this.e = e;
            this.w = w;
        }
        public int compareTo(Node n){
            return Integer.compare(this.w, n.w);
        }
    }
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int m = Integer.parseInt(br.readLine());
        StringTokenizer st;
        List<Node>[] nodes = new ArrayList[n+1];
        for(int i = 1; i <= n; i++){
            nodes[i] = new ArrayList<>();
        }
        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int s = Integer.parseInt(st.nextToken());
            int e = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());
            nodes[s].add(new Node(e, c));
        }
        st = new StringTokenizer(br.readLine());
        int s = Integer.parseInt(st.nextToken());
        int e = Integer.parseInt(st.nextToken());
        int[] dist = new int[n+1];
        int[] prev = new int[n+1];
        Arrays.fill(dist,Integer.MAX_VALUE);
        dist[s]=0;
        PriorityQueue<Node> pq = new PriorityQueue<>();
        pq.add(new Node(s,0));
        while(!pq.isEmpty()){
            Node cur = pq.poll();
            int curTo = cur.e;
            int curWeight = cur.w;
            if(dist[curTo]<curWeight)continue;
            for(Node child : nodes[curTo]){
                int childTo = child.e;
                int childWeight = child.w;
                if(dist[childTo]>curWeight+childWeight){
                    dist[child.e] = child.w+curWeight;
                    prev[child.e] = cur.e;
                    pq.add(new Node(childTo, dist[child.e]));
                }
            }
        }
        System.out.println(dist[e]);
        List<Integer> path = new ArrayList<>();
        int current = e;
        while (current != 0) {
            path.add(current);
            current = prev[current];
        }
        System.out.println(path.size());
        StringBuilder sb = new StringBuilder();
        for(int i = path.size()-1;i>=0;i--){
            sb.append(path.get(i)).append(" ");
        }
        System.out.println(sb.toString());
    }
}