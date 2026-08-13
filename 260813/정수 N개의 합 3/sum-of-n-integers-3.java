import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new  Scanner(System.in);
        int n = sc.nextInt(); 
        int k = sc.nextInt();
        int[][] matrix = new int[n+1][n+1];
        for(int i = 0 ; i < n ; i ++){
            for(int j = 0 ; j < n;j++){
                int v = sc.nextInt();
                matrix[i+1][j+1]=matrix[i][j+1]+matrix[i+1][j]-matrix[i][j]+v;
            }
        }
        int ans =0;
        for(int a=0;a<=n-k;a++){
            for(int b= 0; b<=n-k;b++){
                int temp = matrix[a+k][b+k]-matrix[a][b+k]-matrix[a+k][b]+matrix[a][b];
                ans=Math.max(ans,temp);
            }
        }
        
        
        System.out.println(ans);

        
        
        // Please write your code here.
    }
}