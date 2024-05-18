import sys
input = sys.stdin.readline

n = int(input())
a = list(map(int,input().split()))
b = list(map(int,input().split()))

"""
각 칸에 대해서 점도지수를 돌아가면서 비교해서 가능하면 카운트 ++ 안되면 빠져나와서 다음꺼 확인하기

"""
answer = []
for i in range(n):
  pos = a[i]
  l,r = i+1, n-1
  res = i
  while l<=r:
    mid = (l+r)//2
    if pos < b[mid]:
      r=mid-1
    else:
      l=mid+1
      res = mid
  answer.append(str(res-(i+1)+1))

print(' '.join(answer))