import java.util.*;
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long m = sc.nextInt();
        long ans =Long.MAX_VALUE;
        TreeSet<Long> set = new TreeSet<>();
        for(int i=0;i<n;i++){
            set.add(sc.nextLong());
        }
        for(long x : set){
            Long y = set.ceiling(x+m);
            if(y!=null) ans = Math.min(ans,y-x);
        }
        System.out.println(ans == Long.MAX_VALUE ? -1 : ans);
        // Please write your code here.
    }
}