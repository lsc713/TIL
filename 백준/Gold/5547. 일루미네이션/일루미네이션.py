from collections import deque
import sys
input = sys.stdin.readline

w,h = map(int,input().split())
graph=[[0 for _ in range(w+2)] for _ in range(h+2)]
for i in range(1,h+1):
    graph[i][1:w+1] = map(int,input().split())

dy=[0,1,1,0,-1,-1]
dx=[[1,0,-1,-1,-1,0],[1,1,0,-1,0,1]]
visited=[[0 for _ in range(w+2)] for _ in range(h+2)]
def bfs(y,x):
    q=deque()
    q.append([y,x])
    cnt =0
    visited[y][x]=1
    while q:
        y,x=q.popleft()
        for i in range(6):
            ny,nx= y+ dy[i],x+dx[y%2][i]
            if 0<=ny<h+2 and 0<=nx<w+2:
                if graph[ny][nx] == 0 and visited[ny][nx]==0:
                    q.append([ny,nx])
                    visited[ny][nx]=1
                elif graph[ny][nx]==1:
                    cnt+=1
    return cnt
print(bfs(0,0))