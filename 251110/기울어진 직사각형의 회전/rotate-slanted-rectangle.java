import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] grid = new int[n][n];
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                grid[i][j] = sc.nextInt();
        int r = sc.nextInt()-1;
        int c = sc.nextInt()-1;
        int m1 = sc.nextInt();
        int m2 = sc.nextInt();
        int m3 = sc.nextInt();
        int m4 = sc.nextInt();
        int dir = sc.nextInt();//0반시계 1 시계
        int tr=r;
        int tc=c;
        int gr=r;
        int gc=c;
        int[][] temp = new int[n][n];
        int tmp =grid[r][c];
        for(int i = 0 ; i < n ;i++){
            System.arraycopy(grid[i],0,temp[i],0,n);
        }

        if(dir==1){
            
            for(int i =0;i<m4;i++){
                temp[--tr][--tc]=grid[gr--][gc--];
            }
            for(int i =0;i<m3;i++){
                temp[--tr][++tc]=grid[gr--][gc++];
            }
            for(int i =0;i<m2;i++){
                temp[++tr][++tc]=grid[gr++][gc++];
            }
            for(int i =0;i<m1;i++){
                temp[++tr][--tc]=grid[gr++][gc--];
            }
            
            

        }else{
            for(int i =0;i<m1;i++){
                temp[--tr][++tc]=grid[gr--][gc++];
            }
            for(int i =0;i<m2;i++){
                temp[--tr][--tc]=grid[gr--][gc--];
            }
            for(int i =0;i<m3;i++){
                temp[++tr][--tc]=grid[gr++][gc--];
            }
            for(int i =0;i<m4;i++){
                temp[++tr][++tc]=grid[gr++][gc++];
            }
        }
        for(int i = 0 ; i < n ; i++){
            for(int j =0;j<n;j++){
                grid[i][j]=temp[i][j];
            }
        }
        for(int i = 0 ; i < n ; i++){
            for(int j =0;j<n;j++){
                System.out.print(grid[i][j]+" ");
            }
            System.out.println();
        }
        
        // Please write your code here.
    }
}