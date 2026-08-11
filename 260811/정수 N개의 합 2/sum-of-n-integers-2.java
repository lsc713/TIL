import java.util.*;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        int k = sc.nextInt();
        int[] temp = new int[n+1];
        for(int i = 1 ; i <= n;i++){
            temp[i]=sc.nextInt();
        }
        int[] arr =new int[n+1];
        for(int i = 1;i<=n;i++){
            arr[i] = arr[i-1]+temp[i];
        }
        int ans=0;
        for(int i = k;i<=n;i++){
            ans=Math.max(ans,arr[i]-arr[i-k]);
        }
        System.out.println(ans);
    }
}