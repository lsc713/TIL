import sys
input =sys.stdin.readline


def function1(word):
    for i in range(len(word)-1,0,-1):
        if word[i-1]<word[i]:
            for j in range(len(word)-1,i-1,-1):
                if word[i-1]<word[j]:
                    word[i-1],word[j] = word[j],word[i-1]
                    return (word[:i]+(word[i:][::-1]))
    return word                

n=int(input())
for _ in range(n):
    arr = list(input().strip())
    result = ''.join(function1(arr))
    print(result)