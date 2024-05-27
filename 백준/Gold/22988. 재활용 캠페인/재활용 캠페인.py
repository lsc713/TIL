n,m=map(int,input().split())
arr=sorted(list(map(int,input().split())))
answer=0
remain=0
l,r=0,n-1
while l<=r:
    if arr[r]==m:
        answer+=1
        r-=1
        continue
    if l==r:
        remain+=1
        break
    if arr[l]+arr[r]>=m/2:
        answer+=1
        r-=1
        l+=1
    else:
        l+=1
        remain+=1
print(answer+remain//3)