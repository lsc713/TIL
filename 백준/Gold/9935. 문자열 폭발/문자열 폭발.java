import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String t = sc.next();
        int sl = s.length();
        int tl = t.length();
        Stack<Character> st = new Stack<>();
        for(int i = 0 ; i<sl;i++){
            char c =s.charAt(i);
            st.push(c);
            if(st.size()>=tl){
                boolean temp = true;
                for(int j = 0 ; j<tl;j++){
                    if(st.get(st.size()-tl+j) != t.charAt(j)){
                        temp=false;
                        break;
                    }
                }
                if(temp){
                    for(int j=0;j<tl;j++){
                        st.pop();
                    }
                }
            }
        }
        StringBuilder sb = new StringBuilder();
        if(st.isEmpty()){
            System.out.println("FRULA");
        }else{
            for(char c : st){
                sb.append(c);
            }
            System.out.println(sb);
        }
    }
}