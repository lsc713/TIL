import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr = new int[n];
        boolean[] dp = new boolean[m+1];
        dp[0]=true;
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        for(int i = 0 ; i < n ;i++){
            for(int j=m;j>=arr[i];j--){
                dp[j]|=dp[j-arr[i]];
            }
        }

        System.out.println(dp[m] ?"Yes":"No");
        // Please write your code here.
    }
}