import sys
input = sys.stdin.readline
n,m=map(int,input().split())
arr=list(map(int,input().split()))
l=1
r=max(arr)*m
result=r
while l<=r:
    mid = (l+r)//2
    count=0
    for i in arr:
        count += mid//i
    if count <m:
        l=mid+1
    else:
        r=mid-1
        result=mid
print(result)        
        