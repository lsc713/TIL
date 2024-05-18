def solution(phone_book):
    answer = True
    phone_book.sort()
    
    for i in range(len(phone_book)-1):
        idx = len(phone_book)
        if phone_book[i] in phone_book[i+1][:idx]:
            answer =False
    return answer