import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int q = sc.nextInt();
        int[] bit =new int[31];
        for(int i = 0 ; i <q;i++){
            String cd = sc.next();
            int num=0;
            if(!cd.equals("clear")){
                num = sc.nextInt();
            }
            if(cd.equals("add")){
                bit[num]|=1;
            }else if(cd.equals("delete")){
                bit[num]=0;
            }else if(cd.equals("print")){
                System.out.println(bit[num]==1?"1":"0");
            }else if(cd.equals("toggle")){
                bit[num]^=1;
            }else if(cd.equals("clear")){
                bit = new int[31];
            }
        }
        // Please write your code here.
    }
}