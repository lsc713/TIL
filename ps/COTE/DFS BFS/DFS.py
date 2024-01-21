# INF = 999999999
#
# graph =[
#     [1,2,3],
#     [1,2,INF],
#     [INF,1,2]
#
# ]
#
# print(graph)

#인접리스트방식
graph = [[] for _ in range(3)]

graph[0].append((1,2))
graph[0].append((2,5))

graph[1].append((2,3))

print(graph)
