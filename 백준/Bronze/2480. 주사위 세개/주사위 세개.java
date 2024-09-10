import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int H = sc.nextInt();
        int M = sc.nextInt();
        int C = sc.nextInt();
        int max =Math.max(H, Math.max(M, C));
        if(H==M&&M==C&&C==H) {
        	System.out.println(10000+H*1000);
        }else if(H==M){
        	System.out.println(1000+M*100);
        }else if(H==C){
        	System.out.println(1000+H*100);
        }else if(C==M){
        	System.out.println(1000+C*100);
        }else {
        	System.out.println(max*100);
        }
    }
}
    