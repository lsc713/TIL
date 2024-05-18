n = int(input())
arr = list(map(int, input().split()))
answer = n
for i in arr:
    if i == 1: answer -= 1
    for j in range(2,i):
        if ((i % j) == 0):
            answer-=1
            break
print(answer)
