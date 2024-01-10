n = input()
arr=[]
val = 0

#문자열이 문자인지 숫자인지확인하는 함수 .isalpha
#배열을 나열하여 반환하는 함수 .join

for i in n:
    if i.isalpha():
        arr.append(i)
    else:
        val+=int(i)

arr.sort()

if val !=0:
    arr.append(str(val))

print(''.join(arr))


