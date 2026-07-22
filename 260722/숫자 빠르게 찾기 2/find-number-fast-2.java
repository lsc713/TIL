import java.util.*;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        TreeSet<Integer> set = new TreeSet<>();
        int n  = sc.nextInt();
        int m  = sc.nextInt();
        for(int i = 0 ; i < n;i++){
            set.add(sc.nextInt());
        }
        for(int i = 0 ; i  < m;i++){
            int num = sc.nextInt();
            if(set.ceiling(num)==null){
                System.out.println(-1);
            }else{
                System.out.println(set.ceiling(num));
            }
            
        }
    }
}