import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int x = Integer.parseInt(st.nextToken());
        int y = Integer.parseInt(st.nextToken());
        int[][] arr= new int[x][y];
        int[][] arr2= new int[x][y];
        for(int i = 0 ; i < x;i++){
            st = new StringTokenizer(br.readLine());
            for(int j = 0; j < y ; j++){
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        for(int i = 0 ; i < x;i++){
            st = new StringTokenizer(br.readLine());
            for(int j = 0; j < y ; j++){
                arr2[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        StringBuilder sb = new StringBuilder();
        for(int i = 0 ; i < x;i++){
            
            for(int j = 0; j < y ; j++){
                sb.append((arr[i][j] +arr2[i][j])+" ");
                
            }
            sb.append("\n");
        }
        System.out.println(sb);
    }
}