import sys

input = sys.stdin.readline


def recur(idx, sin, sun, use):
    global answer
    if idx == n:
        if use > 0:
            answer = min(answer, abs(sin - sun))
        return
    recur(idx + 1, sin * graph[idx][0], sun + graph[idx][1], use + 1)
    recur(idx + 1, sin, sun, use)


n = int(input())
graph = [() for i in range(n)]
for i in range(n):
    a, b = map(int, input().split())
    graph[i]=(a, b)
answer = 1e9

recur(0, 1, 0, 0)
print(answer)
