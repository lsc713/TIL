import java.util.Scanner;
public class Main {
    static int n;
    static int[] arr;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();v=new boolean[n+1];
        arr=new int[n];
        recur(0);
        // Please write your code here.
    }
    static void print(){for(int i=0;i<n;i++){System.out.print(arr[i]+" ");}System.out.println();}
    static void recur(int idx){
        if(idx==n){
            print();return;
        }
        for(int i=0;i<n;i++){
            if(!v[i+1]){
                v[i+1]=true;
                arr[idx]=i+1;
            recur(idx+1);
            v[i+1]=false;
            }
        }
    }
    static boolean[] v;
}