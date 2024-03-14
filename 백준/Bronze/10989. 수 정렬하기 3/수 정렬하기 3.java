import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
       StringBuilder sb = new StringBuilder();
        int[] arr = new int[a];
        for(int i = 0;i<a;i++){
            arr[i] = Integer.parseInt(br.readLine());
        }
        Arrays.sort(arr);
        for(int i =0;i<a;i++){
            sb.append(arr[i]).append('\n');
        }
        System.out.println(sb);
    }
}