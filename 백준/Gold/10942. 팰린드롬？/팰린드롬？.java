import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n =Integer.parseInt(br.readLine());
        int[] arr = new int[n+1];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 1 ; i<=n;i++) {
            arr[i]=Integer.parseInt(st.nextToken());
        }
        int m = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        for(int i = 0 ; i <m;i++) {
            st = new StringTokenizer(br.readLine());
            boolean temp = true;
            int s = Integer.parseInt(st.nextToken());
            int e = Integer.parseInt(st.nextToken());
            int temp2=Math.max(s, e);
            int temp1=Math.min(s,e);
            while(temp1<=temp2) {
//                System.out.println(temp1+" " +temp2+" "+temp+" "+arr[temp1]+" "+arr[temp2]);
                if(arr[temp1]==arr[temp2]) {
                    temp1++;
                    temp2--;
                }else {
                    temp=false;
                    break;
                }
            }

//            System.out.println(temp+"---------");
            if(temp) {
                sb.append(1).append("\n");
            }else {
                sb.append(0).append("\n");
            }

        }
        System.out.println(sb);

    }
}