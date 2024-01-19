def solution(numbers):
    answer = 0
    for i in numbers:
        answer+=i
    answer= answer/len(numbers)
    return answer

"""
배열들인자하나하나를 다 더함.
다 더한걸 배열의 길이로 나눠주면 평균값이 반환됨.

"""