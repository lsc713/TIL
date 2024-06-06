import sys
input =sys.stdin.readline
n,m=map(int,input().split())
arr=sorted(list(map(int,input().split())))
tmp=[]
visited=[0]*n
def recur():
    if len(tmp)==m:
        print(*tmp)
        return
    rem=0
    for i in range(n):
        if not visited[i] and rem != arr[i]:
            visited[i] = True
            tmp.append(arr[i])
            rem=arr[i]
            recur()
            visited[i]=False
            tmp.pop()
        
        
        
recur()



    