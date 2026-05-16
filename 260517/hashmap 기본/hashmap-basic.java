import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // Please write your code here.
        Map<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<n;i++){
            String s = sc.next();
            int k = sc.nextInt();
            if(s.equals("add")){
                int v = sc.nextInt();
                map.put(k,v);
            }else if(s.equals("find")){
                Integer temp  = map.get(k);
                System.out.println(temp == null ? "None":temp);    
            }else {
                map.remove(k);
            }
        }
    }
}