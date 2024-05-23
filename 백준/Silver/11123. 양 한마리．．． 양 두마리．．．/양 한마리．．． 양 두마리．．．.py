import sys
input = sys.stdin.readline
from collections import deque
dx=[-1,1,0,0]
dy=[0,0,-1,1]

def bfs(a,b):
  q=deque()
  q.append([a,b])
  while q:
    x,y=q.popleft()
    for i in range(4):
      nx=x+dx[i]
      ny=y+dy[i]
      if 0<=nx<h and 0<=ny<w and graph[nx][ny]=='#':
        q.append([nx,ny])
        graph[nx][ny]="."





T=int(input())
for i in range(T):
  h,w=map(int,input().split())
  graph = [list(input()) for _ in range(h)]
  answer=0
  for i in range(h):
    for j in range(w):
      if graph[i][j]=='#':
        bfs(i,j)
        answer+=1
  print(answer)