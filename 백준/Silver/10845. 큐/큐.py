from collections import deque
import sys
input = sys.stdin.readline
n=int(input())
arr=deque()
for i in range(n):
    ele=(input().split())
    if (ele[0] == 'push'):
        arr.append(ele[1])
    elif(ele[0]=='pop'):
        if len(arr) != 0:
            print(arr.popleft())
        else:
            print(-1)
    elif ele[0] == 'size':
        print(len(arr))
    elif ele[0] =='empty':
        if len(arr) == 0:
            print(1)
        else:
            print(0)
    elif ele[0] == 'front':
        if len(arr) != 0:
            print(arr[0])
        else:
            print(-1)
    elif ele[0]=='back':
        if len(arr) != 0:
            print(arr[-1])
        else:
            print(-1)