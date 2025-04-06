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
        int result =0;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int minIdx=0;
        for(int i = 0 ; i < n ; i ++){
            
            if(min>arr[i]){
                min=arr[i];
                minIdx=i;
            }
        }
        for(int i = 0 ; i < n ; i ++){
            if(max<arr[i]&&minIdx<i){
                max = arr[i];
            }
        }
        result=max-min;
        if(result==Integer.MAX_VALUE){
            result=0;
        }
        System.out.println(result);
    }
}