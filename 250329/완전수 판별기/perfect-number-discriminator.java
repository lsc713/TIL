import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String result = "P";
        int temp =0;
        for(int i = 1;i<n;i++){
            if(n%i==0){
                temp+=i;
            }
        }
        
        if(temp!=n){
            result = "N";
        }
        System.out.println(result);
    }
}