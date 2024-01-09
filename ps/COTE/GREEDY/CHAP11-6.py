# arr = list(map(int,input().split()))
#
# k  = int(input())
#
# result = 0
#
# for i in range(len(arr)):
#     if(arr[i] >= 0):
#         result = arr[i] -1
#
#     elif(arr[i] == 0):
#         result = arr[i+1] -1
#     else:
#         result = -1
#
#
# print(result)

import heapq

def solution(food_times, k):
    if sum(food_times) <= k:
        return -1

    q=[]

    for i in range(len(food_times)):
        heapq.heappush(q,(food_times[i],i+1))

    sum_value = 0
    previous = 0
    length = len(food_times)
    while sum_value+((q[0][0] -previous) * length) <= k:
        now = heapq.heappop(q)[0]
        sum_value += (now - previous) * length
        length -= 1
        previous = now

    result = sorted(q, key=lambda x:x[1])
    return result[(k-sum_value) % length] [1]

"""
흠.. 쉽지 않네 ... 일단은 벽이다
"""