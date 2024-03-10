n =int(input())

arr=[]
for i in range(n):
    arr.append(int(input()))

arr.sort()
arr.reverse()

result1 = 0
result2 =0
for i in range(len(arr)):
    result = arr[i]*(i+1)
    if(result2<result):
        result2 = result
print(result2)