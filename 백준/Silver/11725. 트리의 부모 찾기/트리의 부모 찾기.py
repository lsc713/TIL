import sys
input = sys.stdin.readline
from collections import deque
n=int(input())
graph=[[]for _ in range(n+1)]
for i in range(n-1):
    a,b = map(int,input().split())
    graph[a].append(b)
    graph[b].append(a)

ans = [0]*(n+1)    
q=deque()
q.append(1)
def bfs():
    while q:
        now=q.popleft()
    
        for i in (graph[now]):
            if ans[i]==0:
                ans[i]=now
                q.append(i)
bfs()
res=ans[2:]
for i in res:
    print(i)
