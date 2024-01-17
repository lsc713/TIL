def solution(dot):

    answer = 0
    if(dot[0]>0 and dot[1]>0):
        return 1
    elif(dot[0]>0 and dot[1]<0):
        return 4
    elif(dot[0]<0 and dot[1]<0):
        return 3
    else:
        return 2


    return answer

"""
4분면은 양수와 음수에 따라 달라지므로 각 인자들이 양수인지 음수인지 확인 후 값 리턴

"""