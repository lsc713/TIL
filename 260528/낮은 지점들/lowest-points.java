import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<Integer,Integer> map = new HashMap<>();
        int n = sc.nextInt();
        for(int i = 0 ; i < n ; i ++){
            int x = sc.nextInt();
            int y = sc.nextInt();
            if(map.containsKey(x)){
                if(map.get(x)>y){
                    map.put(x,y);
                }
            }else{
                map.put(x,y);
            }
        }
        long ans =0;
        for(Integer k : map.keySet()){
            ans+=map.get(k);
        }
        System.out.println(ans);
        // Please write your code here.
    }
}