from collections import deque
from itertools import combinations

dx = [-1, 1, 0, 0]
dy = [0, 0, -1, 1]
time = 1e9


def bfs(virus, min_time, leftArea):
    global time
    queue = deque(virus)
    time_val = 0
    visited = [[False] * n for _ in range(n)]
    for x, y in virus:
        visited[x][y] = True

    while queue:
        if not leftArea:
            break
        time_val += 1
        if time_val >= min_time:
            return 1e9

        for _ in range(len(queue)):
            x, y = queue.popleft()
            for i in range(4):
                nx, ny = x + dx[i], y + dy[i]
                if 0 <= nx < n and 0 <= ny < n:
                    if graph[nx][ny] != 1 and not visited[nx][ny]:
                        visited[nx][ny] = True
                        queue.append((nx, ny))
                        if graph[nx][ny] == 0:
                            leftArea -= 1

    if not leftArea:
        return time_val
    else:
        return 1e9


n, m = map(int, input().split())
graph = [list(map(int, input().split())) for _ in range(n)]
virusList = []

left = 0
for i in range(n):
    for j in range(n):
        if graph[i][j] == 2:
            virusList.append([i, j])
        if graph[i][j] == 0:
            left += 1

for virus in combinations(virusList, m):
    time = min(time, bfs(virus, time, left))

if time == 1e9:
    print(-1)
else:
    print(time)