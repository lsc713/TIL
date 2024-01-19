from collections import deque
import copy

v = int(input())

#노드 진입차수 초기화
indegree =[0]*(v+1)


graph = [[] for i in range(v+1)]

#강의시간초기화
time = [0] * (v+1)

#방향그래프의 간선정보받기
for i in range(1,v+1):
    data = list(map(int,input().split()))
    time[i] = data[0] #첫번째 수는 시간정보를 갖고 있다.
    #모름
    for x in data[1:-1]:
        indegree[i] +=1
        graph[x].append(i)

def topology_sort():
    result = copy.deepcopy(time)
    q = deque()

    for i in range(1,v+1):
        if indegree[i]==0:
            q.append(i)

    while q:
        now = q.popleft()
        for i in graph[now]:
            result[i] = max(result[i],result[now] + time[i])
            indegree[i] -=1
            if indegree[i] == 0:
                q.append(i)

    for i in range(1,v+1):
        print(result[i])

topology_sort()
