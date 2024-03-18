


def dfs(start):
    if (len(s) == 6):
        print(' '.join(map(str, s)))
        return

    for i in range(start, len(m)):
        if (m[i] in s):
            continue
        s.append(m[i])
        dfs(i + 1)
        s.pop()

while True:
    arr = list(map(int, input().split()))
    n = arr[0]
    m = arr[1:]
    if n ==0:
        break
    s = []

    dfs(0)
    print()
