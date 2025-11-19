import java.util.Scanner;

public class Main {
    static int n,m;
    static int[] arr;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         n = sc.nextInt();
        m = sc.nextInt();
        arr= new int[m];
        comb(0,1);
        // Please write your code here.
    }
    static void print(){
 for(int i=0;i<m;i++){System.out.print(arr[i]+" ");}System.out.println();
    }
    static void comb(int idx,int cnt){
        if(idx==m){
            print();return;
        }
        for(int i=cnt;i<=n;i++){
            arr[idx]=i;
            comb(idx+1,i+1);
        }
    }
}