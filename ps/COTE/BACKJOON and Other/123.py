def generate_strings(n):
    results = []
    for i in range(n):
        for j in range(i+1, n):
            s = ['a'] * n
            s[i] = 'b'
            s[j] = 'b'
            results.append(''.join(s))
    results.sort()
    return results

# n=10, k=24에 대해 문자열 생성 및 확인
strings = generate_strings(10)
target_string = strings[23]  # 0-based index, so 24th element is at index 23
second_b_index = target_string.find('b', target_string.find('b') + 1) + 1  # +1 for 1-based index

print("24번째 문자열:", target_string)
print("두 번째 'b'의 위치:", second_b_index)

