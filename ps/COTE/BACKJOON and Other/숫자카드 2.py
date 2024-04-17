n = int(input())
arr1 = list(map(int, input().split()))
m = int(input())
arr2 = list(map(int, input().split()))
arr1.sort()


def bs(arr, target, lo, hi):
    if lo > hi:
        return 0
    mid = (lo + hi) // 2
    if arr[mid] == target:
        return cnt.get(target)
    elif arr[mid] < target:
        return bs(arr, target, mid + 1, hi)
    else:
        return bs(arr, target, lo, mid - 1)


cnt = {}
for i in arr1:
    if i in cnt:
        cnt[i] += 1
    else:
        cnt[i] = 1
for i in arr2:
    print(bs(arr1, i, 0, len(arr1) - 1), end=' ')
