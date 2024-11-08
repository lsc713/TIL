import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Random;
import java.util.Scanner;

public class Solution {
    static int V,E,a1,a2,size;
    static class Node{
        int parent,left,right;
    }
    static Node[] list;
    static boolean[] visited;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T  = scanner.nextInt();
        for (int t = 1; t <= T; t++) {
            V = scanner.nextInt();
            E = scanner.nextInt();
            list = new Node[V+1];
            visited = new boolean[V+1];
            for (int i = 1; i <= V; i++) {
                list[i] = new Node();
            }
            a1 = scanner.nextInt();
            a2 = scanner.nextInt();
            for (int e= 0; e < E; e++) {
                int parent = scanner.nextInt();
                int child = scanner.nextInt();
                if (list[parent].left==0) list[parent].left = child;
                else list[parent].right = child;
                list[child].parent = parent;
            }
            int commonPrent = 1;
            while(true){
                if (a1!=1){
                    int parent = list[a1].parent;
                    if (visited[parent]) {
                        commonPrent = parent;
                        break;
                    }
                    visited[parent] = true;
                    a1 = parent;
                }
                if (a2!=1){
                    int parent = list[a2].parent;
                    if (visited[parent]) {
                        commonPrent = parent;
                        break;
                    }
                    visited[parent] = true;
                    a2 = parent;
                }
            }
            size =0;
            preOrder(commonPrent);
            System.out.println("#"+t+" "+commonPrent+" "+size);
        }
    }

    static void preOrder(int idx) {
        size++;
        if (list[idx].left != 0) {
            preOrder(list[idx].left);
        }
        if (list[idx].right != 0) {
            preOrder(list[idx].right);
        }
    }
}
