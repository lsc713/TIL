package org.example.doit.chap04;

import java.util.Scanner;

public class Stack01 {
    private int[] stk;
    private int capacity;
    private int ptr;

    public class EmptyIntStackException extends RuntimeException {
        public EmptyIntStackException() {

        }
    }


    public class OverflowIntStackException extends RuntimeException {
        public OverflowIntStackException() {

        }
    }

    public Stack01(int maxlen) {
        ptr = 0;
        capacity = maxlen;
        try {
            stk = new int[capacity];
        } catch (OutOfMemoryError error) {
            capacity =0;
        }
    }

    public int push(int x) throws OverflowIntStackException {
        if (ptr >= capacity) {
            throw new OverflowIntStackException();
        }
        return stk[ptr++];
    }

    public int pop() throws EmptyIntStackException {
        if (ptr <= 0) {
            throw new EmptyIntStackException();
        }
        return stk[--ptr];
    }

    public int peek() throws EmptyIntStackException {
        if (ptr <= 0) {
            throw new EmptyIntStackException();
        }
        return stk[ptr - 1];
    }

    public void clear() {
        ptr =0;
    }

    public int indexOf(int x) {
        for (int i = ptr - 1; i >= 0; i--) {
            if (stk[i] == x) {
                return i;
            }
        }
        return -1;
    }


    public int getCapacity() {
        return capacity;
    }

    public int size() {
        return ptr;
    }

    public boolean isEmpty() {
        return ptr <= 0;
    }

    public boolean isFull() {
        return ptr>=capacity;
    }

    public void dump() {
        if (ptr <= 0) {
            System.out.println("스택이 비었습니다.");
        } else {
            for (int i = 0; i < ptr; i++) {
                System.out.print(stk[i] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack01 s = new Stack01(64);

        while (true) {
            System.out.println();
            System.out.printf("현재 데이터 개수: %d/ %d\n", s.size(), s.getCapacity());
            System.out.print("1.push 2.pop 3.peek 4.dump 0.exit");

            int menu = sc.nextInt();
            if (menu == 0) {
                break;
            }

            int x;
            switch (menu) {
                case 1:
                    System.out.print("data : ");
                    x = sc.nextInt();
                    try {
                        s.push(x);
                    } catch (Stack01.OverflowIntStackException e) {
                        System.out.println("스택이 가득찼습니다.");
                    }
                    break;
                case 2:
                    try {
                        x = s.pop();

                    } catch (Stack01.EmptyIntStackException e) {
                        System.out.println("stack is empty");

                    }
                    break;
                case 3:
                    try {
                        x = s.peek();
                        System.out.println("peek data is : " + x);
                    } catch (Stack01.EmptyIntStackException e) {
                        System.out.println("stack is empty");
                    }
                    break;
                case 4:
                    s.dump();
                    break;
            }
        }
    }
}
