import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] map = new int[n][m];
        int cnt =1;
        for(int k=0;k<n+m-1;k++){
            for(int i = 0 ; i < n ; i++){
                for(int j =0;j<m;j++){
                    if(k==i+j){
                        map[i][j]=cnt;
                        cnt++;
                    }
                }
            }
        }
        for(int i = 0 ; i < n ; i++){
            for(int j = 0 ; j <m;j++){
                System.out.printf("%d ", map[i][j]);
            }
            System.out.println();
        }
    }
}