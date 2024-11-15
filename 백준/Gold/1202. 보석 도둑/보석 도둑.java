import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {
    static class Jewel implements Comparable<Jewel> {
        int w, v;
        public Jewel(int w, int v) {
            this.w = w;
            this.v = v;
        }
        @Override
        public int compareTo(Jewel o) {
            if (this.w == o.w) {
                return o.v - this.v;
            }
            return this.w - o.w;
        }

        @Override
        public String toString() {
            return "(" + w + ", " + v + ")";
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        List<Jewel> jewels = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            int m = Integer.parseInt(st.nextToken());
            int v = Integer.parseInt(st.nextToken());
            jewels.add(new Jewel(m, v));
        }
        Collections.sort(jewels);
        int[] bags = new int[k];
        long answer=0;
        for (int i = 0; i < k; i++) {
            st = new StringTokenizer(br.readLine());
            int c = Integer.parseInt(st.nextToken());
            bags[i] = c;
        }
        Arrays.sort(bags);
        int j=0;
        PriorityQueue<Integer> pq = new PriorityQueue(Collections.reverseOrder());
        for (int i =0; i < k; i++) {
            while (j < n && jewels.get(j).w <= bags[i]) {
                pq.offer(jewels.get(j++).v);
            }
            if (!pq.isEmpty()) {
                answer += pq.poll();
            }
        }
        System.out.println(answer);
    }
}