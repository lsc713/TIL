import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int H = sc.nextInt();
        int M = sc.nextInt();
        int c = sc.nextInt();
        M=M+c;
        while(M>59) {
        	M-=60;
        	H++;
        	if(H >23) {
        		H=0;
        	}
        }
        System.out.println(H+" "+M);
    }
}
    