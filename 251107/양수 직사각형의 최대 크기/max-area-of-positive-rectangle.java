import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] grid = new int[n][m];
        for (int i = 0; i < n; i++)
            for (int j = 0; j < m; j++)
                grid[i][j] = sc.nextInt();
        // Please write your code here.
        int sum=-1;
        for(int i = 0 ; i < n ; i ++){
            for(int j=0;j<m;j++){
                for(int k=i;k<n;k++){
                    for(int l=j;l<m;l++){
                        boolean flag = true;
                        int temp=0;
                        for(int a=i;a<=k;a++){
                            for(int b=j;b<=l;b++){
                                if(grid[a][b]<=0){
                                    flag=false;
                                    break;
                                }
                                temp++;
                            }
                        }
                        if(flag){
                            sum=Math.max(sum,temp);
                        }
                        
                    }
                }
            }
        }
        System.out.println(sum);
    }
}