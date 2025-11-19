import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         k = sc.nextInt();
         n = sc.nextInt();
         arr = new int[n];
        // Please write your code here.
        recur(0,1);
    }
    static int k,n;
    static int[] arr;
    static void recur(int idx, int cnt){
        if(idx==n){
            if(n>1&&k>1&&cnt==n)return;
            print();
            return;
        }
        for(int i =1;i<=k;i++){
            
            arr[idx]=i;
            if(idx-1>=0&&arr[idx-1]==i){
                recur(idx+1,cnt+1);
            }else{
                recur(idx+1,1);
            }
        }
    }
    static void print(){
        for(int i = 0 ; i < n ; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}