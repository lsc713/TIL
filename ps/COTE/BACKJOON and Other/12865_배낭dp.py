import sys

input = sys.stdin.readline

n, k = map(int, input().split())


def solution(idx, weight):
    global answer
    if weight > k:
        return -9999999
    if idx == n:
        return 0
    if dp[idx][weight] != -1:
        return dp[idx][weight]
    dp[idx][weight] = max(solution(idx + 1, weight+graph[idx][0]) + graph[idx][1], solution(idx+1, weight))
    return dp[idx][weight]


graph = [list(map(int,input().split())) for _ in range(n)]
dp = [[-1 for _ in range(100001)] for i in range(n)]
answer = solution(0,0)
print(answer)