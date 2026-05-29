import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        int[] a = new int[k];
        int[] b = new int[k];
        for (int i = 0; i < k; i++) {
            st = new StringTokenizer(br.readLine());
            a[i] = Integer.parseInt(st.nextToken());
            b[i] = Integer.parseInt(st.nextToken());
        }

        int[] seat = new int[n + 1];
        @SuppressWarnings("unchecked")
        HashSet<Integer>[] visited = new HashSet[n + 1];
        for (int i = 1; i <= n; i++) {
            seat[i] = i;
            visited[i] = new HashSet<>(8);   // 초기 용량 작게 (대부분 작은 집합)
            visited[i].add(i);
        }

        for (int cycle = 0; cycle < 3; cycle++) {
            for (int i = 0; i < k; i++) {
                int ai = a[i], bi = b[i];
                int p1 = seat[ai];
                int p2 = seat[bi];
                seat[ai] = p2;
                seat[bi] = p1;
                visited[p1].add(bi);
                visited[p2].add(ai);
            }
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= n; i++) {
            sb.append(visited[i].size()).append('\n');
        }
        System.out.print(sb);
    }
}