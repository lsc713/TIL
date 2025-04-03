import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int q = sc.nextInt();
        int[] arr = new int[n+1];
        for(int i = 1 ; i <= n ; i++){
            arr[i] = sc.nextInt();
        }
        for(int i = 0 ; i <q;i++){
            int item = sc.nextInt();
            if(item==1){
                System.out.println(arr[sc.nextInt()]);
            }else if(item == 2){
                int b = sc.nextInt();
                boolean flag = true;
                for(int j = 1 ; j <= n ;j++){
                    if(arr[j]==b){
                        flag = false;
                        System.out.println(j);
                        break;
                    }
                }
                if(flag){
                    System.out.println(0);
                }
            }else{
                int s = sc.nextInt();
                int e = sc.nextInt();
                for(int j=s;j<=e;j++){
                    System.out.print(arr[j]+" ");
                }
                System.out.println();
            }
        }
    }
}