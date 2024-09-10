import java.io.IOException;
import java.util.Scanner;
class Main{
	static String[] al = {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};
    public static void main(String[] args) throws NumberFormatException, IOException{
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        String[] strArr = input.split("");
        String tmp ="";
        for(int j = 0 ; j<al.length;j++) {
        	int idx=0;
        	for(int i =0;i<strArr.length;i++) {
        		if(al[j].equals(strArr[i])) {
        			idx=1;
        			
        			if(!(tmp.contains(strArr[i]))) {
        				System.out.print(i+" ");
        			}
        			tmp+=strArr[i];
        		}
        	}
        	if(idx==0) {
        		System.out.print(-1+" ");
        	}
        }
        System.out.println();
    }
}
    