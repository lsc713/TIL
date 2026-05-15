import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n+1];
        int t =0;
        for(int i = 1 ; i <= n ; i++){
            arr[i]=sc.nextInt();
        }
        int[] dp = new int[n+1];
        Arrays.fill(dp,-1001);
        
        dp[0]=0;
        int ans=-1001;
        for(int i=1;i<=n;i++){
            dp[i] = Math.max(dp[i-1]+arr[i],arr[i]);
            ans = Math.max(ans,dp[i]);
        }
        /*
        dp = 1~i 항목 까지 봤을 때 최댓값임.
        그럼 dp최기화는 최솟값 여기선 최소 -1001로 초기화해야함.
        dp[0] =0 임. 아무것도 보지 않고 만들 수 있는 최댓값이므로.
        이후에는 dp[i-1],arr[i] 중 큰 값으로 dp[i]를 업데이트하면됨.

        그리고 모든 항목을 보면서 최댓값을 ans로 출력하면될듯

        */
        System.out.println(ans);

        
        // Please write your code here.
    }
}