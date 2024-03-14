import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int a = sc.nextInt();
        String[] arr = new String[a];
        sc.nextLine();
        for(int i = 0; i < a ; i++){
            arr[i] =sc.nextLine();
        }
        Arrays.sort(arr, new Comparator<String>(){
            public int compare(String s1, String s2){
                if(s1.length() == s2.length()){
                    return s1.compareTo(s2);
                }
                return s1.length() - s2.length();
            }
        });
        sb.append(arr[0]).append('\n');
        for(int i = 1;i<a;i++){
            if(!arr[i].equals(arr[i-1])){
                sb.append(arr[i]).append('\n');
            }
        }
        System.out.println(sb);
    }
}