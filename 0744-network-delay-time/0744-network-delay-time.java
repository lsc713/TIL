import java.util.*;
class Solution {
    public int networkDelayTime(int[][] times, int n, int k) {
        List<List<int[]>> graph = new ArrayList<>();
        for(int i = 0;i<=n;i++){
            graph.add(new ArrayList<>());
        }
        for(int[] time : times){
            int u =time[0],v=time[1],w=time[2];
            graph.get(u).add(new int[]{v,w});
        }
        int[] dist = new int[n+1];
        Arrays.fill(dist,Integer.MAX_VALUE);
        dist[k]=0;

        PriorityQueue<int[]> pq = new PriorityQueue<>((a,b)->a[1]-b[1]);
        pq.offer(new int[]{k,0});
        while(!pq.isEmpty()){
            int[] curr = pq.poll();
            int node = curr[0],time=curr[1];

            if(time>dist[node]){
                continue;
            }
            for(int[] neighbor : graph.get(node)){
                int v = neighbor[0],w = neighbor[1];
                int newTime = time+w;

                if(newTime<dist[v]){
                    dist[v]=newTime;
                    pq.offer(new int[]{v,newTime});
                }
            }
        }

        int maxTime=0;
        for(int i =1;i<=n;i++){
            if(dist[i]==Integer.MAX_VALUE){
                return -1;
            }
            maxTime = Math.max(maxTime,dist[i]);
        }
        return maxTime;
    }
}