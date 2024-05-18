import sys

input = sys.stdin.readline
n = int(input())
arr = [list(map(str, input().split())) for _ in range(n)]
answer = 0

for i in range(1, 10):
    for j in range(1, 10):
        for k in range(1, 10):

            counter = 0

            if (i == j or j == k or k == i):
                continue
            for ar in arr:
                check = list(ar[0])
                strike = int(ar[1])
                ball = int(ar[2])
                scount = 0
                bcount = 0
                if i == int(check[0]):
                    scount += 1
                if j == int(check[1]):
                    scount += 1
                if k == int(check[2]):
                    scount += 1
                if i != int(check[0]) and (i == int(check[1]) or i == int(check[2])):
                    bcount += 1
                if j != int(check[1]) and (j == int(check[0]) or j == int(check[2])):
                    bcount += 1
                if k != int(check[2]) and (k == int(check[0]) or k == int(check[1])):
                    bcount += 1

                if strike != scount:
                    break
                if ball != bcount:
                    break
                counter += 1
            if counter == n:
                answer += 1
print(answer)

