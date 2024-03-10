n,m=list(map(int,input().split()))
arr = []
for i in range(n):
    arr.append(int(input()))
cnt=0
arr.reverse()
for i in arr:
    if m >= i:
        cnt+=m//i
        m%=i
        
print(cnt)