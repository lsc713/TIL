n,m=map(int,input().split())
visited=[0 for _ in range(n+1)]
arr=[]
def recur(start,number):
    if number == m:
        print(*arr)
        return
    for i in range(start,n+1):
        visited[i]=1
        arr.append(i)
        recur(i+1,number+1)

        arr.pop()
        visited[i]=0

recur(1,0)