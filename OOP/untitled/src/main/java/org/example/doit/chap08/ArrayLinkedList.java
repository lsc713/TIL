package org.example.doit.chap08;

import java.util.Comparator;

public class ArrayLinkedList<E> {
    class Node<E> {
        private E data;
        private int next;
        private int dnext; //pre list의 뒤쪽포인터

        void set(E data, int next) {
            this.data = data;
            this.next = next;
        }
    }

    private Node<E>[] n; //리스트 본체
    private int size; //리스트의 용량
    private int max; //리스트의 꼬리 리코드
    private int head; //머리노드
    private int crnt; // 선택노드
    private int deleted;// 프리리스트의 머리노드
    private static final int NULL = -1; //다음노드 없음, 리스트 꽉참


    public ArrayLinkedList(int capacity) {
        head = crnt = max = deleted = NULL;
        try {
            n = new Node[capacity];
            for (int i = 0; i < capacity; i++) {
                n[i] = new Node<E>();
            }
            size = capacity;
        } catch (OutOfMemoryError e) {
            size = 0;
        }
    }

    private int getInsertIndex() {
        if (deleted == NULL) {
            if (max < size) {
                return ++max;
            } else {
                return NULL;
            }
        } else {
            int rec = deleted;
            deleted = n[rec].dnext;
            return rec;
        }
    }

    private void deletedIndex(int idx) {
        if (deleted == NULL) {
            deleted = idx;
            n[idx].dnext = NULL;
        } else {
            int rec = deleted;
            deleted = idx;
            n[idx].dnext = rec;
        }
    }


    public E search(E obj, Comparator<? super E> c) {
        int ptr = head;

        while (ptr != NULL) {
            if (c.compare(obj, n[ptr].data) == 0) {
                crnt = ptr;
                return n[ptr].data;
            }
            ptr = n[ptr].next;
        }
        return null;
    }

    public void addFirst(E obj) {
        int ptr = head;
        int rec = getInsertIndex();
        if (rec != NULL) {
            head= crnt = rec;
            n[head].set(obj, ptr);

        }

    }

    public void addLast(E obj) {
        if (head == NULL) {
            addFirst(obj);

        } else {
            int ptr = head;
            while (n[ptr].next != NULL) {
                ptr = n[ptr].next;
            }
            int rec = getInsertIndex();
            if (rec != NULL) {
                n[ptr].next =crnt =rec;
                n[rec].set(obj, NULL);
            }

        }
    }


    public void removeFirst() {
        if (head != NULL) {
            int ptr = n[head].next;
            deletedIndex(head);
            head = crnt = ptr;
        }
    }

    public void removeLast() {
        if (head != NULL) {
            if (n[head].next == NULL) {
                removeFirst();
            } else {
                int ptr= head;
                int pre = head;
                while (n[ptr].next != NULL) {
                    pre = ptr;
                    ptr = n[ptr].next;
                }
                n[pre].next = NULL;
                deletedIndex(ptr);
                crnt = ptr;
            }
        }
    }

    public void remove(int p) {
        if (head != NULL) {
            if (p == head) {
                removeFirst();

            } else {
                int ptr = head;
                while (n[ptr].next != p) {
                    ptr = n[ptr].next;
                    if (ptr == NULL) {
                        return;
                    }
                }
                n[ptr].next = NULL;
                deletedIndex(p);
                n[ptr].next = n[p].next;
                crnt = ptr;
            }
        }
    }

    public void removeCurrentNode() {
        remove(crnt);
    }

    public void clear() {
        while (head != NULL) {
            removeFirst();
        }
        crnt = NULL;
    }

    public boolean next() {
        if (crnt == NULL || n[crnt].next == NULL) {
            return false;
        }
        crnt = n[crnt].next;
        return true;
    }

    public void printCurrentNode() {
        if (crnt == NULL) {
            System.out.println("not existed node");
        } else {
            System.out.println(n[crnt].data);
        }
    }

    public void dump() {
        int ptr = head;
        while (ptr != NULL) {
            System.out.println(n[ptr].data);
            ptr = n[ptr].next;
        }
    }
}
