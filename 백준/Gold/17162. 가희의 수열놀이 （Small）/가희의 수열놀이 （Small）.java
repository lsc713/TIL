import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer str = new StringTokenizer(br.readLine());
        int Q = Integer.parseInt(str.nextToken());
        int mod = Integer.parseInt(str.nextToken());

        Stack<Integer>[] st = new Stack[mod];
        for (int i = 0;i<mod;i++){
            st[i] = new Stack<>();
        }
        int idx =0;
        for (int i = 0; i < Q; i++) {
            str = new StringTokenizer(br.readLine());
            int num = Integer.parseInt(str.nextToken());
            if (num==1){
                int val = Integer.parseInt(str.nextToken());
                st[val%mod].push(idx++);
            }else if (num==2){
                for (int j=0;j<mod;j++){
                    if(!st[j].isEmpty()&& st[j].peek() == idx-1){
                        st[j].pop();
                        idx--;
                        break;
                    }
                }
            }else if (num==3){
                int min = Integer.MAX_VALUE;
                for (int j=0;j<mod;j++){
                    if (st[j].isEmpty()){
                        min=-1;
                        break;
                    }
                    if(st[j].peek()<min){
                        min=st[j].peek();
                    }
                }
                
                System.out.println(min==-1? -1:idx-min);
            }
        }

    }
}