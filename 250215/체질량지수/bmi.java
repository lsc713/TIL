import java.util.*;
import java.io.*;
class Main{
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        st = new StringTokenizer(br.readLine());
        int h = Integer.parseInt(st.nextToken());
        int w = Integer.parseInt(st.nextToken());
        int b = (int)(10000*w)/(h*h);
        System.out.println(b);
        if(b>=25){
            System.out.println("Obesity");
        }
    }
}