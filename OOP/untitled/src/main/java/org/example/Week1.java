package org.example;

import java.util.Scanner;

public class Week1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String title = scanner.nextLine();
        float score = scanner.nextFloat();
        scanner.nextLine();
        String line1 = scanner.nextLine();
        String line2 = scanner.nextLine();
        String line3 = scanner.nextLine();
        String line4 = scanner.nextLine();
        String line5 = scanner.nextLine();
        String line6 = scanner.nextLine();
        String line7 = scanner.nextLine();
        String line8 = scanner.nextLine();
        String line9 = scanner.nextLine();
        String line10 = scanner.nextLine();

        System.out.println("[ "+title+" ]");
        System.out.println("별점 : " + score + "(" + (int)score * 100 / 5 + "%)");
        System.out.println("1. "+line1);
        System.out.println("2. "+line2);
        System.out.println("3. "+line3);
        System.out.println("4. "+line4);
        System.out.println("5. "+line5);
        System.out.println("6. "+line6);
        System.out.println("7. "+line7);
        System.out.println("8. "+line8);
        System.out.println("9. "+line9);
        System.out.println("10. "+line10);
    }

}
