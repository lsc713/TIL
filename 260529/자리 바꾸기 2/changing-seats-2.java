import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br  = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        int[] a = new int[k];
        int[] b = new int[k];
        for (int i = 0; i < k; i++) {
            st = new StringTokenizer(br.readLine());
            a[i] = Integer.parseInt(st.nextToken());
            b[i] = Integer.parseInt(st.nextToken());
        }
        int[] seat = new int[n+1];
        int[] ans = new int[n+1];
        Set<Integer>[] visited = new HashSet[n+1];
        for(int i =1;i<=n;i++){
            seat[i]=i;
            visited[i] = new HashSet<>();;
            visited[i].add(i);
            ans[i]=1;
        }

        for(int c=0;c<3;c++){
            for(int i=0;i<k;i++){
                int p1 = seat[a[i]];//A[i]=그 자리 seat[a[i]]=그 자리의 사람
                int p2 = seat[b[i]];
                seat[a[i]]=p2;
                seat[b[i]]=p1;
                boolean res1 = visited[p1].add(b[i]);
                boolean res2 = visited[p2].add(a[i]);
                if(res1){
                    ans[seat[b[i]]]++;
                }
                if(res2){
                    ans[seat[a[i]]]++;
                }

            }
        }

        for(int i = 1;i<=n;i++){
            System.out.println(ans[i]);
        }
        // Please write your code here.
    }
}