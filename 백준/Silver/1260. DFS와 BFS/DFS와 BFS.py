from collections import deque

n,m,v = map(int,input().split())
graph = [[False] * (n+1) for _ in range(n+1)]

for i in range(m):
    x,y = map(int,input().split())
    graph[x][y] =1
    graph[y][x] =1

visitd = [False] * (n+1)
visitb = [False] * (n+1)

def dfs(v):
    visitd[v] = True
    print(v, end=" ")
    for i in range(1,n+1):
        if not visitd[i] and graph[v][i] == 1:
            dfs(i)

def bfs(v):
    q = deque([v])
    visitb[v] = True
    while q:
        v = q.popleft()
        print(v, end =" ")
        for i in range(1,n+1):
            if not visitb[i] and graph[v][i] == 1:
                q.append(i)
                visitb[i]=True
                
dfs(v)
print()
bfs(v)