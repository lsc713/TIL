import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Set<Integer> set = new HashSet<>();
        for(int i = 0 ; i < n;i++){
            String command = sc.next();
            boolean res = false;;
            if(command.equals("add")){
                set.add(sc.nextInt());
            }else if(command.equals("find")){
                 res =  set.contains(sc.nextInt());
                 System.out.println(res);
            }else{
                set.remove(sc.nextInt());
            }
            
        }
        // Please write your code here.
    }
}