n=int(input())
graph = [0]*100001
xlist=[]
ylist=[]
for i in range(n):
    x,y = map(int,input().split())
    graph[x]=y
    xlist.append(x)
    ylist.append(y)
maxheight = max(ylist)
maxwidth=max(xlist)
prefix = [0]*(maxwidth+2)
suffix  = [0]*(maxwidth+2)

maxpoint=[]

h=0
for f in range(1,maxwidth+3):
    if(graph[f]==maxheight):
        maxpoint.append(f)
        break
    h=max(h,graph[f])
    prefix[f]=prefix[f-1]+h
h=0
for b in range(maxwidth,0,-1):
    if(graph[b]==maxheight):
        maxpoint.append(b)
        break
    h = max(h,graph[b])
    suffix[b] = suffix[b+1]+h
answer = max(prefix) + max(suffix)
answer += (maxpoint[1]-maxpoint[0]+1) *maxheight
print(answer)
