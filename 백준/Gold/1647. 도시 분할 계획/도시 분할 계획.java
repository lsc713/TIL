import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
    static class Node implements Comparable<Node> {
        int s,e, w;
        public Node(int s, int e, int w) {
            this.s = s;
            this.e = e;
            this.w = w;
        }
        @Override
        public int compareTo(Node o) {
            return Integer.compare(this.w, o.w);
        }
    }
    static List<Node> list;
    static int[] p;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        p=new int[n+1];
        for(int i=1;i<=n;i++) {
            p[i]=i;
        }
        list = new ArrayList<>();
        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());
            list.add(new Node(a, b, c));
        }
        Collections.sort(list);
        int totalCount =0;
        int maxCount =0;
        for (int i =0;i<list.size();i++) {
            Node cur = list.get(i);
            if (find(cur.s)!=find(cur.e)) {
                union(cur.s, cur.e);
                totalCount += cur.w;
                maxCount = cur.w;
            }
        }
        System.out.println(totalCount-maxCount);
    }

    static int find(int x) {
        if(x==p[x])return p[x];
        return p[x] = find(p[x]);
    }

    static void union(int x, int y) {
        if (x < y) {
             p[find(y)] = find(x);
        }else{
             p[find(x)] = find(y);
        }
    }
}