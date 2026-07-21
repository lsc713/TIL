import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int  T = sc.nextInt();
        for(int t = 0 ; t < T;t++){
            TreeSet<Integer> set = new TreeSet<>();
            int K = sc.nextInt();
            for(int i=0;i<K;i++ ){
                char cmd = sc.next().charAt(0);
                if(cmd=='I'){
                    set.add(sc.nextInt());
                }else if(cmd=='D'){
                    int num = sc.nextInt();
                    if(num==1){
                        if(set.isEmpty()){
                            continue;
                        }
                        set.remove(set.last());
                    }
                    else if(num==-1){
                        if(set.isEmpty()){
                            continue;
                        }
                        set.remove(set.first());
                    }
                    
                }
            }
            if(set.isEmpty()) System.out.println("EMPTY");
            else System.out.println(set.last()+" "+set.first());

        }
        // Please write your code here.
    }
}