def solution(hp):
    answer = 0

    while(True):
        if hp==0:
            return answer
            break
        if(hp//5>=0):
            answer += (hp//5)
            hp = hp%5
        if(hp//3>=0):
            answer += (hp//3)
            hp = hp%3
        if hp<=2:
            if(hp==0):
                return answer
                break
            else:
                hp -=1
                answer+=1


"""
return hp//5 + (h%5)//3 + ((h%5)%3)

"""