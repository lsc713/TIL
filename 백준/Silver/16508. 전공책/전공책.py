import sys
from collections import Counter
input = sys.stdin.readline
def check(string):
  for t in T:
    if t in string and string[t] != 0:
      string[t]-=1
    else:
      return False
  return True
T=input().rstrip()
n=int(input())
prices = []
for i in range(n):
  c,w=map(str,input().split())
  prices.append([int(c),Counter(w)])
result = float(1e9)

for i in range(1<<n):
  price = 0
  alpha = Counter()
  for j in range(n):
    if (i&1<<j):
      price+=prices[j][0]
      alpha+=prices[j][1]
  if check(alpha):
    result = min(result,price)
print(result if not result == float(1e9) else -1)

