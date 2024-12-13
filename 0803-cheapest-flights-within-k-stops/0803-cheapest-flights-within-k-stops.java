import java.util.*;
class Solution {
    public int findCheapestPrice(int n, int[][] flights, int src, int dst, int k) {
        List<List<int[]>> graph = new ArrayList<>();
        for(int i = 0 ; i <n;i++){
            graph.add(new ArrayList<>());
        }
        for(int[] flight : flights){
            int from = flight[0],to=flight[1],weight =flight[2];
            graph.get(from).add(new int[]{to,weight});
        }
        Queue<int[]> q = new LinkedList<>();
        if(src==dst) return 0;
        int[] v = new int[n];
        Arrays.fill(v,Integer.MAX_VALUE);
        v[src]=0;
        q.offer(new int[]{src,0});
        int level =0 ;
        while(!q.isEmpty() && level < k+1){
            int size = q.size();
            for(int i = 0 ; i <size;i++){
                int[] curr = q.poll();
                for(int[] next : graph.get(curr[0])){
                    if(curr[1]+next[1] < v[next[0]]){
                        v[next[0]]=curr[1]+next[1];
                        q.offer(new int[]{next[0],v[next[0]]});
                    }
                }
            }
            level++;
        }
        return v[dst]==Integer.MAX_VALUE?-1:v[dst];
    }
}