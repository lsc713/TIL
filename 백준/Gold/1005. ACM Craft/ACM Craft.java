import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T  = scanner.nextInt();
        for (int t= 1;t <= T;t++) {
            int n = scanner.nextInt();
            int k = scanner.nextInt();
            int[] d = new int[n+1];
            for (int i = 1; i <= n; i++) {
                d[i] = scanner.nextInt();
            }
            int[] inDegree = new int[n + 1];
            List<Integer>[] list = new ArrayList[n + 1];
            for (int i=1; i<=n; i++) {
                list[i]= new ArrayList<>();
            }
            for (int i = 1; i <= k; i++) {
                int a = scanner.nextInt();
                int b = scanner.nextInt();
                list[a].add(b);
                inDegree[b]++;
            }
            int[] answer = new int[n + 1];
            for (int i = 1; i <= n; i++) {
                answer[i]=d[i];
            }
            Queue<Integer> queue = new LinkedList<>();
            for (int i = 1; i <= n; i++) {
                if (inDegree[i] == 0) {
                    queue.add(i);
                }
            }
            while (!queue.isEmpty()) {
                int cur = queue.poll();
                for (int next : list[cur]) {
                    answer[next] = Math.max(answer[next], answer[cur] + d[next]);
                    inDegree[next]--;
                    if (inDegree[next] == 0) {
                        queue.offer(next);
                    }
                }
            }
            int w = scanner.nextInt();
            System.out.println(answer[w]);
        }
    }
}