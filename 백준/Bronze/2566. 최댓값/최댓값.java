import java.io.IOException;
import java.util.Scanner;
class Main{
    public static void main(String[] args) throws NumberFormatException, IOException{
        Scanner sc = new Scanner(System.in);
        int[][] map = new int[9][9];
        int max = 0;
        int x=0;
        int y=0;
        for(int i = 0 ; i < 9;i++) {
        	for(int j = 0 ; j < 9;j++) {
        		map[i][j] = sc.nextInt();
        		if(max <= map[i][j]) {
        			max = map[i][j];
        			x = i+1;
        			y = j+1;
        		}
        	}
        }
        System.out.println(max);
        System.out.println(x+" "+y);
    }
}
    