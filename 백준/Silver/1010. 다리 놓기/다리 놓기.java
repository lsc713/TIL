import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i =0;i<t;i++){
            int n =sc.nextInt();
            int m = sc.nextInt();
            System.out.println(comb(m,n));
        }
        
    }
    static int[][] dp=new int[30][30];
    static int comb(int n,int r){
        if(r==n||r==0){
            return 1;
        }
        if(dp[n][r]>0){
            return dp[n][r];
        }
        return dp[n][r]=comb(n-1,r)+comb(n-1,r-1);
    }
}