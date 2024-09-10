import java.io.IOException;
import java.util.Scanner;
class Main{
    public static void main(String[] args) throws NumberFormatException, IOException{
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        int answer=0;
        for (int i = 0; i < a.length(); i++){
            char c = a.charAt(i);
            if (c == 'A'|| c=='B'||c=='C'){
                answer+=3;
            }else if(c=='D'||c=='E'||c=='F'){
                answer+=4;
            }else if(c=='G'||c=='H'||c=='I'){
                answer+=5;
            }else if(c=='J'||c=='K'||c=='L'){
                answer+=6;
            }else if(c=='M'||c=='N'||c=='O'){
                answer+=7;
            }else if(c=='P'||c=='Q'||c=='R'||c=='S'){
                answer+=8;
            }else if(c=='T'||c=='U'||c=='V'){
                answer+=9;
            }else if(c=='W'||c=='X'||c=='Y'||c=='Z'){
                answer+=10;
            }
        }
        System.out.println(answer);
    }
}
