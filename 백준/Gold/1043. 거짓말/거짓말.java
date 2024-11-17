import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Main {
    static int[] p;
    public static int[][] persons;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int truth = scanner.nextInt();//명수 입력
        Set<Integer> truths = new HashSet<>();
        for (int i = 1; i <= truth; i++) {
            truths.add(scanner.nextInt());
        }
        p = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            p[i] = i;
        }
        int personCnt = 0;
        List<Integer>[] list = new ArrayList[m];
        for (int i = 0; i < m; i++) {//파티의 수
            list[i] = new ArrayList<>();
            personCnt = scanner.nextInt();//오는 사람 수
            int first = scanner.nextInt();
            list[i].add(first);
            for (int j = 1; j < personCnt; j++) {
                int person = scanner.nextInt();
                list[i].add(person);
                union(first, person);
            }
        }
        int answer = m;
        for (int i = 0; i < m; i++) {
            boolean canLie = true;
            for (int person : list[i]) {
                for (int truthPerson : truths) {
                    if (find(person) == find(truthPerson)) {
                        canLie = false;
                        break;
                    }
                }
                if (!canLie)break;
            }
            if (!canLie) {
                answer--;
            }
        }
        System.out.println(answer);
    }

    static int union(int x, int y) {
        x = find(x);
        y = find(y);
        if (x < y) {
            return p[y]=x;
        }else{
            return p[x] = y;
        }
    }
    static int find(int x){
        if(x == p[x]){
            return x;
        }else{
            return find(p[x]);
        }
    }
}