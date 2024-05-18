import sys
input = sys.stdin.readline
n,m=map(int,input().split())
sum=0
arr=[list(map(int,input().rstrip())) for _ in range(n)]

def bitmask():
    global sum
    for i in range(1 << n*m):
        total = 0 
        for row in range(n):
            rowsum = 0 
            for col in range(m):
                idx = row * m + col
                if i & (1 << idx) != 0:
                    rowsum = rowsum * 10 + arr[row][col]
                else:
                    total += rowsum
                    rowsum = 0
            total += rowsum
        for col in range(m):
            colsum = 0
            for row in range(n):
                idx = row * m + col
                if i & (1 << idx) == 0:
                    colsum = colsum * 10 + arr[row][col]
                else:
                    total += colsum
                    colsum = 0
            total += colsum
        sum = max(sum, total)

bitmask()
print(sum)