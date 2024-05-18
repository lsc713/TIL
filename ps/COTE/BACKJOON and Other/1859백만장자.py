
import sys
input=sys.stdin.readline

T=int(input())
for i in range(T):
    n=int(input())
    arr=list(map(int,input().split()))
    sum = 0
    sellPrice = 0
    for val in arr[::-1]:
        if val>=sellPrice:
            sellPrice = val
        else:
            sum+=sellPrice-val
    print("#"+str(i+1)+" "+str(sum))

