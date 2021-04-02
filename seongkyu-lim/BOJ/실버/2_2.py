#나이순 정렬

num = int(input())

member = {}

for i in range(num):
    age, name = input().split()
    
    if int(age) in member:
        member[int(age)] += ' '
        member[int(age)] += name
    else:
        member[int(age)] = name

ages = list(member.keys())
ages.sort()

for key in ages :
    list1 = member[key].split()
    for val in list1 :
        print(key,end="")
        print(' ',end='')
        print(val)