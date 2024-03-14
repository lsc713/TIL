import java.util.*;
import java.io.*;
public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        int[] b = new int[a];
        Integer[] c = new Integer[a];
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringTokenizer st2 = new StringTokenizer(br.readLine());
        for(int i = 0; i<a;i++){
            b[i] = Integer.parseInt(st.nextToken());
            c[i] = Integer.parseInt(st2.nextToken());
        }
        Arrays.sort(b);
        Arrays.sort(c,Collections.reverseOrder());
        long sum = 0;
        for(int i = 0; i<a;i++){
            sum+=b[i]*c[i];
        }
        System.out.println(sum);
    }
}