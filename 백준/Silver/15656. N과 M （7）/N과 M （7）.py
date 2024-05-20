n, m = map(int, input().split())
array1 = sorted(list(map(int, input().split())))

arr = []
visited = [0 for _ in range(n + 1)]


def recur(number):
    if len(arr) == m:
        print(*arr)
        return
    for i in range(1, n + 1):
        visited[i] = 1
        arr.append(array1[i - 1])
        recur(number + 1)
        arr.pop()
        visited[i] = 0


recur(0)
