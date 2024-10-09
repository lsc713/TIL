import java.util.*;
import java.io.FileInputStream;

class Solution
{
    static int n,k;
    static int[] dx ={-1,0,1,0};
    static int[] dy ={0,-1,0,1};
    static char[][] map;
    static int[] start,end;
    static class Position{
    	int x,y,direction,move,tree;
        public Position(int x,int y,int direction,int move,int tree){
        	this.x=x;
            this.y=y;
            this.direction=direction;
            this.move=move;
            this.tree=tree;
        }
    }
	public static void main(String args[]) throws Exception
	{
		Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();

		for(int test_case = 1; test_case <= T; test_case++)
		{
            
			 n =sc.nextInt();
            k=sc.nextInt();
            start = new int[2];
            end = new int[2];
            map = new char[n][n];
            for(int i = 0 ;i<n;i++){
                String s = sc.next();
            	for(int j = 0;j<n;j++){
                    map[i][j]=s.charAt(j);
                    if(map[i][j]=='X'){
                    	start[0]=i;
                        start[1]=j;
                    }
                    if(map[i][j]=='Y'){
                    	end[0]=i;
                        end[1]=j;
                    }
                }
            }
            int result = bfs();
			System.out.println("#"+test_case+" "+result);
		}
	}
    static int bfs(){
    	Queue<Position> q = new LinkedList<>();
        boolean[][][][] visited = new boolean[n][n][4][k+1];
        q.add(new Position(start[0],start[1],0,0,0));
        while(!q.isEmpty()){
        	Position p = q.poll();
            if(p.x==end[0] &&p.y == end[1]){
            	return p.move;
            }
            int nx = p.x+dx[p.direction];
            int ny = p.y+dy[p.direction];
            if(0<=nx&&nx<n&&0<=ny&&ny<n){
            	if(map[nx][ny] == 'G'||map[nx][ny]=='Y'){
                	if(!visited[nx][ny][p.direction][p.tree]){
                    	visited[nx][ny][p.direction][p.tree]=true;
                        q.add(new Position(nx,ny,p.direction,p.move+1,p.tree));
                    }
                }else if(map[nx][ny]=='T'&&p.tree<k){
                	if(!visited[nx][ny][p.direction][p.tree+1]){
                    	visited[nx][ny][p.direction][p.tree+1]=true;
                        q.add(new Position(nx,ny,p.direction,p.move+1,p.tree+1));
                    }
                }
            }
            int leftDirection = (p.direction+1)%4;
            if(!visited[p.x][p.y][leftDirection][p.tree]){
            visited[p.x][p.y][leftDirection][p.tree]=true;
                q.add(new Position(p.x,p.y,leftDirection,p.move+1,p.tree));
            }
            int rightDirection = ((p.direction-1)%4+4)%4;
            if(!visited[p.x][p.y][rightDirection][p.tree]){
            visited[p.x][p.y][rightDirection][p.tree]=true;
                q.add(new Position(p.x,p.y,rightDirection,p.move+1,p.tree));
            }                           
        }
        return -1;
    }
}