import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        int a = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] value= new int[a];
        for(int i = 0 ; i< a;i++){
            value[i] = Integer.parseInt(st.nextToken());
        }
        int count =0;
        int b = Integer.parseInt(br.readLine());
        for(int i = 0 ; i<value.length;i++){
            if(value[i]==b) count++;
        }
        System.out.println(count);
    }
}