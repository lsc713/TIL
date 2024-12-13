import java.util.*;
class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        List<List<Integer>> graph = new ArrayList<>();
        boolean[] visited = new boolean[numCourses];
        boolean[] onStack = new boolean[numCourses];

        for(int i = 0;i<numCourses;i++){
            graph.add(new ArrayList<>());
        }        

        for(int[] prereq : prerequisites){
            int course = prereq[0];
            int prerequisite = prereq[1];
            graph.get(course).add(prerequisite);
        }
        for(int i = 0; i<numCourses;i++){
            if(hasCycle(i,graph,visited,onStack)){
                return false;
            }
        }
        return true;
    }
    boolean hasCycle(int course, List<List<Integer>> graph,boolean[] visited,boolean[] onStack){
        if(onStack[course]){
            return true;
        }
        if(visited[course]){
            return false;
        }
        visited[course]=true;
        onStack[course]=true;
        for(int prereq : graph.get(course)){
            if(hasCycle(prereq,graph,visited,onStack)){
                return true;
            }
        }
        onStack[course]=false;
        return false;
    }
}