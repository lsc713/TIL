import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		String t = sc.next();
		recur(s,t);
		System.out.println(temp?1:0);
	}
	static boolean temp=false;
	static void recur(String s, String t) {
		if(t.length()==s.length()) {
			if(t.equals(s)) {
				temp=true;
			}
			return;
		}
		if(t.charAt(t.length()-1)=='A') {
			recur(s,t.substring(0,t.length()-1));
		}
		if(t.charAt(0)=='B') {
//			System.out.println(new StringBuilder(t.substring(0,t.length()-1)).reverse().toString());
			recur(s,new StringBuilder(t.substring(1)).reverse().toString());
		}
	}
}
