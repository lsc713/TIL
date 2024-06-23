import sys

input = sys.stdin.readline


n = int(input())
protein, fat, carbo, vitamin = map(int, input().split())
graph = [list(map(int, input().split())) for _ in range(n)]

answer = 1e9
used = []
answer_used = []
def recur(idx, a, b, c, d, price):
    global answer
    global used
    global answer_used

    if a >= protein and b >= fat and c >= carbo and d >= vitamin:
        if answer > price:

            answer = min(answer, price)
            answer_used = []
            for i in used:
                answer_used.append(i)
    if idx == n:
        return

    used.append(idx + 1)
    recur(idx + 1, a + graph[idx][0], b + graph[idx][1], c + graph[idx][2], d + graph[idx][3], price + graph[idx][4])
    used.pop()
    recur(idx + 1, a, b, c, d, price)
recur(0, 0, 0, 0, 0, 0)


if answer_used:
    print(answer)
    print(*answer_used)
else:
    print(-1)