import sys
input = sys.stdin.readline
from collections import deque
n=int(input())
arr=[[]for i in range(n+1)]

for i in range(n-1):
    a,b = map(int,input().split())
    arr[a].append(b)
    arr[b].append(a)
q=deque()
q.append(1)
ans=[0]*(n+1)
def bfs():
    while q:
        now = q.popleft()
        for i in arr[now]:
            if ans[i]==0:
                ans[i]=now
                q.append(i)

bfs()
res = ans[2:]
for i in res:
    print(i)