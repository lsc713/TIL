import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;



public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int M = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		Set<Integer> set = new HashSet<>();
		for(int i = 0 ; i<M;i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			String input = st.nextToken();
			int num=0;
			if(input.equals("all")||input.equals("empty")) {
				
			}else {
				num = Integer.parseInt(st.nextToken());
			}
			switch (input) {
			case "add": {
				set.add(num);
				break;
			}
			case "remove": {
				set.remove(num);
				break;
			}
			case "toggle": {
				if(set.contains(num)) {
					set.remove(num);	
				}else {
					set.add(num);
				}
				break;
			}
			case "all": {
				for(int j = 1;j<=20;j++) {
					set.add(j);
				}
				break;
			}
			case "empty": {
				set = new HashSet<>();
				break;
			}
			case "check": {
				if(set.contains(num)) {
					sb.append(1).append("\n");
				}else {
					sb.append(0).append("\n");
				}
				break;
			}
		}
	}
		System.out.println(sb);
		}
}
		
