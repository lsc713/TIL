import random

def generate_lotto_numbers():
    # 1부터 45까지의 숫자 중에서 6개를 선택하여 리스트로 반환합니다.
    lotto_numbers = random.sample(range(1, 46), 6)
    return sorted(lotto_numbers)

# 로또 번호 생성
numbers = generate_lotto_numbers()
print("추천하는 로또 번호는:", numbers)

from collections import Counter

def count_matching_elements(list1, list2):
    # 리스트의 각 요소를 카운트하여 Counter 객체 생성
    counter1 = Counter(list1)
    counter2 = Counter(list2)
    
    # 두 Counter 객체의 교집합을 구하고 각 요소의 개수를 더함
    matching_elements = counter1 & counter2
    total_matching_count = sum(matching_elements.values())
    
    return total_matching_count

# 두 리스트를 정의하고 함수에 넣어 같은 요소의 개수를 확인
list_a = [1, 2, 2, 3, 4, 5]
list_b = [2, 3, 3, 4, 4, 5]
result = count_matching_elements(list_a, list_b)
print(f"두 리스트에서 같은 요소의 개수: {result}")