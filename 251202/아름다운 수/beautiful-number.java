import java.util.Scanner;
public class Main {
    static int cnt;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        cnt=0;
        calc(0,n);
        System.out.println(cnt);
        // Please write your code here.
    }
    static void calc(int idx,int current){
        if(idx==current){
            cnt++;
            return;
        }
        for(int i =1;i<=4;i++){
            if(idx+i<=current){
                calc(idx+i,current);
            }
        }
    }
}