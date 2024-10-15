import java.util.*;
class Main{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        String t = scanner.nextLine();

        while(s.length() != t.length()){
            StringBuilder sb = new StringBuilder();
            if(t.charAt(t.length()-1)=='B'){
                t = t.substring(0, t.length()-1);
                t = String.valueOf(sb.append(t).reverse());
            }else if (t.charAt(t.length()-1)=='A'){
                t = t.substring(0, t.length()-1);
            }
            if (t.length() == s.length()){
                break;
            }
        }
        if (t.equals(s)){
            System.out.println(1);
        }else{
            System.out.println(0);
        }
    }
}