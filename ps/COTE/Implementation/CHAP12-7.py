n=list(map(int,input()))

result = 0 ;

for i in range(len(n)//2):
    result += n[i]
for i in range(len(n)//2,len(n)):
    result -= n[i]


if(result ==0):
    print('LUCKY')
else:
    print('READY')

"""
n을 반갈라서 똑같으면 럭키 아님 레디.
n은 반가르면 정수만된다하니 앞이랑, 뒤랑 반복문으로 한쪽은 더하고 한쪽은 빼서 0이되면 럭키가 나오고 아니면 레디가나온다.
"""
