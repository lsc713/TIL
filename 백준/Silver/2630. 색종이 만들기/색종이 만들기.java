import java.util.*;
class Main{
    static int[][] matrix;
    static int white=0;
    static int blue=0;
    static int n;
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        matrix = new int[n][n];
        for(int i =0 ; i<n;i++){
            for(int j =0 ; j<n;j++){
                matrix[i][j]=sc.nextInt();
            }
        }
        matrix(0,0,n);
        System.out.println(white);
        System.out.println(blue);
    }
    static void matrix(int x,int y,int size){
        if(colorCheck(x,y,size)){
            if(matrix[x][y]==0){
                white++;
            }else{
                blue++;
            }
            return;
        }
        int newSize = size/2;
        matrix(x,y,newSize);
        matrix(x,y+newSize,newSize);
        matrix(x+newSize,y,newSize);
        matrix(x+newSize,y+newSize,newSize);
    }
    static boolean colorCheck(int x,int y,int size){
        int color = matrix[x][y];
        for(int i = x;i<x+size;i++){
            for(int j =y;j<y+size;j++){
                if(matrix[i][j]!=color){
                    return false;
                }
            }
        }
        return true;
    }
}