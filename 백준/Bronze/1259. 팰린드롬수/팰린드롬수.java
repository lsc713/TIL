import java.util.*;
class Main{

    public static void main(String[] args){
    
        Scanner sc = new Scanner(System.in);
        while(true){
            String answer = "yes";
            
            String tmp = sc.nextLine();
            if(tmp.equals("0")){
                break;
            }
            for(int i =0;i<tmp.length()/2;i++){
                if(!(tmp.charAt(i) ==tmp.charAt(tmp.length()-1-i))){
                    answer="no";
                    break;
                }
            }
            System.out.println(answer);
        }
    }
}
