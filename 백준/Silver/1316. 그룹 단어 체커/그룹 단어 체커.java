import java.util.*;
import java.io.*;
class Main{
    public static void main(String[] args)throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb =new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        int answer=0;

        loop:for(int tc = 0 ; tc <n;tc++){
            int[] arr = new int[26];
            int previous = -1;
            String str = br.readLine();
            for(int i = 0 ; i<str.length();i++){
                char c = str.charAt(i);
                if(c!=previous){
                    if(arr[c-'a'] != 0){
                        continue loop;
                    }else{
                        arr[c-'a']++;
                        previous = c;
                    }
                }else{
                    continue;
                }
            }
            answer++;
        }
        sb.append(answer);
        System.out.println(sb);
    }
}