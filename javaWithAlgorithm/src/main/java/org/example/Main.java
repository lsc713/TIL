package org.example;

public class Main {
    public static void main(String[] args) {
        char lower = 'e';
        char upper = (char) (lower + ('a' - 'A'));
        char upper1 = Character.toUpperCase(lower);
        char lower1 = Character.toLowerCase(upper1);
        String s = "asd";
        StringBuilder azBuilder = new StringBuilder();
        for (char c = 'a'; c<='z'; c++) azBuilder.append(c);
        String az = azBuilder.toString();
        System.out.println(az);

    }
}