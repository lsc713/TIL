import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for(int t=0;t<T;t++){
            String s=sc.next();
            int l =0;
            int r = s.length()-1;
            System.out.println(check(s,l,r));
        }
    }
    static int check(String s,int l, int r){
        while(l<r){
            if(s.charAt(l)==s.charAt(r)){
                l++;
                r--;
            }else if(promising(s,l+1,r)||promising(s,l,r-1)){
                return 1;
            }else{
                return 2;
            }
        }
        return 0;
    }
    static boolean promising(String s,int l,int r){
        while(l<r){
            if(s.charAt(l)!=s.charAt(r)){
                return false;
            }
            l++;
            r--;
        }
        return true;
    }
}