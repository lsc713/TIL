import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;
import java.util.Scanner;
class Main{
    public static void main(String[] args) throws NumberFormatException, IOException{
        Scanner sc = new Scanner(System.in);
        List<String> list = new ArrayList<>();
        //최대 글자 수를 구하고 .. 그만큼 스택을 선언하게 반복하고 글자들을 넣고 answer에 더하면..?
        int max =15;
        for(int i =0;i<5;i++) {
        	String input = sc.next();
        	if(max > input.length()) {
        		while(input.length()!=15) {
        			input+=" ";
        		}
        	}
        	list.add(input);
        }
        String answer="";
        for(int i = 0 ; i < max;i++) {
        	Deque<Character> st = new ArrayDeque<>();
    		for(int j = 0 ; j<5;j++) {
    			//오는 글자가 존재하는가
				st.addLast(list.get(j).charAt(i));
				
        	}
            	
        	while(!st.isEmpty()) {
        		char popItem = st.pollFirst();
        		answer+= popItem;
        	}
        }
        answer= answer.replaceAll(" ", "");
        
        System.out.println(answer);
    }
}
    