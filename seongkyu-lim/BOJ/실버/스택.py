from sys import stdin

num = int(stdin.readline())


def stack(box, command, number):
    if command == 'push':
        box.append(number)
        return box
    elif command == 'size':
        print(len(box))
    elif command == 'pop':
        if len(box) != 0:
            print(box[len(box)-1])
            box.pop()
        else:
            print(-1)
        return box
    elif command == 'empty':
        if len(box) == 0:
            print(1)
        else:
            print(0)
    elif command == 'top':
        if len(box) == 0:
            print(-1)
        else:
            print(box[len(box)-1])


box = []
for i in range(num):
    input = stdin.readline()
    input = input.split()
    command = input[0]
    if len(input) > 1:
        number = int(input[1])
    else:
        number = 0
    if command == 'push' or command == 'pop':
        box = stack(box, command, number)
    else:
        stack(box, command, number)

# list 이용해서 stack 구현.
