def solution(num_list):
    answer = []
    oddcount =0
    evencount=0
    for i in num_list:
        if(i%2==0):
            evencount+=1
        else:
            oddcount+=1
    answer.append(evencount)
    answer.append(oddcount)
    return answer

"""
배열안의 짝수와 홀수의 갯수를 반환하는 함수.
반복문으로 배열의 인자하나하나를 2로나눠 나눠떨어지면 짝수카운트변수에 +=1, 나머지  있다면 홀수카운트변수에 +=1
입출력 예시상 짝수가 먼저 인자로 들어가야하므로 append
"""