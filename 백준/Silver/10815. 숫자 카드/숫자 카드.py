n=int(input())
arr1=sorted(list(map(int,input().split())))
m=int(input())
arr2=list(map(int,input().split()))

for i in arr2:
    l=0
    r=n-1
    flag=False
    while l<=r:
        mid=(l+r)//2
        if arr1[mid]==i:
            flag=True
            break
        elif arr1[mid]>i:
            r=mid-1
        else:
            l=mid+1
    if flag:
        print(1,end=" ")
    else:
        print(0,end=" ")
    


