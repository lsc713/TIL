def solution(price):

    if(price>=500000):
        return (int)(price*0.8)
    elif(price>=300000):
        return (int)(price*0.9)
    elif(price>=100000):
        return (int)(price*0.95)
    else:
        return int(price)

"""
제한사항을 잘 읽고 풀것.

"""
