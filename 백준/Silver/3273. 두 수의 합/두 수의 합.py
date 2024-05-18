n = int(input())
arr = sorted(list(map(int, input().split())))
x = int(input())
l,r = 0,n-1
sum = 0
while l<r:
    tmp = arr[l]+arr[r]
    if (tmp==x):
        sum += 1
        l+=1
    elif(tmp < x):
        l+=1
    else:
        r-=1

print(sum)
