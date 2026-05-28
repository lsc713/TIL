import java.util.Map.*;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<Integer,Integer> map = new TreeMap<>();
        int n = sc.nextInt();
        for(int i = 0 ; i < n ;i++){
            String command = sc.next();
            if(command.equals("add")){
                int k = sc.nextInt();
                int v = sc.nextInt();
                map.put(k,v);
            }else if(command.equals("find")){
                int k = sc.nextInt();
                if(map.containsKey(k)){
                    System.out.println(map.get(k));
                }else{
                    System.out.println("None");
                }
            }else if(command.equals("remove")){
                int k = sc.nextInt();
                map.remove(k);
            }else{
                Iterator<Entry<Integer,Integer>> it = map.entrySet().iterator();
                if(it.hasNext()){
                    while(it.hasNext()){
                       Entry<Integer,Integer> entry = it.next();
                        System.out.print(entry.getValue()+ " ");
                    }
                    System.out.println();
                }else{
                    System.out.println("None");
                }
                
            }
        }
    }
}