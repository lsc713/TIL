def solution(brown, yellow):

    block = brown + yellow

    width =2
    height =1
    while True:
        height = block//width
        remain = block%width

        if remain ==0 and yellow == (width-2) * (height-2) and width >= height:
            print([width,height])
            return [width,height]
        else:
            width+=1

solution(10,2)

