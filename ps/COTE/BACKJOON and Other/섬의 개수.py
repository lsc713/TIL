from collections import deque
import sys
read = sys.stdin.readline


def bfs(x, y):
    dx = [-1, 1, 0, 0, -1, -1, 1, 1]
    dy = [0, 0, -1, 1, 1, -1, 1, -1]

    field[x][y] = 0
    q = deque()
    q.append([x, y])
    while q:
        a, b = q.popleft()
        for i in range(8):
            nx = a + dx[i]
            ny = b + dy[i]
            if 0 <= nx < m and 0 <= ny < n and field[nx][ny] == 1:
                field[nx][ny] = 0
                q.append([nx, ny])


while True:
    n, m = map(int, read().split())
    if n == 0 and m == 0:
        break
    field = []
    count = 0
    for _ in range(m):
        field.append(list(map(int, input().split())))
    for i in range(m):
        for j in range(n):
            if field[i][j] == 1:
                bfs(i, j)
                count += 1
    print(count)
