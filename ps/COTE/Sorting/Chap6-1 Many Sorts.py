#인자 변경시키기
# array = [3,5]
#
# array[0],array[1] = array[1],array[0],
#
# print(array)


# selection sort : 앞으로 제일작은거 하나씩가져오기


# array = [7,5,6,9,0,3,1,6,4,8]
#
# for i in range(len(array)):
#     min = i
#     for j in range(i+1, len(array)):
#         if array[min]>array[j]: #배열의 인자하나하나를 비교하여 작은게 있다면 최솟값을 치환하고 위치 변경
#             min = j
#     array[i], array[min] = array[min],array[i]
#
# print(array)

# insertion sort 앞에서부터 뒤에꺼라 작은지 비교하여 정렬 (두번째부터시작하는것이 특징)
#
# array = [7,5,6,9,0,3,1,6,4,8]
#
# for i in range(len(array)):
#     for j in range(i,0,-1):
#         if array[j] < array[j-1]:
#             array[j],array[j-1] = array[j-1],array[j],
#         else:
#             break
# print(array)

#quick sort : 많이사용됨. 빠르기도함. 피벗을 기준으로 양쪽으로 배열재정립 후 정렬진행

# array = [5,7,9,0,3,1,6,2,4,8]
#
# def quicksort(array,start,end):
#     if start>=end:
#         return
#     pivot = start
#     left = start +1
#     right = end
#     while left<right:
#         while left<= end and array[left] <= array[pivot]:
#             left+=1
#         while right> start and array[right] >= array[pivot]:
#             right-=1
#         if left>right:
#             array[right], array[pivot] = array[pivot], array[right]
#         else:
#             array[left],array[right] = array[right],array[left],
#
#     quicksort(array,start,right-1)
#     quicksort(array,right+1,end)
#
# quicksort(array,0,len(array)-1)
# print(array)


#quicksort with python
# array = [5,7,9,0,3,1,6,2,4,8]
#
# def quick_sort(array):
#     if len(array)<=1:
#         return array
#     pivot = array[0]
#     tail = array[1:]
#
#     left_side = [x for x in tail if x<=pivot]
#     right_side = [x for x in tail if x> pivot]
#
#     return quick_sort(left_side) + [pivot] + quick_sort(right_side)
#
# print(quick_sort(array))

#count sort 1000000이하의 경우

array = [7,5,9,0,3,1,6,2,9,1,4,8,0,5,2]

count = [0] * (max(array)+1)

for i in range(len(array)):
    count[array[i]]+=1

for i in range(len(count)):
    for j in range(count[i]):
        print(i,end=' ')