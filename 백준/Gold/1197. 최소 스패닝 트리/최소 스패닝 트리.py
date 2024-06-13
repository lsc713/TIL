import sys
import heapq

input = sys.stdin.readline
v, e = map(int, input().split())
visited = [0] * (v + 1)
graph = [[] for _ in range(v + 1)]
heap = [[0, 1]]
answer = 0

for i in range(e):
    a, b, c = map(int, input().split())
    graph[a].append([c, b])
    graph[b].append([c, a])

cnt = 0
while heap:
    if cnt == v:
        break
    c, a = heapq.heappop(heap)
    if not visited[a]:
        visited[a] = True
        answer += c
        cnt += 1
        for i in graph[a]:
            heapq.heappush(heap, i)
print(answer)