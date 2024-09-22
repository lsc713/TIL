import java.util.*;
class Main{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] dp = new int[n+1];
        /*
        * dp table n+1.
        * 1로만들기. 1-> 0
        * 2 == 1로빼도되고 2로나누어기 또는 1빼기
        * 3 3나누기
        * 4 2로나누고 1빼기
        * ...
        * 작은 숫자에서 했던 내용을 반영해서 비교하기.
        * */
//        dp[1] = 0;이지만 안해도되고
        for(int i=2;i<=n;i++){
            /*
            * 1을 뺄 수 있으므로 i는 i-1에서 1더한 값일 수 있는데 하기와 같이 비교될 수 있음
            * dp table은 문제에서 요구하는 연산회수를 구해야하므로 2를 나누거나 3으로 나누는 경우 연산회수가 증가하며 4는 2로 나누어지므로 dp[2]의 값에 연산회수 추가.
            * */
            dp[i] = dp[i-1]+1;
//            System.out.println(dp[i]+"dp[i]");
            if (i % 3 == 0) {
                dp[i] = Math.min(dp[i],dp[i/3]+1);
            } 
            if (i % 2 == 0) {
                dp[i] = Math.min(dp[i],dp[i/2]+1);
//                System.out.println(dp[i]+"dp[i/2]");
            }
        }
        System.out.println(dp[n]);
    }
}