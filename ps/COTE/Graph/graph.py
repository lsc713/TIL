# def find_parent(parent, x):
#     if parent[x] != x:
#         return find_parent(parent,parent[x])
#     return x
#
# def union_parent(parent,a,b):
#     a = find_parent(parent,a)
#     b = find_parent(parent,b)
#     if a<b:
#         parent[b] = a
#     else:
#         parent[a] = b
#
# #node, line input & 부모테이블초기화
# v,e = map(int,input().split())
# parent = [0] *(v+1)
#
# #parent 자기자신으로 초기화
# for i in range(1,v+1):
#     parent[i] = i
#
# for i in range(e):
#     a,b = map(int,input().split())
#     union_parent(parent,a,b)
#
# print("각 원소가 속한 집합 : ", end=' ')
# for i in range(1,v+1):
#     print( find_parent(parent,i),end=' ')
#
# print()
#
# print("부모테이블 : ", end=' ')
# for i in range(1,v+1):
#     print(parent[i],end=' ')
#

# def find_parent(parent,x):
#     if parent[x] != x:
#         return find_parent(parent, parent[x])
#     return x

# def union_parent(parent,a,b):
#     a=find_parent(parent,a)
#     b=find_parent(parent,b)
#     if a<b:
#         parent[b] = a
#     else:
#         parent[a]=b
# v,e = map(int,input().split())
# parent = [0] * (v+1)
#
# for i in range(1,v+1):
#     parent[i] = i
#
# for i in range(e):
#     a,b= map(int,input().split())
#     union_parent(parent,a,b)
#
# print("각원소의 속한 집합 : ",end=' ')
# for i in range(1,v+1):
#     print(find_parent(parent,i),end=' ')
#
# print("부모테이블: ",end=' ')
# for i in range(1,v+1):
#     print(parent[i],end=' ')

#
# def find_parent(parent,x):
#     if parent[x] != x:
#         return find_parent(parent,parent[x])
#     return parent[x]
#
# def union_parent(parent,a,b):
#     a=find_parent(parent,a)
#     b=find_parent(parent,b)
#     if(a<b):
#         parent[b] = a
#     else:
#         parent[a] = b
#
# v,e= map(int,input().split())
# parent=[0]*(v+1)
#
# for i in range(e):
#     parent[i] = i
#
# cycle = False
#
# for i in range(e):
#     a,b = map(int,input().split())
#
#     if find_parent(parent,a) == find_parent(parent,b):
#         cycle=True
#         break
#     else:
#         union_parent(parent,a,b)
#
# if cycle:
#     print("cycle on")
# else:
#     print("not cycle")
#
#
# def find_parent(parent,x):
#     if parent[x] != x:
#         parent[x] = find_parent(parent,parent[x])
#     return parent[x]
#
# def union_parent(parent,a,b):
#     a = find_parent(parent,a)
#     b = find_parent(parent,b)
#     if a<b:
#         parent[b]=a
#     else:
#         parent[a]=b
# v,e = map(int,input().split())
# parent = [0]*(v+1)
#
# for i in range(1,v+1):
#     parent[i] = i
#
# edges = []
# result = 0
#
# for _ in range(e):
#     a,b,cost = map(int,input().split())
#     edges.append(cost,a,b)
#
# edges.sort()
#
# for edge in edges:
#     cost,a,b  = edge
#     if find_parent(parent,a) != find_parent(parent,b):
#         union_parent(parent,a,b)
#         result+=cost
# print(result)
#
# from collections import deque
# v,e = map(int,input().split())
# indegree = [0]*(v+1)
#
# graph = [[] for i in range(v+1)]
#
# for _ in range(e):
#     a,b = map(int,input().split())
#     graph[a].append(b)
#     indegree[b]+=1
#
# def topology_sort():
#     result = []
#     q = deque
#
#     for i in range(1,v+1):
#         if indegree[i] == 0:
#             q.append(i)
#     while q:
#         now = q.popleft()
#         result.append(now)
#
#         for i in graph[now]:
#             indegree[i] -= 1
#             if indegree[i]==0:
#                 q.append(i)
#     for i in result:
#         print(i,end=' ')
#
# topology_sort()
