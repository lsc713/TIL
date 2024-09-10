import java.io.IOException;
import java.util.Scanner;
class Main{
    public static void main(String[] args) throws NumberFormatException, IOException{
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String a1="";
        String b = sc.next();
        String b1="";
        for (int i = a.length()-1; i >=0; i--){
            a1+=a.charAt(i);
        }
        for (int i = b.length()-1; i >=0; i--){
            b1+=b.charAt(i);
        }
        if (Integer.parseInt(a1) > Integer.parseInt(b1)) {
            System.out.println(a1);
        } else {
            System.out.println(b1);
        }
    }
}
