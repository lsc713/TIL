import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println(recur(a,0));
    }
    static int recur(int a,int cnt){
        if(a<2){return cnt;}
        return Math.min(recur(a/2,cnt+1+(a%2)),recur(a/3,cnt+1+(a%3)));
    }
}