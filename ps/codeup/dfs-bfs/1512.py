from collections import  deque

#입력
n = int(input())
x, y = map(int, input().split())

#위 아래 왼 오
dx = [-1, 1, 0, 0]
dy = [0, 0, -1, 1]

#그래프 초기화
graph = [[0] * n for _ in range(n)]




def bfs(graph,cx,cy):
    queue = deque()
    queue.append((cx-1, cy-1))
    # quque(2,3)
    graph[cx-1][cy-1] += 1
    while queue:
        x, y = queue.popleft()
        for i in range(4):
            nx = x + dx[i]
            ny = y + dy[i]
            # 범위 밖으로 넘어 가면 무시
            if nx > n-1 or nx < 0 or ny > n-1 or ny < 0 :
                continue
            # 이미 방문한 노드면 무시
            if graph[nx][ny] != 0 :
                continue

            # 처음 방문한 노드일 때 만 실행
            if graph[nx][ny] == 0 :
                graph[nx][ny] = graph[x][y] + 1
                queue.append((nx,ny))

    # 출력 형태 맞추기
    for i in range(n) :
        for j in range(n) :
            if j == n-1:
                print(graph[i][j])
            else :
                print(graph[i][j], end=" ")

    # print(graph)
if x > n or y > n :
    print('error!')
else:
    bfs(graph,x,y)