import sys
input = sys.stdin.readline
n=int(input())
arr=list(input())
arr.pop()
l=0
r=0
letters=[]
letters.append(arr[l])
dist = 0
start_flag=-1
while l<len(arr) and r<len(arr):
    dist = max(dist,r-l+1)
    if len(letters) <= n:
        r+=1
        if r< len(arr) and arr[r] not in letters:
            letters.append(arr[r])
        if len(letters) > n:
            l+=1
            r=l
            letters = [arr[l]]
print(dist)            