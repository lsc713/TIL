import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int q = sc.nextInt();
        int temp=0;
        for(int i = 0 ; i <q;i++){
            String cd = sc.next();
            int num=0;
            if(!cd.equals("clear")){
                num = sc.nextInt();
            }
            if(cd.equals("add")){
                if(((temp>>num)&1)==0){
                    temp^=(1<<num);
                }
            }else if(cd.equals("delete")){
                if(((temp>>num)&1)==1){
                    temp^=(1<<num);
                }
            }else if(cd.equals("print")){
                System.out.println((temp>>num)&1);
            }else if(cd.equals("toggle")){
                temp^=(1<<num);
            }else if(cd.equals("clear")){
                temp=0;
            }
        }
        // Please write your code here.
    }
}