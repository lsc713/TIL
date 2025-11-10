import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        grid = new int[4][4];
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                grid[i][j] = sc.nextInt();
            }
        }
        char dir = sc.next().charAt(0);
        // Please write your code here.
        transform(dir);
        move();
        sum();
        move();
        normal(dir);
        
        for(int i = 0 ; i < 4;i++){
            for(int j = 0 ;j < 4;j++){
                System.out.print(grid[i][j]+ " " );
            }
            System.out.println();
        }
    }
    static void normal(char dir){
        int n = 4;
        int[][] temp = new int[n][n];
        if(dir=='L'){
            return;
        }else if(dir=='R'){
            for(int i = 0 ; i <4;i++){
                for(int j = 0 ; j < 4;j++){
                    temp[i][j]=grid[i][4-j-1];
                }
            }
        }else if(dir=='U'){
            for(int i = 0 ; i <4;i++){
                for(int j = 0 ; j < 4;j++){
                    temp[i][j]=grid[j][4-i-1];
                }
            }
        }else{
            for(int i = 0 ; i <4;i++){
                for(int j = 0 ; j < 4;j++){
                    temp[i][j]=grid[4-j-1][4-i-1];
                }
            }
            
        }
        grid=temp;
    }
    static void transform(char dir){
        int n = 4;
        int[][] temp = new int[n][n];
        if(dir=='L'){
            return;
        }else if(dir=='R'){
            for(int i = 0 ; i <4;i++){
                for(int j = 0 ; j < 4;j++){
                    temp[i][j]=grid[i][4-j-1];
                }
            }
        }else if(dir=='U'){
            for(int i = 0 ; i <4;i++){
                for(int j = 0 ; j < 4;j++){
                    temp[i][j]=grid[4-j-1][4-i-1];
                }
            }
        }else{
            for(int i = 0 ; i <4;i++){
                for(int j = 0 ; j < 4;j++){
                    temp[i][j]=grid[j][4-i-1];
                }
            }
        }
        grid=temp;
    }
    static int[][] grid;
    static void move(){
        int[][] temp = new int[4][4];
        for(int i = 0 ; i < 4; i++){
            System.arraycopy(grid[i],0,temp[i],0,4);
        }
        
        //숫자 몰아주기
        for(int i = 0 ; i <4;i++){
            for(int j = 0 ; j < 3;j++){
                if(temp[i][j]==0){
                    temp[i][j]=temp[i][j+1];
                    temp[i][j+1]=0;
                }
            }
        }
        for(int i = 0 ; i < 4;i++){
            for(int j = 0 ; j < 4;j++){
                grid[i][j] = temp[i][j];
            }
        }
    }
    static void sum(){
        int[][] temp = new int[4][4];
        for(int i = 0 ; i < 4; i++){
            System.arraycopy(grid[i],0,temp[i],0,4);
        }       
        //같은 숫자가 나오면 합쳐주기
        for(int i = 0 ; i <4;i++){
            for(int j = 1 ; j < 4;j++){
                if(temp[i][j]==temp[i][j-1]){
                    temp[i][j-1]+=temp[i][j];
                    temp[i][j]=0;
                }
            }
        }
        for(int i = 0 ; i < 4;i++){
            for(int j = 0 ; j < 4;j++){
                grid[i][j] = temp[i][j];
            }
        }
    }
}