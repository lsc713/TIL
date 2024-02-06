def solution(n, lost, reserve):

    #여벌이 있으면서 도난당한 경우
    for r in reserve[:]:
        if r in lost:
            reserve.remove(r)
            lost.remove(r)

    #여벌이 있고 빌려줬다면 lost에서 제거
    for r in reserve[:]:
        if r-1 in lost:
            lost.remove(r-1)
        elif r+1 in lost:
            lost.remove(r+1)

    return n-len(lost)

"""
def solution(n, lost, reserve):
    set_lost = set(lost) - set(reserve)
    set_reserve = set(reserve) - set(lost)
    for i in set_reserve:
        if i-1 in set_lost:
            set_lost.remove(i-1)
        elif i+1 in set_lost:
            set_lost.remove(i+1)    
    return n - len(set_lost)

# 다른사람 풀이
def solution(n, lost, reserve):
    _reserve = [r for r in reserve if r not in lost]
    _lost = [l for l in lost if l not in reserve]
    for r in _reserve:
        f = r - 1
        b = r + 1
        if f in _lost:
            _lost.remove(f)
        elif b in _lost:
            _lost.remove(b)
    return n - len(_lost)

"""

# 그리디는 여러번