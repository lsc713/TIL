# # 자물쇠와 열쇠
#
# # NxN 2차원 리스트 d도 회전
# # 회전 각도 d => 1: 90도, 2: 180도, 3: 270도
# def rotate(array, d):
#     n = len(array)  # 배열의 길이
#     result = [[0] * n for _ in range(n)]
#
#     if d % 4 == 1:
#         for r in range(n):
#             for c in range(n):
#                 result[c][n - r - 1] = array[r][c]
#     elif d % 4 == 2:
#         for r in range(n):
#             for c in range(n):
#                 result[n - r - 1][n - c - 1] = array[r][c]
#     elif d % 4 == 3:
#         for r in range(n):
#             for c in range(n):
#                 result[n - c - 1][r] = array[r][c]
#     else:
#         for r in range(n):
#             for c in range(n):
#                 result[r][c] = array[r][c]
#
#     return result
#
#
# # 자물쇠 중간 NxN 부분이 모두 1인지 확인
# def check(new_lock):
#     n = len(new_lock) // 3
#     for i in range(n, n * 2):
#         for j in range(n, n * 2):
#             if new_lock[i][j] != 1:
#                 return False
#     return True
#
#
# def solution(key, lock):
#     m = len(key)
#     n = len(lock)
#     # 기존 자물쇠보다 3배 큰 자물쇠
#     new_lock = [[0] * (n * 3) for _ in range(n * 3)]
#     # 새로운 자물쇠의 중앙 부분에 기존 자물쇠 넣기
#     for i in range(n):
#         for j in range(n):
#             new_lock[n + i][n + j] = lock[i][j]
#
#     # 열쇠를 (1, 1)부터 (N*2, N*2)까지 이동시키며 확인
#     for i in range(1, n * 2):
#         for j in range(1, n * 2):
#             # 열쇠를 0, 90, 180, 270도로 회전시키며 확인
#             for d in range(4):
#                 r_key = rotate(key, d)  # key를 d만큼 회전시킨 리스트
#                 for x in range(m):
#                     for y in range(m):
#                         new_lock[i + x][j + y] += r_key[x][y]
#
#                 if check(new_lock):
#                     return True
#
#                 for x in range(m):
#                     for y in range(m):
#                         new_lock[i + x][j + y] -= r_key[x][y]
#
#     return False
# 출처: https://mjmjmj98.tistory.com/150 [👾:티스토리]