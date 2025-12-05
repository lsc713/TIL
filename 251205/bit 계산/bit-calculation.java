import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int q = Integer.parseInt(br.readLine());
        int temp=0;
        while(q-->0){
            String line = br.readLine();
            StringTokenizer st = new StringTokenizer(line);
            String cd = st.nextToken();


            int num=0;
            if(!cd.equals("clear")){
                num = Integer.parseInt(st.nextToken());
            }
            if(cd.equals("add")){
                if(((temp>>num)&1)==0){
                    temp^=(1<<num);
                }
            }else if(cd.equals("delete")){
                if(((temp>>num)&1)==1){
                    temp^=(1<<num);
                }
            }else if(cd.equals("print")){
                System.out.println((temp>>num)&1);
            }else if(cd.equals("toggle")){
                temp^=(1<<num);
            }else if(cd.equals("clear")){
                temp=0;
            }
        }
        // Please write your code here.
    }
}