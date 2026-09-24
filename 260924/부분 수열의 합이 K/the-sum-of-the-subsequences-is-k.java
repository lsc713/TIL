import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];
        int[] arr2 = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        arr2[0]=arr[0];
        for(int i = 1 ; i < n ;i ++){
            arr2[i]=arr[i]+arr2[i-1];
        }
        int ans =0;
        for(int start =0 ; start < n; start++){
            for(int end = start ; end<n;end++){
                int sum = arr2[end];
                if(start>0){
                    sum-=arr2[start-1];
                }
                if(sum==k){
                    ans++;
                }
            }
        }
        System.out.println(ans);
        
        // Please write your code here.
    }
}