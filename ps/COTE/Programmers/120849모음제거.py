def solution(my_string):
    arr = ['a','e','i','o','u']
    answer =''
    for i in arr:
        my_string = my_string.replace(i,'')
        answer = my_string
    print(answer)
    return answer

# answer 를 바로 반복문에 집어넣으면 맨 마지막건만 반영됨.
# 그래서 다른 그릇을 준비해서 거기다가 모음들을 하나씩 빼서 집어넣는 과정이 핗요함
