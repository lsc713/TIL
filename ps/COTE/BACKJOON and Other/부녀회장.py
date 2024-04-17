T = int(input())
sum = 0
for i in range(T):
    k = int(input())
    n = int(input())
    dp = [m for m in range(1,n+1)]
    for j in range(1,k+1):
        for i in range(1, n):
            dp[i] += dp[i-1]
    print(dp[n-1])
# dp[4]=dp[0]
# dp[5]=dp[0]+dp[1]
# dp[6]=dp[0]+dp[1]+dp[2]

