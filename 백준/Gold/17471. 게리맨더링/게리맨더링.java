import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    static int n;
    static int[] population;
    static List<Integer>[] list;
    static int[] area;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
         n = scanner.nextInt();
         population = new int[n+1];
         area = new int[n+1];
        list = new List[n+1];
        for (int i = 1; i <= n; i++) {
            list[i] = new ArrayList<>();
            population[i] = scanner.nextInt();
        }
        for (int i = 1; i <= n; i++) {
            int linked =scanner.nextInt();
            for (int j =0;j<linked;j++) {
                list[i].add(scanner.nextInt());
            }
        }
        recur(1);
        System.out.println(answer==Integer.MAX_VALUE?-1:answer);
    }
    static int answer=Integer.MAX_VALUE;
    static boolean bfs(int idx, int areaNum){
        Queue<Integer> queue = new LinkedList<>();
        boolean[] visited = new boolean[n+1];
        visited[idx]=true;
        queue.add(idx);
        int cnt=1;
        while(!queue.isEmpty()){
            int cur = queue.poll();
            for (int next : list[cur]) {
                if(!visited[next] && area[next]==areaNum){
                    visited[next]=true;
                    queue.add(next);
                    cnt++;
                }
            }
        }
        int total=0;
        for (int i =1;i<=n;i++){
            if (area[i]==areaNum)total++;
        }
        return total==cnt;
    }
    private static void recur(int depth) {
        if (depth==n+1){

            boolean hasArea1=false,hasArea2=false;
            for (int i =1;i<=n;i++){
                if (area[i]==0){
                    hasArea2 = true;}
                if (area[i]==1){
                    hasArea1=true;
                }
            }
            if (!hasArea1||!hasArea2)return;

            int start1=-1,start2=-1;
            for (int i=1;i<=n;i++){
                if (area[i]==1&&start1==-1)start1=i;
                else if(area[i]==0&&start2==-1)start2=i;
            }

            if(bfs(start1,1)&&bfs(start2,0)){
                int area1=0,area2=0;
                for (int i=1;i<=n;i++){
                    if(area[i]==1)area1+=population[i];
                    else area2+=population[i];
                }
                answer=Math.min(answer,Math.abs(area1-area2));
            }
            return;
        }
        area[depth]=1;
        recur(depth+1);
        area[depth]=0;
        recur(depth+1);
    }
}