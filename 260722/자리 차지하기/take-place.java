import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        TreeSet<Integer> set = new TreeSet<>();
        for(int j = 1 ; j <=m;j++){
            set.add(j);
        }

        //순회하면서 하나씩 넣어서 안들어가면 종료하고 ans
        int ans=0;
        for(int i = 0 ; i <n;i++){
            int num = sc.nextInt();
            Integer seat = set.floor(num);
            if(seat==null){
                break;
            }
            set.remove(seat);
            ans++;

        }
        System.out.println(ans);
        // Please write your code here.
    }
}