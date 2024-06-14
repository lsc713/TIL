import sys
input = sys.stdin.readline
n=int(input())
arr=[list(map(int,input().split())) for _ in range(n)]
dp = [[0] * n for _ in range(n)]
for length in range(2,n+1):
    for i in range(n-length+1):
        j=i+length-1
        dp[i][j]=float('inf')
        for k in range(i,j):
            q=dp[i][k]+dp[k+1][j]+arr[i][0]*arr[k][1]*arr[j][1]
            if q< dp[i][j]:
                dp[i][j]=q
print(dp[0][n-1])                