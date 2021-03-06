num = int(input())


def factorial(x):
    if x == 1 or x == 0:
        return 1
    return (x*factorial(x-1))


print(factorial(num))
