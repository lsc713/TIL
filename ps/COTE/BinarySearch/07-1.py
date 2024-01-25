# def sequential_search(n,target,array):
#     for i in range(n):
#         if array[i] == target:
#             return i+1
# input_date = input().split()
# n = int(input_date[0])
# target = input_date[1]
#
# array = input().split()
#
# print(sequential_search(n,target,array))
#
#
# 순서대로 탐색하기

# def binary_search(array,target,start,end):
#     if(start>end):
#         return None
#     mid =(start+end)//2
#
#     if array[mid] == target:
#         return mid
#     elif array[mid] > target:
#         return binary_search(array,target,start,mid-1)
#     else:
#         return binary_search(array,target,mid+1,end)
#
# n,target = list(map(int,input().split()))
# array = list(map(int,input().split()))
#
# result = binary_search(array,target,0,n-1)
# if result == None:
#     print("not exist")
# else:
#     print(result+1)

def binary_search(array,target,start,end):
    while start<=end:
        mid = (start+end)//2
        if(array[mid] == target):
            return mid
        elif array[mid] > target:
            end = mid -1
        else:
            start = mid +1
    return None

n,target = list(map(int,input().split()))
array = list(map(int,input().split()))

result = binary_search(array,target,0,n-1)
if result == None:
    print('not exist')
else:
    print(result+1)



