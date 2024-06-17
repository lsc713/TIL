import sys
input= sys.stdin.readline
n,s=map(int,input().split())
arr=list(map(int,input().split()))
l,r=0,0
sum=0
min_length=1e9
while True:
    if sum>=s:
        min_length=min(min_length,r-l)
        sum-=arr[l]
        l+=1
    elif r==n:
        break
    else:
        sum+=arr[r]
        r+=1
if min_length==1e9:
    print(0)
else:
    print(min_length)