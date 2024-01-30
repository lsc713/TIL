# n = int(input())
# arr = list(map(int,input().split()))
#
# for i in arr:
#     if i==n:
#         print(True)
#         break
#     print(False)

# def a(num, arr):
#     for i in arr:
#         if(num == i):
#             return True
#     return False
#
# result = a(7,[1,2,3,4,7])
# print(result)

# stack = []
#
# stack.append()
# stack.pop()
#
# from collections import deque
#
# q = deque()
#
#
# def solution(numbers, num1, num2):
#     answer = numbers[num1:numb2]
#     return answer



#루트노트찾을떄까지 재귀호출.
def find_parent(parent,x):
    if parent[x] != x:
        return find_parent(parent,parent[x])
    return x


def union_parent(parent,a,b):
    a = find_parent(parent,a)
    b = find_parent(parent,b)
    if a<b:
        parent[b] = a
    else:
        parent[a] = b

v,e = map(int,input().split())
parent = [0] * (v+1)

for i in range(1,v+1):
    parent[i] = i

for i in range(e):
    a,b = map(int,input().split())
    union_parent(parent,a,b)

for i in range(1,v+1):
    print(find_parent(parent,i),end=' ')

print()

print('parent table: ', end=' ')
for i in range(1,v+1):
    print(parent[i],end=' ')