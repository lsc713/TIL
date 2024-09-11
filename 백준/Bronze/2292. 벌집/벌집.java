import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int roomNum = 1;
        int idx = 1;
        int index =0;
        while (n != 1) {
            roomNum = roomNum + (6* index);
            if(roomNum >=n)break;
            idx++;
            index++;
        }
        System.out.println(idx);
    }

}
