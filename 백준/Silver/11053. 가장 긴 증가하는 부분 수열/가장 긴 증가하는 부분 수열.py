import sys
input = sys.stdin.readline
n=int(input())
graph=list(map(int,input().split()))
dp= [1]*(n+1)
for i in range(n):
    for j in range(i):
        if graph[i]>graph[j]:
            dp[i]=max(dp[i],dp[j]+1)
print(max(dp))            
