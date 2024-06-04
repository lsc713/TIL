import sys

input = sys.stdin.readline
import copy
from collections import deque
from itertools import combinations

n, m = map(int, input().split())
arr = [list(map(int, input().split())) for _ in range(n)]

viruses = []
empty_spaces = []
dx = [-1, 1, 0, 0]
dy = [0, 0, -1, 1]

for i in range(n):
    for j in range(m):
        if arr[i][j] == 0:
            empty_spaces.append((i, j))
        elif arr[i][j] == 2:
            viruses.append((i, j))


def bfs(lab_copy):
    q = deque(viruses)
    while q:
        x, y = q.popleft()
        for i in range(4):
            nx = x + dx[i]
            ny = y + dy[i]
            if 0 <= nx < n and 0 <= ny < m and lab_copy[nx][ny] == 0:
                lab_copy[nx][ny] = 2
                q.append((nx, ny))
    safe_area = sum(row.count(0) for row in lab_copy)
    return safe_area


max_safe_area = 0
for walls in combinations(empty_spaces, 3):
    lab_copy = copy.deepcopy(arr)
    for x, y in walls:
        lab_copy[x][y] = 1
    safe_area = bfs(lab_copy)
    max_safe_area = max(safe_area, max_safe_area)
print(max_safe_area)

