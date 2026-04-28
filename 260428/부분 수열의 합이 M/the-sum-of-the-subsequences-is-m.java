import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr = new int[n];
        int[] dp = new int[m+1];
        
        Arrays.fill(dp,Integer.MAX_VALUE);
        dp[0]=0;
        
        int ans =0;
        
        for(int i = 0 ; i < n ; i++){
            arr[i]=sc.nextInt();
        }
        
        for(int i = 0 ;i<n;i++){
            for(int j=m;j>=0;j--){
                if(j>=arr[i]){
                    if(dp[j-arr[i]]==Integer.MAX_VALUE){
                        continue;
                    }
                    dp[j]=Math.min(dp[j],dp[j-arr[i]]+1);
                }
                
            }
        }
        ans = dp[m];
        if(dp[m]==Integer.MAX_VALUE) ans =-1;
        System.out.println(ans);
        // Please write your code here.
    }
}