def solution(n, lost, reserve):
    answer = 0
    lost.sort()#입출력예제를 볼때 정렬을해서 확인하는게 좋을듯? <-- 생각은했는데 어떤 흐름으로 이렇게되는지 알면좋을듯
    reserve.sort()

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