import java.io.*;
import java.util.*;


public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int[] c = new int[a];
        int sum=0;
        int tmp=0;
        for(int i =0;i<a;i++){
            c[i] = sc.nextInt();
        }
        for(int i = 0;i<a;i++){
        for(int j = i+1;j<a;j++){
        for(int k = j+1;k<a;k++){
            sum = c[i]+c[j]+c[k];
            if(tmp<sum&&sum<=b)tmp=sum;
        }
            
        }
            
        }
        System.out.println(tmp);
    }
}