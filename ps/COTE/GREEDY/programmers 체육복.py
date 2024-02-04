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
