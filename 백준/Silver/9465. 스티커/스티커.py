# import sys
#
# input = sys.stdin.readline
# T = int(input())
# sum = 0
# for _ in range(T):
#     n = int(input())
#     arr1 = list(map(int, input().split()))
#     arr2 = list(map(int, input().split()))
#     dp1=[0]* n
#     dp2=[0]* n
#
#     dp1[0] = arr1[0]
#     dp2[0] = arr2[0]
#     if n==1:
#         sum+=max(arr1[0],arr2[0])
#     dp1[1] = max(arr1[0],arr1[1])
#     dp2[1] = max(arr2[0],arr2[1])
#     if n==2:
#         # sum+=max(arr1[0]+arr2[1],arr1[1]+arr2[0])
#         sum+=dp1[1]+dp2[1]
#         if dp1[1]==arr1[1] & dp2[1]==arr2[1]:
#             sum=0
#             sum+=max(dp1[1]+arr2[0],arr1[1]+dp2[1])
#     # for i in range(3,n):
#
# print(sum)

import sys

input = sys.stdin.readline
T = int(input())
for _ in range(T):
    n = int(input())
    arr = [list(map(int, input().split())) for _ in range(2)]
    dp=[[0]* n for _ in range(2)]

    dp[0][0] = arr[0][0]
    dp[1][0] = arr[1][0]
    if n==1:
        print(max(dp[0][0],dp[1][0]))
        continue
    dp[0][1] = arr[1][0]+arr[0][1]
    dp[1][1] = arr[1][1]+arr[0][0]
    if n==2:
        print(max(dp[0][1],dp[1][1]))
        continue
    for i in range(2,n):
        dp[0][i]=max(dp[1][i-2],dp[1][i-1])+arr[0][i]
        dp[1][i]=max(dp[0][i-2],dp[0][i-1])+arr[1][i]

    print(max(dp[0][-1],dp[1][-1]))


# for _ in range(T):
#     n = int(input())
#     dp = [list(map(int,input().split())) for _ in range(2)]
#     dp[0][1] += dp[1][0]
#     dp[1][1] += dp[0][0]
#     for i in range(2,n):
#         dp[0][i] += max(dp[1][i-1],dp[1][i-2])
#         dp[1][i] += max(dp[0][i-1],dp[0][i-2])
#     print(max(dp[0][n-1],dp[1][n-1]))
