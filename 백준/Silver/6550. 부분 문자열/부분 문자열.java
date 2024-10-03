import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            String s = sc.next();
            String t = sc.next();
            int idx = 0;
            boolean isIn = true;
            for(char c : s.toCharArray()){
                idx = t.indexOf(c,idx);
                if(idx == -1){
                    isIn=false;
                    break;
                }
                idx++;
            }
            System.out.println(isIn ? "Yes":"No");
        }
    }
}