n=int(input())
arr = []
arr_x = []
arr_y = []
answer = [-1] * n
for _ in range(n):
    a,b = map(int,input().split())
    arr.append([a,b])
    arr_x.append(a)
    arr_y.append(b)
for y in arr_y:
    for x in arr_x:
        dist=[]
        for ex,ey in arr:
            d= abs(ex-x) + abs(ey-y)
            dist.append(d)
        dist.sort()
        tmp=0
        for i in range(len(dist)):
            d=dist[i]
            tmp+=d
            if answer[i] == -1:
                answer[i]=tmp
            else:
                answer[i] = min(tmp,answer[i])
print(*answer)       
        
    