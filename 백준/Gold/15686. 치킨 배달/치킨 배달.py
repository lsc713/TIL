import sys
input = sys.stdin.readline

n, m = map(int, input().split())
arr = [list(map(int, input().split())) for _ in range(n)]

home = []
chic = []

# 홈과 치킨집 위치 저장
for i in range(n):
    for j in range(n):
        if arr[i][j] == 1:
            home.append((i, j))
        elif arr[i][j] == 2:
            chic.append((i, j))

visited = [False] * len(chic)
min_ans = float('inf')

def dfs(idx, cnt):
    global min_ans
    if cnt == m:
        ans = 0
        for hx, hy in home:
            distance = float('inf')
            for j in range(len(visited)):
                if visited[j]:
                    cx, cy = chic[j]
                    distance = min(distance, abs(hx - cx) + abs(hy - cy))
            ans += distance
        min_ans = min(ans, min_ans)
        return
    
    for i in range(idx, len(chic)):
        if not visited[i]:
            visited[i] = True
            dfs(i + 1, cnt + 1)
            visited[i] = False

dfs(0, 0)
print(min_ans)