def solution(n):
    answer = 0

    a = 2
    while a <= n:

        answer+= a
        a+=2

    print(answer)
    return answer

solution(4)

"""
짝수를 더해야함.
양의정수중 짝수 가장 작은 2부터 n될때까지 2를 계속 더해서 그 값을 반환하면 된다. 그걸 반복문으로 작성하면됨.

"""
