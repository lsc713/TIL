def change(b):
    if arr[b]==1:
        arr[b]=0
    else:
        arr[b]=1
n=int(input())
arr = [0] + list(map(int,input().split()))
p = int(input())
for _ in range(p):
    a,b = map(int,input().split())
    if a == 1:
        for i in range(b,n+1,b):
            change(i)
    else:
        change(b)
        for j in range(n//2):
            if b+j>n or b-j<1 : break
            if arr[b+j] == arr[b-j]:
                change(b+j)
                change(b-j)
            else:
                break

for i in range(1,n+1):
    print(arr[i], end = " ")
    if i % 20 == 0:
        print()