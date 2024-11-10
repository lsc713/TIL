import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine());
        for (int i = 0; i < T; i++) {
            TreeMap<Integer, Integer> map = new TreeMap<>();
            int k = Integer.parseInt(br.readLine());
            for (int j = 0; j < k; j++) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                char command = st.nextToken().charAt(0);
                int num = Integer.parseInt(st.nextToken());
                if (command == 'I') {
                    map.put(num, map.getOrDefault(num, 0) + 1);
                } else if (command == 'D') {
                    if (map.isEmpty()) {
                        continue;
                    }else{
                        int key = num == 1 ? map.lastKey() : map.firstKey();
                        int cnt = map.get(key);
                        if (cnt == 1) {
                            map.remove(key);
                        }else{
                            map.put(key, cnt - 1);
                        }
                    }
                }
            }
            if (map.isEmpty()) {
                sb.append("EMPTY\n");
            }else{
                sb.append(map.lastKey() + " " + map.firstKey() + '\n');
            }
        }
        System.out.println(sb);
    }
}