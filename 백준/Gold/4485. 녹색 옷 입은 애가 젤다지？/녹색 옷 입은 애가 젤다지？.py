import sys
from collections import deque

input = sys.stdin.readline
dx = [-1, 1, 0, 0]
dy = [0, 0, -1, 1]


def bfs(x, y, arr, cost):
  q = deque()
  q.append((x, y))
  while q:
    x, y = q.popleft()
    for i in range(4):
      nx, ny = x + dx[i], y + dy[i]

      if 0 <= nx < n and 0 <= ny < n:
        if cost[nx][ny] > cost[x][y] + arr[nx][ny]:
          cost[nx][ny] = cost[x][y] + arr[nx][ny]
          q.append((nx, ny))


count = 1
while True:
  n = int(input())
  if n == 0:
    break
  arr = [list(map(int, input().split())) for _ in range(n)]
  cost = [[int(1e9)] * n for _ in range(n)]
  cost[0][0] = arr[0][0]
  bfs(0, 0, arr, cost)

  print(f"Problem {count}: {cost[n - 1][n - 1]}")
  count += 1
