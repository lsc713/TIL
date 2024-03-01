import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int cnt = 1;
        int b = 0;
        int c = 1;
        while(a!=1){
            c += b*6;
            if(a<=c)break;
            b++;
            cnt++;
        }
        
        System.out.println(cnt);
    }
}