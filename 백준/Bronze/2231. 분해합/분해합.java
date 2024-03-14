import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int size = String.valueOf(n).length();
        int start = n - (size*9);
        int result =0;
        for(int i = start;i<n;i++){
            int sum = 0;
            int k = i;
            while(k!=0){
                sum+=k%10;
                k/=10;
            }
            if(sum+i==n){
                result = i;
                break;
            }
        }
    System.out.println(result);
        
    }
}