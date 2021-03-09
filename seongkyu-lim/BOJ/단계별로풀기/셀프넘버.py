
def d(x):
    num = x
    x = str(x)
    for i in range(0, len(x)):
        num += int(x[i])
    return(num)


num_list = [i for i in range(1, 10000)]


for i in num_list:
    a = i
    while(d(a) < 10001):
        if d(a) in num_list:
            num_list.remove(d(a))
        a = d(a)

print(num_list)
