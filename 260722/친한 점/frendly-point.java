import java.util.*;
public class Main {

    static class Pair implements Comparable<Pair>{
        int x;
        int y;
        Pair(int x,int y){
            this.x=x;
            this.y=y;
        }

        @Override
        public int compareTo(Pair o){
            if(this.x!=o.x){
                return this.x-o.x;
            }else{
                return this.y-o.y;
            }
        }
    }


    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        TreeSet<Pair> set= new TreeSet<>();
        for(int i = 0 ; i < n;i++){
            int x = sc.nextInt();
            int y = sc.nextInt();
            set.add(new Pair(x,y));
        }
        for(int i = 0 ; i <m;i++){
            int x = sc.nextInt();
            int y = sc.nextInt();
            Pair p =new Pair(x,y);
            Pair result = set.ceiling(p);
            if(result==null){
                System.out.println(-1+" "+-1);
            }else{
                System.out.println(result.x+ " " +result.y);
            }
        }
    }
}