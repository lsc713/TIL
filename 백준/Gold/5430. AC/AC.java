import java.util.*;
import java.io.*;
class Main{
    static StringTokenizer st;
    static BufferedReader br;
    static StringBuilder sb;
    public static void main(String[] args) throws Exception{
        br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        sb = new StringBuilder();
        
        for(int t = 0;t<T;t++){
            String p = br.readLine();
            int n =Integer.parseInt(br.readLine());
            st = new StringTokenizer(br.readLine(),"[],");
                ArrayDeque<Integer> deque =new ArrayDeque<Integer>();
            for(int i = 0 ; i < n;i++){
                deque.add(Integer.parseInt(st.nextToken()));
            }
            solve(p,deque);

        }
        System.out.println(sb);
    }
    static void solve(String p, ArrayDeque<Integer> deque){
        boolean isRight = true;
        for(char c : p.toCharArray()){
            if(c=='R'){
                isRight = !isRight;
                continue;
            }
            if(isRight){
                if(deque.pollFirst()==null){
                    sb.append("error\n");
                    return;
                }
            }
            else{
                if(deque.pollLast()==null){
                    sb.append("error\n");
                    return;
                }
            }

        }
        makeString(deque,isRight);
    }
    static void makeString(ArrayDeque<Integer> deque, boolean isRight){
        sb.append('[');
        if(deque.size()>0){
            if(isRight){
                sb.append(deque.pollFirst());
                while(!deque.isEmpty()){
                    sb.append(',').append(deque.pollFirst());
                }
            }
            else{
                sb.append(deque.pollLast());
                while(!deque.isEmpty()){
                    sb.append(',').append(deque.pollLast());
                }
            }
        }
        sb.append(']').append('\n');
    }
}