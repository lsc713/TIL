import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Integer>[] list = new ArrayList[n+1];
        for(int i = 1 ; i <= n ; i++){
            list[i]= new ArrayList<>();
        }
        for (int i = 1; i <= n - 1; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            list[x].add(y);
            list[y].add(x);
        }

        Deque<Integer> dq = new LinkedList<>();
        int[] parent = new int[n+1];
        boolean[] visited = new boolean[n+1];
        visited[1]=true;
        dq.add(1);

        while(!dq.isEmpty()){
            int cur = dq.poll();
            for(int x : list[cur]){
                if(!visited[x]){
                    visited[x]=true;
                    parent[x]=cur;
                    dq.add(x);
                }
            }
            
        }
        for(int i =2;i<=n;i++){
            System.out.println(parent[i]);
        }
        // Please write your code here.
    }
}