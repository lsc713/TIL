import java.io.IOException;
import java.util.Scanner;
class Main{
    public static void main(String[] args) throws NumberFormatException, IOException{
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        int m =sc.nextInt();
        int[] arr = new int[n+1];
        for(int i = 1;i<arr.length;i++) {
        	arr[i] = i;
        }
        for(int i = 0 ; i <m;i++) {
        	int a = sc.nextInt();
        	int b = sc.nextInt();
        	int tmp = arr[a];
        	arr[a] = arr[b];
        	arr[b] = tmp;
        }
        
        for(int val : arr) {
        	if(val==0)continue;
        	System.out.print(val+" ");
        }
        
    }
}
    