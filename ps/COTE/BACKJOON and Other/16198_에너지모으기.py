import sys
input = sys.stdin.readline
n=int(input())
arr=list(map(int,input().split()))
result=0

# def recursive(param):
#     global result
#     if len(arr) ==2:
#         if param>result:
#             result=param
#             return 0
#     for i in range(1,len(arr)-1):
#         param+=(arr[i-1] * arr[i+1])
#         tmp = arr[i]
#         del arr[i]
#         recursive(param)
#         arr.insert(i,tmp)
#         param-=(arr[i-1] * arr[i+1])

# recursive(0)

# def re(a):
#     global result
#     if len(arr) == 2:
#         if a> result:
#             result = a
#             return 0
#     for i in range(1,len(arr)-1):
#         a+=(arr[i-1] * arr[i+1])
#         tmp = arr[i]
#         del arr[i]
#         re(a)
#         arr.insert(i,tmp)
#         a-=(arr[i-1] * arr[i+1])
#
#
#
# re(0)

def bt(x):
    global result
    if len(arr) == 2:
        result = max(result,x)
        return
    for i in range(1,len(arr)-1):
        target = arr[i-1] * arr[i+1]

        g = arr.pop(i)
        bt(x+target)
        arr.insert(i,g)

bt(0)
print(result)