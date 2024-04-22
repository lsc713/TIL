import sys
input = sys.stdin.readline

for test in range(1,11):
    n=int(input())
    count = 0

    arr=list(map(int,input().split()))
    for i in range(2,n-2):
        le=max(arr[i-1],arr[i-2])
        ri=max(arr[i+1],arr[i+2])
        good=max(le,ri)
        if(arr[i]>good):
            count+=(arr[i]-good)
    print(f"#{test} {count}")