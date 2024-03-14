import java.io.*;
import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int c = Integer.parseInt(br.readLine());
        StringTokenizer st;
        
        
        for(int i =0;i<c;i++){
            st = new StringTokenizer(br.readLine()," ");
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        bw.write((a+b)+"\n");
        }
        br.close();
            bw.flush();
            bw.close();
        
        
    }
}