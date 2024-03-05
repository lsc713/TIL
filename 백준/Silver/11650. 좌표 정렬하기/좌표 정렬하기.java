import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int[][] b = new int[a][2];
        
        for(int i = 0; i < a ; i++){
            b[i][0] = sc.nextInt();
            b[i][1] = sc.nextInt();
        }
        Arrays.sort(b,(e1,e2)->{
            if(e1[0] == e2[0]){
                return e1[1]-e2[1];
            }else{
                return e1[0]-e2[0];
            }
        });
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < a ; i++){
            sb.append(b[i][0]+" "+b[i][1]).append('\n');
        }
        System.out.println(sb);
    }
}