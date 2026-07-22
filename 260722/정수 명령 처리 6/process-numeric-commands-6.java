import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        int n = sc.nextInt();
        for(int i = 0 ; i < n ; i++){
            String cmd = sc.next();
            switch (cmd){
                case "push" : 
                    int num = sc.nextInt();
                    pq.add(-num);
                    break;
                case "size" :
                    System.out.println(pq.size());
                    break;
                case "empty" :
                    System.out.println(pq.isEmpty()? 1: 0);
                    break;
                case "pop" :
                    System.out.println(-pq.poll());
                    break;
                case "top" :
                    System.out.println(-pq.peek());
                    break;
            }
        }
        
        // Please write your code here.
    }
}