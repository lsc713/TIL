
from itertools import permutations

def solution(numbers):
    answer = 0

    arr=[]
    for num in numbers:
        for n in num:
            arr.append(n)

    nPr = set()

    for i in  range(1,len(arr) + 1):
        temp = list(permutations(arr,i))
        for n in temp:
            nPr.add(int(''.join(n)))

    n = max(nPr)
    primeNums = set(range(2,n+1))

    for i in range(2,n+1):
        if i in primeNums:
            primeNums -= set(range(2*i, n+1,i))

    for t in nPr:
        if t in primeNums:
            answer+=1

    return answer