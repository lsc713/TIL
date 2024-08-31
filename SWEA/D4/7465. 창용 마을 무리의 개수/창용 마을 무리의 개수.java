
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Solution
{
    static int n ;
    static int m;
    static List<Integer>[] list;
    static boolean[] visited;
    public static void main(String args[]) throws Exception
    {

        Scanner sc = new Scanner(System.in);
        int T;
        T=sc.nextInt();


        for(int test_case = 1; test_case <= T; test_case++)
        {
            n = sc.nextInt(); 
            m = sc.nextInt(); 
            list = new ArrayList[n+1]; 
            visited = new boolean[n+1];
            for (int i = 1; i <= n; i++) {
                list[i] = new ArrayList<>(); 
            }
            for (int i = 0; i < m; i++) {
                int a = sc.nextInt();
                int b = sc.nextInt();
                list[a].add(b); 
                list[b].add(a);
            }
            int answer=0;

            for (int i = 1; i <= n; i++) {
                if (!visited[i]) {
                    dfs(i);
                    answer++;
                }
            }
            System.out.println("#"+test_case+" "+answer);
        }
    }

    static void dfs(int depth) {
        visited[depth] = true;
        for (int relation : list[depth]) {
            if (!visited[relation]) {
                dfs(relation);
            }
        }
    }
}