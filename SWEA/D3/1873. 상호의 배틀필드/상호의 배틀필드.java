import java.util.Arrays;
import java.util.Scanner;
import java.io.FileInputStream;

class Solution
{
	static int n ;
	static int h;
	static int w;
	static char[][] map;
	static char pos;
	static int pox;
	static int poy;
	static int direction;
	public static void main(String args[]) throws Exception
	{
		Scanner sc = new Scanner(System.in);
		
		int T;
		T=sc.nextInt();

		for(int test_case = 1; test_case <= T; test_case++)
		{
			StringBuilder sb = new StringBuilder();
			sb.append("#"+test_case+" ");
			h = sc.nextInt();
			w = sc.nextInt();
			sc.nextLine();
			map = new char[h][w];
			for(int i = 0;i<h;i++) {
				String line = sc.nextLine();
				map[i]=line.toCharArray();
				for(int j =0;j<w;j++) {
					if(map[i][j]=='^'||map[i][j]=='<'||map[i][j]=='>'||map[i][j]=='v') {
						pos=map[i][j];
						pox=i;
						poy=j;
						if(map[i][j]=='^') {
							direction = 0;
						}else if(map[i][j]=='v') {
							direction = 1;
						}else if(map[i][j]=='<') {
							direction = 2;
						}else if(map[i][j]=='>') {
							direction = 3;
						}
					}
				}
			}
			
			
			n = sc.nextInt();
			String command = sc.next();
			
			/**
			 * 
			 * 문자	의미
			.	평지(전차가 들어갈 수 있다.)
			*	벽돌로 만들어진 벽
			#	강철로 만들어진 벽
			-	물(전차는 들어갈 수 없다.)
			^	위쪽을 바라보는 전차(아래는 평지이다.)
			v	아래쪽을 바라보는 전차(아래는 평지이다.)
			<	왼쪽을 바라보는 전차(아래는 평지이다.)
			>	오른쪽을 바라보는 전차(아래는 평지이다.)
			
			 * */
			
			for(int i = 0;i<command.length();i++) {
				char c = command.charAt(i);
				if(c == 'S') {
					if(pos=='<') {
						for(int j=poy-1;j>=0;j--) {
//							System.out.println(j+"?"+map[pox][j]);
							if(map[pox][j]=='#') break;
							if(map[pox][j]=='*') {
								map[pox][j]='.';
								break;
							}
						}
					}
					else if(pos=='^') {
						for(int j=pox-1;j>=0;j--) {
							if(map[j][poy]=='#') break;
							if(map[j][poy]=='*') {
								map[j][poy]='.';
								break;
							}
						}
					}else if(pos=='>') {
						for(int j=poy+1;j<w;j++) {
							if(map[pox][j]=='#') break;
							if(map[pox][j]=='*') {
								map[pox][j]='.';
								break;
							}
						}
					}else if(pos=='v') {
						for(int j=pox+1;j<h;j++) {
							if(map[j][poy]=='#') break;
							if(map[j][poy]=='*') {
								map[j][poy]='.';
								break;
							}
						}
					}
				}else if(c=='U') {
					direction =0;
					map[pox][poy]='^';
					pos = '^';
//					System.out.println("pox" + pox);
					if(val(pox-1,poy) && map[pox-1][poy]=='.') {
						map[pox][poy]='.';
						map[pox-1][poy]='^';
						pos = map[pox-1][poy];
						pox = pox-1;
						
//						System.out.println("pox" + pox);
					}
				}else if(c=='D') {
					direction =1;
					map[pox][poy]='v';
					pos = 'v';
					if(val(pox+1,poy) && map[pox+1][poy]=='.') {
						map[pox][poy]='.';
						map[pox+1][poy]='v';
						pos = map[pox+1][poy];
						pox = pox+1;
					}
				}else if(c=='L') {
					direction =2;
					map[pox][poy]='<';
					pos = '<';
					if(val(pox,poy-1) && map[pox][poy-1]=='.') {
						map[pox][poy]='.';
						map[pox][poy-1]='<';
						pos = map[pox][poy-1];
						poy = poy-1;
					}
				}else if(c=='R') {
					direction =3;
					map[pox][poy]='>';
					pos = '>';
					if(val(pox,poy+1) && map[pox][poy+1]=='.') {
						map[pox][poy]='.';
						map[pox][poy+1]='>';
						pos = map[pox][poy+1];
						poy = poy+1;
					}
				}
			}
			
			for(int i = 0 ; i < h ; i++) {
				for(int j = 0 ; j<w;j++) {
					sb.append(map[i][j]);
				}
				if(i!=h-1) sb.append('\n');
			}
			
			System.out.println(sb);
		}
	}
	
	static boolean val(int x, int y) {
		if(0<=x&&x<h&&0<=y&&y<w) {
			return true;
		}
		return false;
	}
}