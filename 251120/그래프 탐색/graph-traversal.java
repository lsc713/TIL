import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        List<Integer>[] list = new ArrayList[n+1];
        for(int i=1;i<=n;i++){
            list[i]= new ArrayList<>();
        }
        boolean[] v = new boolean[n+1];
        for (int i = 0; i < m; i++) {
            int num = sc.nextInt();
            int idx = sc.nextInt();
            list[num].add(idx);
            list[idx].add(num);
        }
        int cnt=0;
        Deque<Integer> d =new LinkedList<>();
        d.add(1);v[1]=true;
        while(!d.isEmpty()){
            int index=d.poll();
            for(int i=0;i<list[index].size();i++){
                if(!v[list[index].get(i)]){
                    v[list[index].get(i)]=true;
                    cnt++;
                    for(int vl:list[index]){
                        d.add(vl);
                    }
                }
            }
        }
        System.out.println(cnt);
        // Please write your code here.
    }
}