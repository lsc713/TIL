import java.util.*;
class Solution {
    public List<String> findItinerary(List<List<String>> tickets) {
        Map<String,PriorityQueue<String>> graph = new HashMap<>();
        List<String> answer = new ArrayList<>();
        for(List<String> ticket : tickets){
            String from = ticket.get(0);
            String to = ticket.get(1);
            graph.putIfAbsent(from,new PriorityQueue<>());
            graph.get(from).add(to);
        }
        dfs("JFK",graph,answer);
        return answer;
    }
    void dfs(String airport,Map<String, PriorityQueue<String>> graph, List<String> answer){
        PriorityQueue<String> destinations = graph.get(airport);
        while(destinations != null && !destinations.isEmpty()){
            String nextAirport = destinations.poll();
            dfs(nextAirport,graph,answer);
        }
        answer.add(0,airport);
    }
}