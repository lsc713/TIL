import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n+1];
        for(int i = 1 ; i <= n ;i++){
            arr[i]=sc.nextInt();
        }
        int[][] dp = new int[n+1][4];
        /*
        1~i까지 j 번의 계단 1개 오르는 횟수 사용시 동전의 갯수여야하나?
        그럼 j 번은 i번의 영향을 받는다면.. i번까지 순회를하도록하고, 대신 i가 3보다 큰 경우에는 3까지 순회되게해야하긴하는데(1계단 찬스가 3번이니)
        그럼 1계단 기회한번도 안쓴경욲자해서 n+1,4로해보기로하고
        dp[0][0]=0 인데 그럼 다른 곳은 초기화가 되야하나 이 문제는 동전개수가 1~1000까지니까 더하기만하면되서 초기화는 안해도될 것 같은데 오케이.

        dp 우변을 고를려면.. 이전 내용 그대로랑, 1계단 골라서 동전 추가했을 때, 2계단골라서 동전 추가했을떄 중에 가장 큰걸 골라야하고, 1계단 추가시에는 기회가 1회차감되어야함.
        그럼 여기서 1회 계단을 초반에 3번 다썼는데 이후에 동전이 엄청많은 경우에는 어떻게 해야하지? 그럼 동전을 안쓴경우 케이스에서 더해지려나 .. 그럼 기회라는 변수가 필요 없으려나
        int chance = 3 같은


        */
        for(int[] row : dp)Arrays.fill(row,-1);
        dp[0][0]=0;
        for(int i = 1; i <=n;i++){
            for(int j = 0;j<=3;j++){
                //기회가 남았다면 아니야... 변수를 넣으면 이런식으로했을때 앞에서 다 소진시키는 케이스가 생겨서 어울리지 않음. 그러면 기회소진시킨다고 가정하면 i-1,j+1 +arr[i] 이런식으로 되야할 거 같은데
                int best = -1;
                if(i>=1&&j>=1 && dp[i-1][j-1]!=-1){
                    best = Math.max(best,dp[i-1][j-1]+arr[i]);
                }
                if(i>=2 && dp[i-2][j]!=-1){
                    best = Math.max(best,dp[i-2][j]+arr[i]);
                }
                dp[i][j]=best;
            }
        }
        int ans =0;
        for(int i = 0 ; i < 4 ; i ++){
            ans =Math.max(ans,dp[n][i]);
        }
        System.out.println(ans);
        // Please write your code here.
    }
}