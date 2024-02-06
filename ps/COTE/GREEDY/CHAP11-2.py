n = input() #문자열 입력받음

result = 0

for i in range(len(n)): #입력 갯수값 만큼 실행
    num = int(n[i]) #문자열 반복에 대해 한 문자마다 숫자화
    if(num <=1 or result <=1): #0 또는 1은 더해야 최댓값 도출시 도움이됨.
        result+=num
    else:
        result *=num

print(result)

"""
S = list(map(int,sorted(list(input()))))

res = prev = S[0]
for i in S[1:]:
    if prev <= 1:
        res += i
    else:
        res *= i
    prev = i

print(res)
"""