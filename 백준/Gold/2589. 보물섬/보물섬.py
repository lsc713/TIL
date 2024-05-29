from collections import deque
import sys
input =sys.stdin.readline

n, m = map(int, input().split())
maps = [list(map(str,input().rstrip())) for _ in range(n)]
dx = [-1, 1, 0, 0]
dy = [0, 0, -1, 1]


def bfs(y, x):
    q = deque()
    q.append([y, x])
    visited = [[0] * m for _ in range(n)]
    visited[y][x] = 1
    count = 0
    while q:
        y, x = q.popleft()
        for i in range(4):
            nx = x + dx[i]
            ny = y + dy[i]
            if 0 <= nx < m and 0 <= ny < n and visited[ny][nx] == 0 and maps[ny][nx] == 'L':
                visited[ny][nx] = visited[y][x] + 1
                count=max(count,visited[ny][nx])
                q.append([ny, nx])
    return count - 1


result = 0
for y in range(n):
    for x in range(m):
        if maps[y][x] == 'L':
            result = max(result, bfs(y, x))
print(result)
