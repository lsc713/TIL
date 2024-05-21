import sys

input = sys.stdin.readline


def recur(idx, money):
    global answer

    if idx > n:
        if idx > (n + 1): return
        answer = max(answer, money)
        return
    recur(idx + graph[idx][0], money + graph[idx][1])
    recur(idx + 1, money)


n = int(input())
graph = [[] for _ in range(n + 1)]
for i in range(n):
    a, b = map(int, input().split())
    graph[i + 1] = [a, b]
answer = 0
recur(1, 0)
print(answer)