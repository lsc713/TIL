import sys
input = sys.stdin.readline
from collections import deque

dx=[2,2,-1,-1,1,1,-2,-2]
dy=[1,-1,2,-2,2,-2,1,-1]

def bfs(a,b):
  q=deque()
  q.append([a,b])
  mat[a][b]=1
  while q:
    x,y=q.popleft()
    if x==ex and y==ey:
      return mat[x][y]-1
    for i in range(8):
      nx,ny=x+dx[i],y+dy[i]
      if 0<=nx<nul and 0<=ny<nul and mat[nx][ny]==0:
        mat[nx][ny] = mat[x][y]+1
        q.append([nx,ny])



T=int(input())
for _ in range(T):
  nul=int(input())
  sx,sy=map(int,input().split())
  ex,ey=map(int,input().split())
  mat=[[0]*nul for _ in range(nul)]
  print(bfs(sx,sy))

