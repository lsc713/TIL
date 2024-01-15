
# 소수인지 판별할것.
#
# 소수인지 판별은 어떻게할까? 만약 A라는 수에 대한 소수가 있나를 판별한다면 실질적으로 A**0.5에 대해서만 알아보면 되고, 0,1은 소수아니니까 알 필요가 없다.0과
#
# n부터 2n까지 소수인지를 판별해서 소수라면 count를 증가시킨다

def prime(n):
    if n < 2:
        return False
    for i in range(2,int(n**0.5)+1):
        if n%i==0:
            return False
    return True

def primecount(start, end):
    count = 0
    for num in range(start,end+1):
        if prime(num):
            count+=1
    return count

while True:
    n = int(input())
    if(n == 0):
        break
    print(primecount(n+1,2*n))