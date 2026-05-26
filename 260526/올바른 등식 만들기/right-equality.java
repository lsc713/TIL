import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int[] numbers = new int[N+1];
        for (int i = 1; i <= N; i++) {
            numbers[i] = sc.nextInt();
        }
        long[][] dp = new long[N+1][41];
        dp[0][20]=1;
        for(int i=1;i<=N;i++){
            for(int j = 0 ; j < 41;j++){
                int sub=j-numbers[i];
                int add=j+numbers[i];
                if(sub>=0&&sub<=40){
                    dp[i][j]+=dp[i-1][sub];
                }
                if(add>=0&&add<=40){
                    dp[i][j]+=dp[i-1][add];
                }
            }
        }

        System.out.println(dp[N][M+20]);
        // Please write your code here.
    }
}