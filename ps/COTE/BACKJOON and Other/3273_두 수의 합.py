n = int(input())
arr = sorted(list(map(int, input().split())))
x = int(input())
l,r = 0,n-1
sum = 0
for i in range(l,r):
    if (arr[l]==x):
        sum += 1
        l+=1
    elif(arr[l]+arr[r] == x):
        sum+=1
        l+=1
    else:
        r-=1

print(sum)
