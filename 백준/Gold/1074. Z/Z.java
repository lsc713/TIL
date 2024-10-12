import java.util.*;
class Main{
    static int cnt=0;
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        int r= sc.nextInt();
        int c = sc.nextInt();
        int N = (int) Math.pow(2,n);
        process(r,c,N);
        System.out.println(cnt);
    }
    static void process(int r, int c,int N){
        if(N==1){
            return;
        }
        if(r<N/2&&c<N/2){
            process(r,c,N/2);
        }else if(r<N/2&&c>=N/2){
            cnt+=(N*N/4);
            process(r,c-N/2,N/2);
        }else if(r>=N/2&&c<N/2){
            cnt+=(N*N/4)*2;
            process(r-N/2,c,N/2);
        }else {
            cnt+=(N*N/4)*3;
            process(r-N/2,c-N/2,N/2);
        }
    }
}