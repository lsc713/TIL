import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] input = sc.next().split("");
        int temp =1;
        String result ="";
        for(int i = 1 ; i<input.length;i++){
            if(input[i].equals(input[i-1])){
                temp++;
            }else{
                result+=input[i-1];
                if(temp!=1){
                    result+=temp;
                    temp=1;
                }else{
                    result+=temp;
                }
            }
        }
        result+=input[input.length-1]+temp;
        System.out.println(result.length());
        System.out.println(result);
    }
}