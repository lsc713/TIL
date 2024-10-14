import java.util.*;
class Main{
    static class Pos implements Comparable<Pos>{
        int s,t;
        public Pos(int s,int t){
            this.s=s;
            this.t=t;
        }
        @Override
        public int compareTo(Pos o){
            return Integer.compare(this.s,o.s);
        }
    }
    public static void main(String[] args){
       Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        List<Pos> list = new ArrayList<>();
        for(int i = 0;i<n;i++){
            int s=sc.nextInt();
            int t = sc.nextInt();
            list.add(new Pos(s,t));
        }
        Collections.sort(list);
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.offer(0);
        for(int i =0;i<n;i++){
            if(list.get(i).s>=pq.peek()){
                pq.poll();
            }
            pq.offer(list.get(i).t);
        }
        System.out.println(pq.size());
    }
}