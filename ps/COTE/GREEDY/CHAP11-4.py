n = int(input())

m = list(map(int,input().split()))

m.sort() #           입력값  1 1 2 3 9
de = 1 # 반복문이 한 번 실행되면 2 3 5 8
#시작값은 1로 시작한다. 만들 수 없는 양의정수 최솟값이므로

for i in m:
    if(i > de):
        break
    else:
        de += i

        # de(cimal) 보다 i 값이 커지면 해당 숫자는 만들 수 없는것으로 보여진다. 이런 유형도 있군...
print(de)