import java.util.*;
class Main{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int number = 666;
        int cnt=1;
        while(cnt<n){
            number++;

            if (String.valueOf(number).contains("666")) {
                cnt++;
            }
        }
        System.out.println(number);
    }
}