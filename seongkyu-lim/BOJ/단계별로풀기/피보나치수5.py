num = int(input())


def fibonacci(x):
    if x == 0:
        return 0
    elif x == 1:
        return 1

    return(fibonacci(x-1) + fibonacci(x-2))


print(fibonacci(num))
