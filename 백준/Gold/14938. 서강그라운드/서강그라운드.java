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
        public int compareTo(Node o){
            return Integer.compare(this.weight,o.weight);
        }
    }
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int r = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        int[] arr = new int[n+1];
        for(int i = 1 ; i <=n;i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }
        List<Node>[] lists = new ArrayList[n+1];
        for(int i = 1 ; i <=n;i++){
            lists[i] = new ArrayList<>();
        }
        for(int i = 0 ; i <r;i++){
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int l = Integer.parseInt(st.nextToken());
            lists[a].add(new Node(b,l));
            lists[b].add(new Node(a,l));
        }

        int maxItems = 0;
        for(int start = 1; start<=n;start++){
            int[] distances = new int[n+1];
            Arrays.fill(distances,Integer.MAX_VALUE);
            distances[start]=0;
            PriorityQueue<Node> pq = new PriorityQueue<>();
            pq.offer(new Node(start,0));
            while(!pq.isEmpty()){
                Node current = pq.poll();
                int currentNode = current.to;
                int currentDist = current.weight;
                if(currentDist>distances[currentNode])continue;
                for(Node next: lists[currentNode]){
                    int nextNode = next.to;
                    int nextDist = next.weight + currentDist;
                    if(nextDist<distances[nextNode]){
                        distances[nextNode]=nextDist;
                        pq.offer(new Node(nextNode, nextDist));
                    }
                }
            }
            int itemSum =0;
            for(int i = 1; i <=n;i++){
                if(distances[i] <=m){
                    itemSum+=arr[i];
                }
            }
            maxItems = Math.max(maxItems,itemSum);
        }

        System.out.println(maxItems);
    }
}