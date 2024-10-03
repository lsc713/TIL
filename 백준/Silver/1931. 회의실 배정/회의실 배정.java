import java.util.*;
import java.util.stream.Collectors;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        List<int[]> list = new ArrayList<>();
        for(int i = 0 ; i<n;i++){
            int st = sc.nextInt();
            int end = sc.nextInt();
            list.add(new int[]{st,end});
        }
        List<int[]> newList = list.stream()
            .sorted(Comparator.comparingInt((int[] a)->a[1]).thenComparing(a->a[0]))
            .collect(Collectors.toList());
        int answer=1;
        int ed = newList.get(0)[1];
        for(int i =1;i<newList.size();i++){
            if(newList.get(i)[0]>=ed){
                answer++;
                ed=newList.get(i)[1];
            }
        }
        System.out.println(answer);
    }
}