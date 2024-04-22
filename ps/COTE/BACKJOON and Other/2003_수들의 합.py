n, m = map(int, input().split())

arr = list(map(int, input().split()))

count = 0
left, right = 0, 0
current_sum = 0
while (right < n):
    current_sum += arr[right]

    while current_sum > m and left <= right:
        current_sum -= arr[left]
        left += 1

    if current_sum == m:
        count += 1
    right += 1
print(count)