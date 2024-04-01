import sys
sys.setrecursionlimit(5000)
input = sys.stdin.readline

def dfs(start,depth):
    visited[start]=True
    for i in graph[start]:
        if not visited[i]:
            dfs(i,depth+1)

n,m=map(int,input().split())
graph=[[] for _ in range(n+1)]
for i in range(m):
    u,v = map(int,input().split())
    graph[u].append(v)
    graph[v].append(u)
    
count = 0
visited = [False]*(n+1)
for i in range(1,n+1):
    if not visited[i]:
        if not graph[i]:
            visited[i]=True
            count+=1
        else:
            dfs(i,0)
            count+=1
print(count)        