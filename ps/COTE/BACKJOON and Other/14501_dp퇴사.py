import sys
input = sys.stdin.readline

def solution(idx):
    if idx>n+1:
        return -99999999
    if idx==n+1:
        return 0
    if dp[idx] != -1:
        return dp[idx]
    dp[idx] = max(solution(idx+1),solution(idx+graph[idx][0])+graph[idx][1])
    return dp[idx]
n=int(input())
graph = [[] for _ in range(n+1)]
for i in range(n):
    a,b=map(int,input().split())
    graph[i+1]=[a,b]
dp = [-1 for i in range(n+1)]
answer=solution(1)
print(answer)
