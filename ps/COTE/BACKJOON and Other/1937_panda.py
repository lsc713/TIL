import sys
input = sys.stdin.readline


def recur(y, x):
    if dp[y][x] != 0:
        return dp[y][x]
    for dy, dx in [[1, 0], [-1, 0], [0, 1], [0, -1]]:
        ny = y + dy
        nx = x + dx
        if 0 <= nx < n and 0 <= ny < n:
            if graph[y][x] < graph[ny][nx]:
                dp[y][x] = max(dp[y][x], recur(ny, nx) + 1)
    return dp[y][x]


n=int(input())
graph=[list(map(int,input().split())) for _ in range(n)]

dp = [[0 for _ in range(n)] for _ in range(n)]
for i in range(n):
    for j in range(n):
        recur(i,j)
print(max(map(max,dp))+1)



