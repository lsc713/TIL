import sys
input=sys.stdin.readline
n, m = map(int,input().split())
visited = [0 for _ in range(n + 1)]
arr = []


def recur(number):
    if number == m:
        print(*arr)
        return
    for i in range(1, n + 1):
        if visited[i] == 1:
            continue
        visited[i] = 1
        arr.append(i)
        recur(number + 1)
        arr.pop()
        visited[i] = 0


recur(0)
