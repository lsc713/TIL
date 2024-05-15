n,m=map(int,input().split())
arr=list(map(int,input().split()))
arr.sort()
graph=[]
def dfs():
    if len(graph)==m:
        print(*graph)
        return
    tmp=0
    for i in range(n):
        if tmp != arr[i]:
            graph.append(arr[i])
            tmp=arr[i]
            dfs()
            graph.pop()
dfs()        
    