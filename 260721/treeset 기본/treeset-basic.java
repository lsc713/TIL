import java.util.*;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new  Scanner(System.in);
        int n = sc.nextInt();
        TreeSet<Integer>  set = new  TreeSet<>();
        for(int i = 0 ; i < n ;i++){
            String cmd =sc.next();
            if(cmd.equals("add")){
                set.add(sc.nextInt());
            }else if(cmd.equals("largest")){
                System.out.println(set.isEmpty() ? "None":set.last());
            }else if(cmd.equals("smallest")){
                System.out.println(set.isEmpty() ? "None":set.first());
            }else if(cmd.equals("remove")){
                set.remove(sc.nextInt());
            }else if(cmd.equals("find")){
                System.out.println(set.contains(sc.nextInt()));
            }else if(cmd.equals("upper_bound")){
                int  input = sc.nextInt();
                System.out.println(set.higher(input) == null ? "None"  : set.higher(input));
            }else if(cmd.equals("lower_bound")){
                int  input = sc.nextInt();
                System.out.println(set.ceiling(input) == null ? "None"  : set.ceiling(input));
            }
            
        }
        
    }
}