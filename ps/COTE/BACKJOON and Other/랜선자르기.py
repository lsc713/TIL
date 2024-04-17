import sys

n, m = map(int, input().split())
arr = [int(sys.stdin.readline()) for _ in range(n)]

lo, hi = 1, max(arr)
while lo <= hi:
    mid = (lo + hi) // 2
    line = 0
    for i in arr:
        line += i // mid
    if line >= m:
        lo = mid + 1
    else:
        hi = mid - 1
print(hi)
