import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException{
        // Please write your code here.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        int[] arr = new int[n];
        Map<Integer,Integer> map = new TreeMap<>();

        for(int i = 0 ;  i < n ;i++){
            arr[i]=Integer.parseInt(st.nextToken()); 
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }

        List<Map.Entry<Integer,Integer>> list = new ArrayList<>(map.entrySet());
        list.sort((a,b)->{
            if(!b.getValue().equals(a.getValue())) return b.getValue() - a.getValue();
            return b.getKey() - a.getKey();
        });

        StringBuilder sb = new StringBuilder();
        for(int i = 0 ; i <k;i++){
            sb.append(list.get(i).getKey()).append(' ');
        }
        System.out.print(sb);


        
        
    }
}