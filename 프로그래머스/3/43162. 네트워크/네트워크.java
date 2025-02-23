class Solution {
    static boolean[] visited;
    public int solution(int n, int[][] computers) {
        visited = new boolean[n];
        int answer = 0;
        for(int i = 0 ; i <n;i++){
            if(!visited[i]){
                dfs(i,n,computers);
                answer++;
            }
        }
        return answer;
    }
    void dfs(int current, int n, int[][] computers){
        visited[current]=true;
        for(int i = 0 ; i < n;i++){
            if(i!=current&&computers[current][i]==1&&!visited[i]){
                dfs(i,n,computers);
            }
        }
    }
}