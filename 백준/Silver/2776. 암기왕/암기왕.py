import sys

input = sys.stdin.readline


def bs(arr, target, lo, hi):
    if lo > hi:
        return 0
    mid = (lo + hi) // 2
    if arr[mid] == target:
        return 1
    elif arr[mid] > target:
        return bs(arr, target, lo, mid - 1)
    else:
        return bs(arr, target, mid + 1, hi)


T = int(input())
for _ in range(T):
    n = int(input())
    arr1 = list(map(int, input().split()))
    m = int(input())
    arr2 = list(map(int, input().split()))
    arr1.sort()
    for i in arr2:
        print(bs(arr1, i, 0, n - 1))



