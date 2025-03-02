import java.util.*;
import java.io.*;
class Main{
    static class Node{
        int from,to,weight;
        Node(int from,int to, int weight){
            this.from = from;
            this.to = to;
            this.weight = weight;
        }
    }
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int TC = Integer.parseInt(br.readLine());
        while (TC --> 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());
            int w = Integer.parseInt(st.nextToken());
            List<Node> nodes = new ArrayList<>();
            for (int i = 0; i < m; i++) {
                st = new StringTokenizer(br.readLine());
                int s = Integer.parseInt(st.nextToken());
                int e = Integer.parseInt(st.nextToken());
                int t = Integer.parseInt(st.nextToken());
                nodes.add(new Node(s, e, t));
                nodes.add(new Node(e, s, t));
            }
            for (int i = 0; i < w; i++) {
                st = new StringTokenizer(br.readLine());
                int s = Integer.parseInt(st.nextToken());
                int e = Integer.parseInt(st.nextToken());
                int t = Integer.parseInt(st.nextToken());
                nodes.add(new Node(s, e, -t));
            }
            boolean isNegative = false;
            int[] dist = new int[n + 1];
            for (int i = 1; i <= n; i++) {
                dist[i]=0;
            }
            for (int i = 1; i < n; i++) {
                for (Node node : nodes) {
                    if (dist[node.to] > dist[node.from] + node.weight) {
                        dist[node.to] = dist[node.from] + node.weight;
                    }
                }
            }
            for(Node node: nodes){
                if (dist[node.to] > dist[node.from] + node.weight) {
                    isNegative = true;
                    break;
                }
            }
            System.out.println(isNegative?"YES":"NO");
        }
    }
}