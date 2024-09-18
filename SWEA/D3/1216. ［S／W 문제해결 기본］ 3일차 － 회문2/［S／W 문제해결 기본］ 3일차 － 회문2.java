import java.awt.image.ImageProducer;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Scanner;

class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        for (int t=1; t<=10; t++) {
            int n = in.nextInt();
            char[][] map = new char[100][100];
            for (int i = 0; i < 100; i++) {
                String s = in.next();
                for (int j = 0; j < s.length(); j++) {
                    map[i][j] = s.charAt(j);
                }
            }
            int max =1;
            for (int i = 0; i < 100; i++) {
                for (int j = 0; j < 100; j++) {
                    int l = j;
                    int r = j;
                    while (0 <= l && l < 100 && 0 <= r && r < 100 && map[i][l] == map[i][r]) {
                        l--;
                        r++;

                    }
                    if (max < r - l - 1) {
                        max = r - l - 1;
                    }
                    l = j;
                    r = j+1;
                    while (0 <= l && l < 100 && 0 <= r && r < 100 && map[i][l] == map[i][r]) {
                        l--;
                        r++;

                    }
                    if (max < r - l - 1) {
                        max = r - l - 1;
                    }
                    l = i;
                    r = i;
                    while (0 <= l && l < 100 && 0 <= r && r < 100 && map[l][j] == map[r][j]) {
                        l--;
                        r++;

                    }
                    if (max < r - l - 1) {
                        max = r - l - 1;
                    }
                    l = i;
                    r = i+1;
                    while (0 <= l && l < 100 && 0 <= r && r < 100 && map[l][j] == map[r][j]) {
                        l--;
                        r++;

                    }
                    if (max < r - l - 1) {
                        max = r - l - 1;
                    }
                }
            }
            System.out.println("#"+n+" "+max);
        }//tc
    }
}
