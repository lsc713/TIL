n = int(input())

arr = list(map(int,input().split()))

arr.sort() #공포도가 낮은 사람부터 그룹에 참여시킨다 (마을에서 놀아도 되니)

count =0 # 인원 수 카운트
group = 0 #결과 그룹 값

for i in arr: # 배열에 대한 반복문 실행
    count+=1
    if count >= i: #공포도와 같은 수치의 인원 수라면 모험 보내버림.
        group +=1
        count=0


print(group)