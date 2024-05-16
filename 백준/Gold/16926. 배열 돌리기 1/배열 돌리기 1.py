import sys
input = sys.stdin.readline
n,m,r = map(int,input().split())
arr = [list(map(int,input().split())) for _ in range(n)]

# for _ in range(r):
#     for i in range(min(n,m)//2):
#         x,y = i,i
#         value = arr[x][y]
#         for j in range(i+1,n-i):
#             x=j
#             tmp = arr[x][y]
#             arr[x][y] = value
#             value = tmp
#         for j in range(i+1,m-i):
#             y=j
#             tmp = arr[x][y]
#             arr[x][y] =value
#             value = tmp
#         for j in range(i+1,n-i):
#             x=n-j-1
#             tmp = arr[x][y]
#             arr[x][y] = value
#             value= tmp
#         for j in range(i+1,m-i):
#             y=n-j-1
#             tmp = arr[x][y]
#             arr[x][y] = value
#             value = tmp
# for i in range(n):
#     for j in range(m):
#         print(arr[i][j],end="")
#     print()
"""시간초과
돌릴 수 있을만큼을 기준을 잡고 각 변마다 돌려기
"""
def rotate_layer(arr, x1, y1, x2, y2, r):
    ele = []
    for y in range(y1, y2):  # 위쪽 변
        ele.append(arr[x1][y])
    for x in range(x1, x2):  # 오른쪽 변
        ele.append(arr[x][y2])
    for y in range(y2, y1, -1):  # 아래쪽 변
        ele.append(arr[x2][y])
    for x in range(x2, x1, -1):  # 왼쪽 변
        ele.append(arr[x][y1])

    r = r % len(ele)
    ele = ele[r:] + ele[:r]
    idx = 0

    for y in range(y1, y2):  # 위쪽 변
        arr[x1][y] = ele[idx]
        idx += 1
    for x in range(x1, x2):  # 오른쪽 변
        arr[x][y2] = ele[idx]
        idx += 1
    for y in range(y2, y1, -1):  # 아래쪽 변
        arr[x2][y] = ele[idx]
        idx += 1
    for x in range(x2, x1, -1):  # 왼쪽 변
        arr[x][y1] = ele[idx]
        idx += 1

# 각 레이어를 회전
for i in range(min(n, m) // 2):
    rotate_layer(arr, i, i, n - i - 1, m - i - 1, r)

# 결과 출력
for row in arr:
    print(" ".join(map(str, row)))