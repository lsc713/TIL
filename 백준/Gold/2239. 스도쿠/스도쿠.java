import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	static int[][] map;
	static boolean[][] visited;
	static int total;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		map = new int[9][9];
		for(int i = 0 ; i <9;i++) {
			String input = br.readLine();	
			for(int j = 0 ; j <9;j++) {
				map[i][j] = input.charAt(j)-'0';
			}
		}
		recur();
	}
	static boolean recur() {
		StringBuilder sb = new StringBuilder();
		for(int i = 0 ; i <9;i++) {
			for(int j = 0 ; j < 9;j++) {
				if(map[i][j]==0) {
					for(int X=1;X<=9;X++) {			
						if(isValid(i,j,X)) {
							map[i][j]=X;
							if(recur()) {
								return true;	
							}
							map[i][j]=0;
						}	
					}
					return false;
				}
			}
		}
		for(int[] val : map) {
			for(int i = 0 ; i<val.length;i++) {
				sb.append(val[i]);
			}
			sb.append("\n");
		}
		System.out.println(sb);
		return true;
	}
	static boolean isValid(int x,int y,int value) {
		for(int i = 0 ; i <9;i++) {
			if(i==y)continue;
			if(map[x][i]==value) {
				return false;
			}
		}
		for(int i = 0 ; i <9;i++) {
			if(i==x)continue;
			if(map[i][y]==value) {
				return false;
			}
		}
		int startX = (x/3)*3;
		int startY = (y/3)*3;
		for(int i = startX;i<startX+3;i++) {
			for(int j =startY;j<startY+3;j++) {
				if(map[i][j]==value) {
					return false;
				}
			}
		}
//		if(x<3&&y<3) {
//			for(int i = 0 ; i <3;i++) {
//				for(int j=0;j<3;j++) {
//					if(x==i&&y==j)continue;
//					if(map[i][j]==value) {
//						return false;
//					}	
//				}
//			}	
//		}else if(x<3&&y<6) {
//			for(int i = 0 ; i <3;i++) {
//				for(int j=3;j<6;j++) {
//					if(x==i&&y==j)continue;
//					if(map[i][j]==value) {
//						return false;
//					}	
//				}
//			}	
//		}else if(x<3&&y<9) {
//			for(int i = 0 ; i <3;i++) {
//				for(int j=6;j<9;j++) {
//					if(x==i&&y==j)continue;
//					if(map[i][j]==value) {
//						return false;
//					}	
//				}
//			}	
//		}else if(x<6&&y<3) {
//			for(int i = 3 ; i <6;i++) {
//				for(int j=0;j<3;j++) {
//					if(x==i&&y==j)continue;
//					if(map[i][j]==value) {
//						return false;
//					}	
//				}
//			}	
//		}else if(x<9&&y<3) {
//			for(int i = 6 ; i <9;i++) {
//				for(int j=0;j<3;j++) {
//					if(x==i&&y==j)continue;
//					if(map[i][j]==value) {
//						return false;
//					}	
//				}
//			}	
//		}else if(x<6&&y<6) {
//			for(int i = 3 ; i <6;i++) {
//				for(int j=3;j<6;j++) {
//					if(x==i&&y==j)continue;
//					if(map[i][j]==value) {
//						return false;
//					}	
//				}
//			}	
//		}else if(x<6&&y<9) {
//			for(int i = 3 ; i <6;i++) {
//				for(int j=6;j<9;j++) {
//					if(x==i&&y==j)continue;
//					if(map[i][j]==value) {
//						return false;
//					}	
//				}
//			}	
//		}else if(x<9&&y<6) {
//			for(int i = 6 ; i <9;i++) {
//				for(int j=3;j<6;j++) {
//					if(x==i&&y==j)continue;
//					if(map[i][j]==value) {
//						return false;
//					}	
//				}
//			}	
//		}else if(x<9&&y<9) {
//			for(int i = 6 ; i <9;i++) {
//				for(int j=6;j<9;j++) {
//					if(x==i&&y==j)continue;
//					if(map[i][j]==value) {
//						return false;
//					}	
//				}
//			}	
//		}
		return true;
	}
}
