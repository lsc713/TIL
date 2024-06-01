import sys
input = sys.stdin.readline
n = int(input())
m = int(input())
arr = list(map(int, input().split()))

l = 0
r = n-1
result = n
while l <= r:
    mid = (l + r) // 2
    valid=True
    covered=0
    for i in arr:
        if i - mid > covered:
            valid= False
            break
        covered = i + mid
    if covered<n:
        valid=False
    if valid:
        result =mid
        r=mid-1
    else:
        l=mid+1
print(result)