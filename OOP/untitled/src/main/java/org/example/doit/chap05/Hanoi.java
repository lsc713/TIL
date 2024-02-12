package org.example.doit.chap05;

public class Hanoi {
    static void move(int no, int x, int y) {
        if (no > 1) {
            move(no - 1, x, 6 - x - y);
        }
        System.out.printf("원반[%d]을 %d번 기둥에서 %d번 기둥으로 옮김 \n", no, x, y);

        if (no > 1) {
            move(no-1,6-x-y,y);
        }
    }

    public static void main(String[] args) {
        move(3,1,3);
    }
}
