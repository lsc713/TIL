import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        String a = br.readLine();
        String b = br.readLine();
        if(a.contains(b)){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
        
    }
}