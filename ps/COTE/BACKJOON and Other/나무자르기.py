import sys
input = sys.stdin.readline
n,m=list(map(int,input().split()))
arr=list(map(int,input().split()))
lo,hi=0,max(arr)
while lo<=hi:
    mid=(lo+hi)//2
    sum=0
    for i in arr:
        if i>=mid:
            sum+=i-mid
    if sum>=m:
        lo=mid+1
    else:
        hi=mid-1
print(hi)