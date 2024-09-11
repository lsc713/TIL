import java.util.Scanner;
class Main{
	//Alphrabetic -'0' +10;
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String N = sc.next();
		int B = sc.nextInt();
		int idx =0;
		//뒤에서부터
		int answer=0;
		for(int i = N.length()-1;i>=0;i--) {
			char c = N.charAt(i);
			if(c-'0'>=0&&c-'0'<=9) {
//				System.out.println(c);
				int tmp = (int)((c-'0')*Math.pow(B, idx));
				idx++;
				answer+=tmp;
//				System.out.println(answer);
			}
			else {
//				System.out.println(c-'A'+10+ " "+Math.pow(B, idx));
				int tmp =(int) ((c-'A'+10)*Math.pow(B, idx));
				idx++;
				answer += tmp;
			}
			
		}
		String input1 = String.valueOf(answer);
		Integer.parseInt(input1,10);
		System.out.println(answer);
	}
}
    