import sys
input=sys.stdin.readline
def solution(idx):
  dp=[0] * (idx+1)
  dp[1]=1
  dp[2]=2
  dp[3]=4
  for i in range(4,idx+1):
    dp[i]=(dp[i-1]+dp[i-2]+dp[i-3])%1_000_000_009
  return dp


T=int(input())
graph = [int(input()) for i in range(T)]
dp = solution(max(graph))
for i in graph:
  print(dp[i])
