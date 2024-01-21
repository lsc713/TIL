def solution(array):
    answer = 0
    array.sort()
    element = len(array)//2
    answer = array[element]
    return answer

solution([9,-1,0])

"""

배열의 중앙값을 구하려면

배열 정렬,
배열의 길이 중 반을 딱 자르면 중앙값이 나와버림 ㅇㅇ
여기서 배열에 대한 정렬은 sort()를 활용해야함

sorted 와 sort의 차이는 내장함수냐 리스트의 메서드냐의 차이
sort()로 변수 새로만들어도 값 안나옴
"""