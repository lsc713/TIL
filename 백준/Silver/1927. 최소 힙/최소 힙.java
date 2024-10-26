import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
        for (int i = 0; i < n; i++) {
            int item = scanner.nextInt();
            if (item ==0){
                if (priorityQueue.isEmpty()){
                    System.out.println(0);
                    continue;
                }
                int temp = priorityQueue.poll();
                System.out.println(temp);
            }else{
                priorityQueue.add(item);
            }
        }
    }
}