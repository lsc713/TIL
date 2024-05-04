c,n = map(int,input().split())
arr=[list(map(int,input().split())) for _ in range(n)]
INF = float('inf')
dp = [INF for _ in range(c+100)]
dp[0]=0

for cost,people in arr:
    for i in range(people,c+100):
        dp[i] = min(dp[i],dp[i-people]+cost)
print(min(dp[c:]))