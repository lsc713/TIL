import sys
input = sys.stdin.readline
n,m=map(int,input().split())
arr=list(map(int,input().split()))
l=0
r=max(arr)
while l<=r:
    mid=(l+r)//2
    count=0
    for i in arr:
        if i >= mid:
            count+=i-mid
    if count>=m:
        l=mid+1
    else:
        r=mid-1
print(r)        
        