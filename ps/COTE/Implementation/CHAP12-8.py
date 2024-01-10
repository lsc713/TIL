n = input()
arr=[]
val = 0

for i in n:
    if i.isalpha():
        arr.append(i)
    else:
        val+=int(i)

arr.sort()

if val !=0:
    arr.append(str(val))

print(''.join(arr))


