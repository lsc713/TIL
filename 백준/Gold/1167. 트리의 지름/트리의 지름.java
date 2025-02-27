import java.util.*;
import java.io.*;

public class Main {

    static class Node{
        int to;
        int weight;
        Node(int to, int weight){
            this.to = to;
            this.weight = weight;
        }
        /*

        정렬이 필요한 경우는 언제일까?
        pq에 넣을때 필요하긴하겠죠?.. 그 외에는..

        중간 값을 찾거나, 해당 리스트에서 최댓 값 또는 최솟값이 필요하기 때문인데..


        */
        /**
         * 예를 들어 다익스트라..!
        * */
    }
    static boolean[] visited;
    static List<Node>[] nodes;
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int v = Integer.valueOf(br.readLine());
        nodes = new ArrayList[v+1];
        visited = new boolean[v+1];
        for(int i = 1; i <= v; i++){
            nodes[i] = new ArrayList<>();
        }
        for(int i = 0 ; i <v;i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int node = Integer.parseInt(st.nextToken());
            while(st.hasMoreTokens()){
                int item = Integer.parseInt(st.nextToken());
                if(item == -1){
                    break;
                }
                int distance = Integer.parseInt(st.nextToken());
                nodes[node].add(new Node(item, distance));
            }
        }
        visited[1]=true;
        dfs(1,0);
        
//        visited = new boolean[v+1];
        Arrays.fill(visited,false);
        visited[temp]=true;
        dfs(temp, 0);
        System.out.println(result);
        //여기서.. 가장 긴 노드는 항상 지나쳐가기 마련.
        // 그걸 구하려면 처음에 아무거나 돌려서 가장 긴 노드를 찾아야함.
        //그래서 노드를 temp 에 넣고, 해당 건으로 다시한번 긴 결과를 찾는다.
        // 그럼 visitied배열 초기화를해야하나? 아니면 다른 고려사항이 있는가?
        /**
         * 정리하면
         * 1.가장 긴 길이를 갖는 노드를 찾는다
         * 2. 해당 노드를 싹돌려서 가장 긴 길이를 찾는다.
         * */
    }
    static int result =0;
    static int temp;
    static void dfs(int idx, int len){
        if(result < len){
//            System.out.println(idx+ " " + len+ " " +result);
            result = len;
            temp = idx;
            //return;
            /**
             * 보통 dfs는 return문으로 마무리를한다.
             * 해당 값을 찾으면 더이상 불필요한 탐색을 종료하기 위해서이다.
             * 다만 이번 경우에 한해서는, node들의 개수 만큼만 탐색하고, 방문조건을 확인하는바.
             * return 문이 없더라도 해결이 가능함.
             * */
        }
        for(int i = 0 ; i < nodes[idx].size() ; i++){
            Node node = nodes[idx].get(i);
            if(!visited[node.to]){
                visited[node.to] =true;
                dfs(node.to,node.weight+len);
            }
        }
    }
}
