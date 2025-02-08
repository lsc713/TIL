
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Solution {

    static int[] parent;
    static List<Integer>[] children;
    static boolean[] visited;
    static int V,E,v1,v2;
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int T = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        for (int t = 1; t <= T; t++) {

            st = new StringTokenizer(br.readLine());
             V = Integer.parseInt(st.nextToken());
             E = Integer.parseInt(st.nextToken());
            v1 = Integer.parseInt(st.nextToken());
            v2 = Integer.parseInt(st.nextToken());
            st = new StringTokenizer(br.readLine());
            parent = new int[V+1];
            children = new ArrayList[V+1];
            visited = new boolean[V+1];
            for(int i = 1; i <= V; i++) {
                children[i] = new ArrayList<>();
            }
            for (int i = 0; i < E; i++) {
                int p = Integer.parseInt(st.nextToken());
                int c = Integer.parseInt(st.nextToken());
                parent[c]= p;
                children[p].add(c);
            }
            int cur = v1;
            while(cur != 0){
                visited[cur]=true;
                cur = parent[cur];
            }
            cur = v2;
            int commonAncestor = v2;
            while(cur != 0){
                if(visited[cur]){
                    commonAncestor = cur;
                    break;
                }
                cur = parent[cur];
            }
            int size = subTreeSize(commonAncestor);
            sb.append("#").append(t).append(" ").append(commonAncestor).append(" ").append(size).append("\n");
        }
        System.out.println(sb);
    }
    private static int subTreeSize(int ancestor) {
        int size = 1;
        for (int val : children[ancestor]) {
            size+=subTreeSize(val);
        }
        return size;
    }
}