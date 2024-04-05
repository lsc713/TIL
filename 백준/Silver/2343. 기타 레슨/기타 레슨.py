import sys
input = sys.stdin.readline
n,m=map(int,input().split())
arr=list(map(int,input().split()))

lo,hi=max(arr),sum(arr)
while lo<=hi:
    mid=(lo+hi)//2
    lec=0
    count=1
    for i in arr:
        if lec+i>mid:
            count+=1
            lec = 0
        lec+=i
    if count<=m:
        result = mid
        hi =mid-1
    else:
        lo=mid+1
    
print(result)