import sys
import heapq

q=[]
n=int(input())
for _ in range(n):
    m=int(sys.stdin.readline())
    if m != 0:
        heapq.heappush(q,m)
    else:
        try:
            print(heapq.heappop(q))
        except:
            print(0)
    