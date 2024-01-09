n,m = map(int,input().split())
arr= []
arr = list(map(int,input().split()))

result = 0
"""

i/o 예시

5 3
1 3 2 3 2


8

13 12 13 12 32 32 23 32 possible 

8 5
1 5 4 3 2 4 5 2

25

15 14 13 12 14 15 12 7
54 53 52 54 52 5
43 42 45 42 4
32 34 35 32 4 
24 25 2
45 42 2
52 1
7 5 4 4 2 2 1 25

규칙성은..
해당 숫자와 같은 숫자인지를 확인한다. 같은숫자라면 넘겨버리고 그 다음 숫자를 확인해버린다. 배열이 끝날떄까지 반복한다.

"""

for i in range(len(arr)):
    for j in range(i+1,len(arr)):
        if(arr[i] == arr[j]):
            continue
        else:
            result+=1

print(result)

""" 이건 쉽지 않은걸..
n,m input
array => data input

array = [0] *11

for x in data:
    array[x] +=1
    => 각 무게에 해당하는 볼링공의 갯수 카운트
    
    각 무게에 대하여 처리 시작
for i in range(1,n+1):
    n -= array[i]
    result += array[i] * n

print(result)
    

"""