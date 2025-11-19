import java.util.Scanner;

public class Main {
    static int k,n;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         k = sc.nextInt();
         n = sc.nextInt();
         arr = new int[n];
        // Please write your code here.
        recur(0);
    }
    static void recur(int r){
        if(r == n){
            print();
            return;
        }
        for(int i = 1; i <=k;i++){
            arr[r]=i;
            recur(r+1);
        }
    }
    static int[] arr;
    static void print(){
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}