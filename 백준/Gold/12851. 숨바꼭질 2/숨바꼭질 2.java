import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    static class Node{
        int location,time;
        public Node(int location,int time){
            this.location = location;
            this.time = time;
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        bfs(n,k);
    }
    private static void bfs(int start, int target) {
        Queue<Node> q = new LinkedList<>();
        q.add(new Node(start,0));
        int[] visited = new int[100001];
        Arrays.fill(visited,Integer.MAX_VALUE);
        visited[start] = 0;
        int cnt=0;
        int minTime = Integer.MAX_VALUE;
        while(!q.isEmpty()){
            Node cur = q.poll();
            int current = cur.location;
            int time = cur.time;
            if(current==target){
                if(minTime>time){
                    minTime = time;
                    cnt=1;
                }else if(time==minTime){
                    cnt++;
                }
                continue;
            }
            int[] nextPost = new int[]{-1,1,2};
            for (int next : nextPost) {
                int item = next==2?current*2:current+next;
                if(0>item||item>100000)continue;
                if(visited[item]>=time+1){
                    visited[item]=time+1;
                    q.add(new Node(item,time+1));
                }
            }
        }
        System.out.println(minTime);
        System.out.println(cnt);
    }
}
