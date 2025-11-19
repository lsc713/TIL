import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         k = sc.nextInt();
         n = sc.nextInt();
         arr = new int[n];
        // Please write your code here.
        recur(0);
    }
    static int k,n;
    static int[] arr;
    static void recur(int idx){
        if(idx==n){
            print();
            return;
        }
        for(int i =1;i<=k;i++){
            if(idx>=2&&arr[idx-2]==i&&arr[idx-1]==i) continue;
            arr[idx]=i;
            recur(idx+1);
        }
    }
    static void print(){
        for(int i = 0 ; i < n ; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}