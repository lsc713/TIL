from collections import deque
def solution(n, computers):
    answer = 0
    visited=[0]*(n)
    def bfs(start):
        q=deque()
        q.append(start)
        visited[start]=1
        while q:
            x=q.popleft()
            for i in range(n):
                if computers[x][i]==1 and visited[i]==0:
                    q.append(i)
                    visited[i]=1
    for i in range(n):
        if not visited[i]:
            bfs(i)
            answer+=1
        
    return answer