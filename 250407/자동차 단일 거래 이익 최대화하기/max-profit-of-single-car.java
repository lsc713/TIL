import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0 ; i < n ; i ++ ){
            arr[i] = sc.nextInt();
        }
        int result =arr[n-1];
        int j=0;
        for(int i = n-2 ; i >=1 ; i --){
            if(j<result-arr[i]){
                j=result-arr[i];
            }else{
                result = arr[i];
            }
        }
        System.out.println(j);
    }
}