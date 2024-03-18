n,m = map(int,input().split())

s = []
arr = list(map(int,input().split()))
arr.sort()
def dfs():
    if(len(s)==m):
        print(' '.join(map(str,s)))
        return

    for i in range(len(arr)):
        if(arr[i]in s):
            continue
        s.append(arr[i])
        dfs()
        s.pop()

dfs()