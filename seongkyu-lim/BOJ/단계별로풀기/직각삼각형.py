a = []
b = []
c = []

while True:
    num = input()
    num_list = num.split()
    for i in range(0, len(num_list)):
        num_list[i] = int(num_list[i])
    num_list.sort()
    if int(num_list[0]) == 0:
        break
    a.append(int(num_list[0]))
    b.append(int(num_list[1]))
    c.append(int(num_list[2]))

for i in range(0, len(a)):
    if (a[i])**2 + (b[i])**2 == (c[i])**2:
        print('right')
    else:
        print('wrong')
