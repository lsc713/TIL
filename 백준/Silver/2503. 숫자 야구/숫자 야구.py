import sys
input = sys.stdin.readline

n=int(input())
guesses=[list(map(int,input().split())) for _ in range(n)]

def is_valid(num,guess,strikes,balls):
    num=str(num)
    guess = str(guess)
    strike_count = sum([num[i]==guess[i] for i in range(3)])
    ball_count = len(set(num) & set(guess)) - strike_count
    return strike_count == strikes and ball_count == balls

valid_numbers=[]


for num in range(123,988):
    num_str=str(num)
    if len(set(num_str)) != 3 or '0' in num_str:
        continue
    if all(is_valid(num,guess[0],guess[1],guess[2]) for guess in guesses):
        valid_numbers.append(num)

print(len(valid_numbers))
