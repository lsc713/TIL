import sys 
from collections import Counter

input = sys.stdin.readline

n,m=map(int,input().split())
arr=[list(map(int,input().split()))[1:] for _ in range(n)]
lamps=Counter(lamp for row in arr for lamp in row)
for row in arr:
    flag = False
    for lamp in row:
        if lamps[lamp] - 1 ==0:
            flag = True
            break
    if not flag:
        print(1)
        exit()
print(0)        

