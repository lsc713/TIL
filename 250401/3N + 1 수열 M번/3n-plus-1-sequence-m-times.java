import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        for(int i = 0 ; i <m;i++){
            int cnt=0;
            int n = sc.nextInt();
            while(n!=1){
                cnt++;
                if(n%2==0){
                    n/=2;
                }else{
                    n=n*3+1;
                }
            }
            System.out.println(cnt);
        }

    }
}