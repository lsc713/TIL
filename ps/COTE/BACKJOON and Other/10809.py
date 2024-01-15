# s = input()
# abc = list('abcdefghijklmnopqrstuvwxyz')
#
# """
# 문자 파싱
# 반복문을 돌립니다.
# 그 알파벳이 있습니까? 있다면 그 순서를 ++합니다. 없다면 -1을 반환합니다.
# """
# for i in abc:
#     if(i in s):
#         print(s.index(i), end = ' ')
#
#     else:
#         print(-1,end=' ')
import string

# import string
#
#
# def get_idx(word):
#     result = [-1]*len(string.ascii_lowercase)
#     for i in range(len(word)):
#         idx = ord(word[i]) -97
#         if result[idx] == -1:
#             result[idx] = i
#     print(' '.join([str(num) for num in result]))
#
#
#
# get_idx('backjoon')


n = input()
n = list(n)
arr = [-1]*26

for i in range(len(n)):
    for j in range(len(arr)):
        if(arr[j]==-1 and n[i] == string.ascii_lowercase[j]):
            arr[j] = i

print(' '.join([str(num) for num in arr]))

"""
배열이 -1 이면서 인풋이 소문자문자열의 값과 같다면
그 배열의 위치의 -1 은 인풋값으로 치환된다.
"""


