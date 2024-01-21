def solution(sides):
    sides.sort(reverse=True)
    if(sides[0] < sides[1] + sides[2]):
        return 1
    else:
        return 2
"""
배열 내림차순정렬 후
첫번쨰 인자와 2,3번쨰인자의 합을 비교하여 첫번째인자가 작다면 삼각형이 만들어지므로 1반환
그게 아니라면 2반환

"""