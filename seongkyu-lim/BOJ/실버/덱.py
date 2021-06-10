from sys import stdin

num = int(stdin.readline())


def deque(box, command, number):
    if command == 'push_back':
        box.append(number)
        return box
    elif command == 'push_front':
        box.insert(0, number)
        return box
    elif command == 'pop_front':
        if len(box) != 0:
            print(box[0])
            del box[0]
        else:
            print(-1)
        return box
    elif command == 'pop_back':
        if len(box) != 0:
            print(box[len(box)-1])
            box.pop()
        else:
            print(-1)
        return box
    elif command == 'size':
        print(len(box))
    elif command == 'empty':
        if len(box) == 0:
            print(1)
        else:
            print(0)
    elif command == 'back':
        if len(box) != 0:
            print(box[len(box)-1])
        else:
            print(-1)
    elif command == 'front':
        if len(box) != 0:
            print(box[0])
        else:
            print(-1)


box = []
for _ in range(num):
    input = stdin.readline()
    input = input.split()
    if len(input) > 1:
        command = input[0]
        number = int(input[1])
    else:
        command = input[0]
        number = 0

    if command == 'push_back' or command == 'push_front' or command == 'pop_back' or command == 'pop_front':
        box = deque(box, command, number)
    else:
        deque(box, command, number)
