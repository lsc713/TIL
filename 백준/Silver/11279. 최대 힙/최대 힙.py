import sys
import heapq
input = sys.stdin.readline

n=int(input())
Q=[]
for _ in range(n):
    m=int(input())
    if(m==0):
        if Q:
            print(-heapq.heappop(Q))
        else:
            print(0)
    else:
        heapq.heappush(Q,-m)
        
        