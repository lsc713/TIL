import sys
input = sys.stdin.readline

n=int(input())
arr= list(map(int,input().split()))
LIS =[arr[0]]
def bi(arg):
    l=0
    r=len(LIS)-1
    
    while l<=r:
        mid = (l+r)//2
        if LIS[mid]== arg:
            return mid
        elif LIS[mid] < arg:
            l=mid+1
        else:
            r=mid-1
    return l
for i in range(n):
    if arr[i] > LIS[-1]:
        LIS.append(arr[i])
    else:
        idx = bi(arr[i])
        LIS[idx] = arr[i]
print(len(LIS))
