from collections import deque
import sys
input = sys.stdin.readline
dx=[-2,-2,0,0,2,2]
dy=[1,-1,-2,2,-1,1]
def bfs(a,b):
  q=deque()
  q.append([a,b])
  visited[a][b]=0
  while q:
    x,y=q.popleft()
    for i in range(6):
      nx = x+dx[i]
      ny = y+dy[i]
      if 0<=nx<n and 0<=ny<n and visited[nx][ny]==-1:
        visited[nx][ny]=visited[x][y]+1
        q.append([nx,ny])


n=int(input())
visited = [[-1]*n for _ in range(n)]
r1,c1,r2,c2 = map(int,input().split())
bfs(r1,c1)
answer=visited[r2][c2]
print(answer)