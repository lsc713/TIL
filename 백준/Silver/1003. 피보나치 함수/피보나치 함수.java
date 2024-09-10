import java.util.*;
class Main{
    static int zero;
    static int one;
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for(int tc = 1;tc<=T;tc++){
            int n = sc.nextInt();
            int zero = 1;
            int one = 0;
            for(int i = 0 ; i<n;i++){
                int tmp = zero;
                zero = one;
                one = tmp+one;
            }
            System.out.println(zero+" "+one);

        }
    }
}