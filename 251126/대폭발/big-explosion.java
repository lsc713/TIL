import java.util.Scanner;

public class Main {
    static int[][] matrix;
    static int n,m,r,c;
    static int[] dx = {-1,1,0,0};
    static int[] dy = {0,0,-1,1};

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         n = sc.nextInt();
         m = sc.nextInt();
         r = sc.nextInt()-1;
         c = sc.nextInt()-1;
         matrix=new int[n][n];
         matrix[r][c]=1;
         int cnt=0;
        
        for(int i = 1;i<=m;i++){
            add(i);
        }
        for(int i = 0 ; i < n ;i++){
            for(int j = 0 ; j < n ;j++){
                cnt+=matrix[i][j];
            }
        }
        System.out.println(cnt);
        // Please write your code here.
    }
    static boolean in(int x,int y){
        return 0<=x&&x<n&&0<=y&&y<n;
    }
    
    static void add(int second){
        int[][] tmp = new int[n][n];
        for(int i = 0 ; i < n ; i++){
            tmp[i]=matrix[i].clone();
        }
        
        int pow = 1;
        for(int i = 1 ; i <second;i++){
            pow*=2;
        }
        for(int i = 0 ; i < n ;i++){
            for(int j = 0 ; j < n ;j++){
                if(matrix[i][j]==1){
                    for(int d=0;d<4;d++){
                        int nx = i+dx[d]*pow;
                        int ny = j+dy[d]*pow;
                        if(in(nx,ny)){
                            tmp[nx][ny]=1;
                        }
                    }
                }
            }
            
        }
        // for(int a = 0 ; a < n ;a++){
        //     for(int b = 0 ; b < n ;b++){
        //         System.out.print(tmp[a][b]+" ");
        //     }
        //     System.out.println();
        // }
        // System.out.println("==============");
        for(int i = 0 ; i < n ; i++){
            matrix[i]=tmp[i].clone();
        }
    }
}