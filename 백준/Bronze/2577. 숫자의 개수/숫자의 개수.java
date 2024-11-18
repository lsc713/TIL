import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;
import java.util.Set;
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int[] arr = new int[10];
        int result = a * b * c;
        String temp = String.valueOf(result);
        for (int i = 0; i < temp.length(); i++) {
            arr[temp.charAt(i)-'0']++;
        }
        for (int val : arr) {
            System.out.println(val);
        }
    }
}
//public class Main {
//
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        int a = scanner.nextInt();
//        int b = scanner.nextInt();
//        int c = scanner.nextInt();
//        System.out.println(a + b - c);
//        System.out.println(Integer.parseInt(String.valueOf(a)+b)-c);
//    }
//}