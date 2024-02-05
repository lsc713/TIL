package org.example;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class Week2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        String title = sc.nextLine();
        ArrayList b = new ArrayList();


        while (true) {
            String text = sc.nextLine();
            if (text.equals("끝")) {
                break;
            } else {
                b.add(text);
            }
        }

        System.out.println("["+a+" 로 저장된 "+ title +"]");
        for (int i = 0; i < b.size(); i++) {
            System.out.println((i+1)+". "+b.get(i));
        }
    }
}
