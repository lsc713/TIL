import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        Queue<Integer> queue = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            queue.add(i+1);
        }
        System.out.print("<");
        while (!queue.isEmpty()) {
            for (int j=1;j<k;j++){
                int item = queue.poll();
                queue.add(item);
            }
            int item = queue.poll();
            if (queue.isEmpty()){
                System.out.print(item);
            }else{
                System.out.print(item+", ");
            }
        }
        System.out.print(">");
    }
}