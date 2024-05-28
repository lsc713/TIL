cnt = 0
def solution(numbers, target):
    global cnt
    solve(numbers, target, 0, 0)
    return cnt

def solve(numbers, target, index, sum):
    global cnt
    if index == len(numbers):
        if sum == target:
            cnt+=1
            return
        else:
            return
        
    solve(numbers, target, index+1, sum + numbers[index])
    solve(numbers, target, index+1, sum - numbers[index])