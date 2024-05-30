import sys
input = sys.stdin.readline
from collections import deque

def bfs(x):
  dx=[-1,1,a,-a,b,-b,a,b]
  q = deque()
  q.append(x)
  visited[x]=1
  while q:
    x=q.popleft()
    for i in range(8):
      if i<6:
        nx=x+dx[i]
        if 0<=nx<100001 and visited[nx]==0:
          q.append(nx)
          visited[nx]=1
          arr[nx]=arr[x]+1
      else:
        nx=x*dx[i]
        if 0<=nx<100001 and visited[nx]==0:
          q.append(nx)
          visited[nx]=1
          arr[nx]=arr[x]+1




a,b,n,m=map(int,input().split())
arr=[0 for _ in range(100001)]
visited=[0 for _ in range(100001)]
bfs(n)
print(arr[m])