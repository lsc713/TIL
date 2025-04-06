import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0 ; i <n;i++){
            arr[i]=sc.nextInt();
        }
        boolean flag = true;
        int finish = arr.length;
        while(flag){
            int temp = 0;
            int tempIdx =0;
            for(int i=0;i<finish;i++){
                if(arr[i] >temp){
                    temp = arr[i];
                    tempIdx = i;
                }
            }
            if(temp == arr[0]){
                System.out.print(1);
                break;
            }
            System.out.print(tempIdx+ 1 +" ");
            finish=tempIdx;
        }
        

    }
}