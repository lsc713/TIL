n = int(input())

arr = list(map(int,input().split()))

"""
4
3 3 1 1 인경우
공포도 높은순으로 조를 짜면 1조밖에 못가지만,
낮은수로 보면 2조가 갈 수 있다. 낮은순 정렬
"""

arr.sort()

count = 0 # 조 인원 카운트
result = 0 # 결과 값

for i in arr: # 배열에 대한 반복문 실행
    count+=1
    if count >= i: #공포도와 같은 수치의 인원 수라면 모험 보내버림.
        result +=1
        count=0


print(result)