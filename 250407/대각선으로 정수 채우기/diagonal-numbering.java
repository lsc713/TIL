import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int count = 1;
        int[][] arr = new int[100][100];
        for(int row = 0 ; row < n ; row++){
            for(int col=0;col<m;col++){
                if(arr[row][col]==0){
                    int curCol=col;
                    int curRow=row;
                    while(curCol>=0&&curRow<n){
                        arr[curRow][curCol]=count;
                        curRow++;
                        curCol--;
                        count++;
                    }
                }
            }
        }
        for(int row = 0 ; row<n;row++){
            for(int col=0;col<m;col++){
                System.out.print(arr[row][col]+" ");
            }
            System.out.println();
        }
    }
}