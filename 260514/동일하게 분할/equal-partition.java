import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n+1];
        int s =0;
        for(int i =1 ;i<n+1;i++){
            arr[i]=sc.nextInt();
            s+=arr[i];
        }
        boolean[][] dp = new boolean [n+1][s+1];
        dp[0][0]=true;
        for(int i =1 ; i <=n;i++){
            for(int j = 0 ; j<=s;j++){
                if(j>=arr[i]){
                    //a에 넣는경우 b에 넣는경우
                    dp[i][j]= dp[i-1][j]||dp[i-1][j-arr[i]];
                }else{
                    dp[i][j]= dp[i-1][j];
                }
            }
        }
        //dp[i]까지봤을때 a의 합이 j일때 b값과 같은지 다른지
        //총합에서 j값을 빼서 값이 같은지
        // for(int i = 1 ;i <=s;i++){
        //     if(dp[n][i]){

        //     }
        // }
        if(s%2==0){
            System.out.println(dp[n][s/2] ? "Yes":"No");
        }else{
            System.out.println("No");
        }
        
        // Please write your code here.
    }
}