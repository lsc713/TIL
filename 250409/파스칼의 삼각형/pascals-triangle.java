import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n][n];
        for(int i = 0 ; i < n ; i ++){
            for(int j = 0 ; j<=i;j++){
                if(j==0||j==i){
                    arr[i][j]=1;
                }else{
                    arr[i][j] = arr[i-1][j]+arr[i-1][j-1];
                }
            }
        }
        for(int i = 0 ; i < n ; i++){
            for(int j = 0 ; j<=i;j++){
                System.out.print(arr[i][j]+ " ");
            }
            for(int j = 0 ; j<n-1-i;j++){
                System.out.print("  ");
            }   
            System.out.println();
        }
    }
}