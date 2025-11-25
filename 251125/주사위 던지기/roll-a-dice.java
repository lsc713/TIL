import java.util.Scanner;

public class Main {
    static int[][] matrix;
    static int n,m,r,c;
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         n = sc.nextInt();//격자크기/
         m = sc.nextInt();
         r = sc.nextInt()-1;
         c = sc.nextInt()-1;
         matrix = new int[n][n];
         int ans=0;
        matrix[r][c]=dice[1];
        
        
        for (int i = 0; i < m; i++) {
            String dir = sc.next();
            int nr = r;
            int nc = c;
            if(dir.equals("L")){
                nc=c-1;
            }else if(dir.equals("R")){
                nc=c+1;
            }else if(dir.equals("U")){
                nr=r-1;
            }else if(dir.equals("D")){
                nr=r+1;
            }
            if(!in(nr,nc))continue;
            roll(dir);
            r=nr;
            c=nc;
            matrix[r][c]=dice[1];
            // for(int a=0;a<n;a++){
            //     for(int b = 0 ; b<n;b++){
            //         System.out.print(matrix[a][b]+" ");
            //     }
            //     System.out.println();
            // }
            // System.out.println("=========================");
        }

        for(int i=0;i<n;i++){
            for(int j = 0 ; j<n;j++){
                ans+=matrix[i][j];
            }
        }
        System.out.println(ans);
    }
    //위 아래 남 북 동 서
    static int[] dice = {1,6,2,5,3,4};
    static void roll(String dir){
        int t;
        if(dir.equals("L")){
            t=dice[0];
            dice[0]=dice[4];
            dice[4]=dice[1];
            dice[1]=dice[5];
            dice[5]=t;
        }else if(dir.equals("R")){
            t=dice[0];
            dice[0]=dice[5];
            dice[5]=dice[1];
            dice[1]=dice[4];
            dice[4]=t;
        }else if(dir.equals("U")){
            t=dice[0];
            dice[0]=dice[2];
            dice[2]=dice[1];
            dice[1]=dice[3];
            dice[3]=t;
        }else if(dir.equals("D")){
            t=dice[0];
            dice[0]=dice[3];
            dice[3]=dice[1];
            dice[1]=dice[2];
            dice[2]=t;
        }
    }
    static boolean in(int x,int y){
        return 0<=x&&x<n&&0<=y&&y<n;
    }
}