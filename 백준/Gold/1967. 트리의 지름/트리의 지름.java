
import java.util.*;
import java.io.*;

public class Main {
    /*
    * 양방향인 경우를 고려할 것.
    * static 변수 확인을 조심하고
    * visited = primitiveType
    * 경계 값 검사로서 n이 1이라면, 간선은 0이되므로 이에 대한 고려가 추가적으로 필요...하긴한데.. 이걸 문제풀때 경계값 검사를 어떻게 생각해야하지?
    * */
    static class Node{
        int child;
        int weight;
        public Node(int child, int weight) {
            this.child = child;
            this.weight = weight;
        }
        @Override
        public String toString() {
            return child + " " + weight;
        }
    }
    static List<Node>[] nodes;
    static boolean[] visited;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int n = Integer.parseInt(br.readLine());
        nodes = new ArrayList[n+1];
        visited = new boolean[n+1];
        for(int i = 1; i <= n; i++){
            nodes[i] = new ArrayList<>();
        }

        for (int i = 0; i < n-1; i++) {
            st = new StringTokenizer(br.readLine());
            int parent = Integer.parseInt(st.nextToken());
            int child = Integer.parseInt(st.nextToken());
            int weight = Integer.parseInt(st.nextToken());
            nodes[parent].add(new Node(child, weight));
            nodes[child].add(new Node(parent, weight));
        }


        dfs(1,0);
        Arrays.fill(visited, false);
        if(n==1){
            System.out.println(0);
            return;
        }
        dfs(longNode,0);
        System.out.println(result);
    }
    static int result =0;
    static int longNode = 0;
    static void dfs(int idx, int temp){
        if(temp>result){
            result = temp;
            longNode = idx;
        }
        visited[idx]=true;

        for(int i = 0; i < nodes[idx].size(); i++){
            Node node = nodes[idx].get(i);
//            System.out.print(node.child+" ");
            if(!visited[node.child]){
                visited[node.child] = true;
                dfs(node.child, node.weight+temp);
            }
        }
    }
}
