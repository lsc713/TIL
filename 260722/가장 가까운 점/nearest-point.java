import java.util.*;

public class Main {
    static class Pair implements Comparable<Pair>{
        int x;int y;
        public Pair(int x,int y){
            this.x=x;
            this.y=y;
            
        }
        @Override
        public int compareTo(Pair p){
            long s1 = this.x+this.y;
            long s2 = p.x+p.y;
            if(s1!=s2){
                return Long.compare(s1,s2);
            }
            if(this.x==p.x){
                return this.y-p.y;
            }
            return this.x-p.x;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        PriorityQueue<Pair> pq = new PriorityQueue<>();
        
        for (int i = 0; i < n; i++) {
            pq.add(new Pair(sc.nextInt(),sc.nextInt()));
        }
        for(int i = 0 ; i <m;i++){
            Pair tp = pq.poll();
            Pair newTP= new Pair(tp.x+2,tp.y+2);
            pq.add(newTP);
            
        }
        Pair ans = new Pair(1000000001,1000000001);
        for(Pair p : pq){
            if(ans.x +ans.y > p.x+p.y){
                ans = new Pair(p.x,p.y);
            }
        }
        System.out.println(ans.x+ " " + ans.y);
        // Please write your code here.
    }
}