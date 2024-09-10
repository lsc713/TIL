import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
class Main{
    public static void main(String[] args) throws NumberFormatException, IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st;
        int[] arr = new int[N];
        int max =-1000001;
        int min = Integer.MAX_VALUE;
        st = new StringTokenizer(br.readLine());
        for(int i = 0; i<arr.length;i++) {
        	
        	arr[i] = Integer.parseInt(st.nextToken());
        	max = Math.max(max, arr[i]);
        	min = Math.min(min, arr[i]);
        }
        System.out.println(min+" "+max);
    }
}
    