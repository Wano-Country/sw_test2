num = int(input())
numbers = input()


def strToInt(x):
    return int(x)


num_list = numbers.split(' ')
num_list = list(map(strToInt, num_list))
num_list.sort()

print(num_list[0], end="")
print(" ", end="")
print(num_list[len(num_list)-1])
