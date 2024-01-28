# def fibo(x):
#     if x== 1 or x ==2:
#         return 1
#     return fibo(x-1) + fibo(x-2)
#
#
# print(fibo(4))

#
# d = [0] * 100
#
# def fibo(x):
#     if x==1 or x == 2:
#         return 1
#     if d[x] != 0:
#         return d[x]
#     d[x] = fibo(x-1) + fibo(x-2)
#     return d[x]
#
# print(fibo(99))

"""
memoization , caching  = 이미 결과값계산한적 있음 그거 반환해버리기.

"""
# 호출되는 함수의 순서 확인.

# d = [0] * 100
# def pibo(x):
#     print('f(' + str(x) + ')', end=' ')
#     if x==1 or x==2:
#         return 1
#     if d[x] != 0:
#         return d[x]
#     d[x] = pibo(x-1) + pibo(x-2)
#     return d[x]
#
# print(pibo(6))
"""
-> p6 = p5 + p4 -> p5 = p4 + p3 -> p4 = p3 +p2 -> p3 = p2+p1 
이제 역순으로 계산이 가능해짐
p2 = 1
p1 = 1
*p4
p3 = 2 +p2 = 1  ==> 3
*p5
p4 = 3 + p3 =2 ==>5
*p6
p5 = 5 + p4 = 3 ==>8
그래서 실행순서가 654321234인것.
"""
#피보나치수열 반복으로 호출하기
# d = [0] * 100
#
# d[1] = 1
# d[2] =1
# n = 99
#
# for i in range(3,n+1):
#     d[i] = d[i-1] + d[i-2]
#
# print(d[n])
#

x= int(input())

d = [0] * 30001

for i in range(2,x+1):
    d[i] = d[i-1] +1

    if i%2==0:
        d[i]  =min(d[i],d[i//2]+1)
    if i%3==0:
        d[i]  =min(d[i],d[i//3]+1)
    if i%5==0:
        d[i]  =min(d[i],d[i//5]+1)

print(d[x])

