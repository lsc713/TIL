import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int c = sc.nextInt();
        int[] b = new int[a];
        for(int i = 0; i<a;i++){
        b[i] = sc.nextInt();
        }
        int cnt = 0;
        for(int i =a-1;i>=0;i--){
            if(b[i]<=c){
                cnt+=c/b[i];
                c=c%b[i];
            }
        }
        System.out.println(cnt);
    }
}