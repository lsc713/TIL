import java.util.*;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int i = 0 ; i <n;i++){
            pq.add(-sc.nextInt());
        }
        /////ww
        while(pq.size()>=2){
            int num1 = - pq.poll();
            int num2 = - pq.poll();
            int num3 = num1-num2;
            if(num3>0){
                pq.add(-num3);
            }
            
        }
        if(pq.isEmpty()){
            System.out.println(-1);

        }else{
            System.out.println(-pq.peek());
        }
    }
}