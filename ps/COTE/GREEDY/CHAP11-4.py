n = int(input())

m = list(map(int,input().split()))

m.sort() #           입력값  1 1 2 3 9
minimum_number = 1 # 반복문이 한 번 실행되면 2 3 5 8
#시작값은  만들 수 없는 양의정수 최솟값 1로 시작

for i in m:
    if(i > minimum_number):
        break
    else:
        minimum_number += i

        # number 보다 i 값이 커지면 해당 숫자는 만들 수 없는것으로 보여진다.
        """
        자세한 이야기는 
        예제와 같이
        minnum < 현재 확인 값 인경우를 제외한다면 숫자를 만들 수 있다
        
        minnum = i  == 10 이라면
        (10~ 19까지 숫자 생성가능.)
        i~ i+minnum-1값 까지 생성 가능. 통과
        
        minnum > i 10,8
        1~9까지 가능 i=8이니 
        8~17까지 숫자 생성가능. 통과
        
        
        
        """
print(minimum_number)



