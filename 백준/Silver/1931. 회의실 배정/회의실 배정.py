n = int(input())
graph =[]
for i in range(n):
    a,b = map(int,input().split())
    graph.append((a,b))
graph.sort(key = lambda x:(x[1],x[0]))

count=1
end = graph[0][1]
for i in range(1,n):
    if(graph[i][0]>=end):
        end = graph[i][1]
        count+=1
print(count)        

