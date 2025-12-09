import java.util.*;
import java.io.*;
public class Main {
    static int[] dx = {-1,0,0,1};
    static int[] dy = {0,-1,1,0};
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        int T = Integer.parseInt(br.readLine());
        while(T-- > 0) {
            st = new StringTokenizer(br.readLine());
            n = Integer.parseInt(st.nextToken());
            m = Integer.parseInt(st.nextToken());

            int[][] cnt = new int[n][n];
            int[] xs = new int[m];
            int[] ys = new int[m];
            int[] ds = new int[m];
            int k=m;
            for (int i = 0; i < m; i++) {
                st = new StringTokenizer(br.readLine());
                int x = Integer.parseInt(st.nextToken())-1;
                int y = Integer.parseInt(st.nextToken())-1;
                char d = st.nextToken().charAt(0);
                int dir=0;
                if(d=='U')dir=0;
                else if(d=='D')dir=3;
                else if(d=='L')dir=1;
                else dir=2;
                xs[i]=x;
                ys[i]=y;
                ds[i]=dir;

            }
            for(int a=0;a<2*n&&k>1;a++){
                for(int i = 0 ; i < k;i++){
                    int nx = xs[i]+dx[ds[i]];
                    int ny = ys[i]+dy[ds[i]];
                    if(in(nx,ny)){
                        xs[i]=nx;
                        ys[i]=ny;
                    }else{
                        ds[i]=3-ds[i];
                    }
                }
                for(int i = 0 ; i < k;i++){
                    cnt[xs[i]][ys[i]]++;
                }
                int nk=0;
                for(int i = 0 ; i < k;i++){
                    if(cnt[xs[i]][ys[i]]==1){
                        xs[nk]=xs[i];
                        ys[nk]=ys[i];
                        ds[nk]=ds[i];
                        nk++;
                    }
                    cnt[xs[i]][ys[i]]=0;

                }
                k=nk;

            }
            sb.append(k).append("\n");
        }
        System.out.println(sb.toString());
        
    }
    static int n,m;
    static boolean in(int x,int y){
        return 0<=x&&x<n&&0<=y&&y<n;
    }
}