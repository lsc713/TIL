n, m = map(int, input().split())
array1 = sorted(list(map(int, input().split())))
arr = []


def recur(start):
    if len(arr) == m:
        print(*arr)
        return
    for i in range(start, n):
        if array1[i] in arr:
            continue
        arr.append(array1[i])
        recur((i+1))
        arr.pop()


recur(0)