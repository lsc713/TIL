import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        sc.nextLine();
        Set<String> strArr = new HashSet<>();
        List<String> list = new ArrayList<>();
        for(int i=0;i<n;i++){
            strArr.add(sc.nextLine());
        }
        for(int i=0;i<m;i++){
            String input = sc.nextLine();
            if(strArr.contains(input)){
                list.add(input);
            }
        }
        Collections.sort(list);
        System.out.println(list.size());
        for(String s : list){
            System.out.println(s);
        }
    }
}

