import java.util.*;
class Main{
    
public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    sc.nextLine();
    int answer=0;
    for(int i=1;i<=n;i++ ){
        answer+=i;
    }
    System.out.println(answer);
}
}