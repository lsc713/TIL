import sys

input = sys.stdin.readline
n = int(input())
words = [(input()) for i in range(n)]


words.sort(key=len)
count = 0
for i in range(n):
    nTrue = False
    for j in range(i+1,n):
        if words[i] == words[j][0:len(words[i])]:
            nTrue=True
            break
    if not nTrue:
        count+=1

print(count)