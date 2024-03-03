import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int a = sc.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0 ; i < a;i++){
            list.add(sc.nextInt());
        }
        Collections.sort(list);
        for(int i = 0 ; i < a;i++){
            sb.append(list.get(i)).append("\n");
        }
        System.out.println(sb);
    }
}