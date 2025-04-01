import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int cnt = 0;
        for(int i = 0 ; i <n;i++){
            if(i%2==0){
                if(i!=0)cnt+=n;
                for(int j = 0 ; j<n;j++){
                    System.out.print(cnt+=1);
                    System.out.print(" ");
                }
            }
            else{
                cnt+=n;
                for(int j = n-1 ; j>=0;j--){
                    System.out.print(cnt--);
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}