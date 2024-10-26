import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        List<int[]> persons = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int weight = scanner.nextInt();
            int height = scanner.nextInt();
            persons.add(new int[]{weight, height});
        }
        for (int i = 0; i < n; i++) {
            int cnt=1;
            for (int j = 0; j < n; j++) {
                if (i==j)continue;
                if(persons.get(i)[0]<persons.get(j)[0]&&persons.get(i)[1]<persons.get(j)[1]){
                    cnt++;
                }
            }
            System.out.print(cnt+" ");
        }
    }
}