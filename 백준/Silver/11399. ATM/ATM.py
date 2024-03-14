n=int(input())
arr=list(map(int,input().split()))


arr.sort(reverse=True)
result = 0
for i in range(n):
    result += arr[i] * (i+1)

print(result)