
num = input()


def checking(x):
    if int(x) <= 99:
        return 1
    else:
        if (int(x[1]) - int(x[0])) == (int(x[2]) - int(x[1])):
            return 1
        else:
            return 0


solution = 99
if int(num) <= 99:
    print(num)
else:
    for i in range(100, int(num)+1):
        solution += checking(str(i))
    print(solution)
