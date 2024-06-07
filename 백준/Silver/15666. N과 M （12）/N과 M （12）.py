import sys
input = sys.stdin.readline
n,m=map(int,input().split())
arr=sorted(list(map(int,input().split())))
tmp=[]
def recur(start):
    if len(tmp)==m:
        print(*tmp)
        return
    rem=0
    for i in range(start,n):
        if rem!=arr[i]:
            tmp.append(arr[i])
            rem=arr[i]
            recur(i)
            tmp.pop()
recur(0)
