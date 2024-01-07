n = input() #문자열 입력받음

result = 0

for i in range(len(n)): #입력 갯수값 만큼 실행
    num = int(n[i]) #문자열의 숫자화
    if(num <=1 or result <=1): #0 또는 1은 더해야 최댓값 도출됨.
        result+=num
    else:
        result *=num

print(result)