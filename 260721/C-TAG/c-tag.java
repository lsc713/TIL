import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new  StringTokenizer(br.readLine());
        int n =Integer.parseInt(st.nextToken());
        int m =Integer.parseInt(st.nextToken());
        char[][] A = new char[n][];
        char[][] B = new char[n][];
        for(int i = 0 ; i < n;i++) A[i]=br.readLine().toCharArray();
        for(int i = 0 ; i < n;i++) B[i]=br.readLine().toCharArray();
        int  count =0 ;
        for(int i = 0 ; i <m;i++){
            for(int j = i+1;j<m;j++){
                for(int  k =j+1;k<m;k++){
                    Set<String> aset = new HashSet<>();
                    for(int  p=0;p<n;p++){
                        aset.add(""+A[p][i]+A[p][j]+A[p][k]);
                    }
                    boolean flag = true;
                    for(int  p=0;p<n;p++){
                        String key= ""+B[p][i]+B[p][j]+B[p][k];
                        
                        if(aset.contains(key)){
                            flag=false;break;
                        }
                    }
                    if(flag)count++;
                }
            }
        }
        System.out.println(count);

        // Please write your code here.
    }
}