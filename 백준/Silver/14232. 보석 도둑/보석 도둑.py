def factorize(n):
    factors = []
    i = 2
    while i * i <= n:
        while n % i == 0:
            factors.append(i)
            n //= i
        i += 1
    if n > 1:
        factors.append(n)
    return factors

def solve(n):
    factors = factorize(n)
    
    print(len(factors))
    print(*factors)

import sys
input = sys.stdin.readline
n = int(input())
solve(n)