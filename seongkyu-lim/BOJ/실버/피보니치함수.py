
from sys import stdin

n = int(stdin.readline())

dic1 = {}
dic2 = {}


def fibonacci1(n):
    if n in dic1:
        return dic1[n]
    if n == 0:
        dic1[0] = 0
        return 0
    elif n == 1:
        dic1[1] = 1
        return 1
    else:
        dic1[n] = fibonacci1(n-1) + fibonacci1(n-2)
        return dic1[n]


def fibonacci2(n):
    if n in dic2:
        return dic2[n]
    if n == 0:
        dic2[0] = 1
        return 1
    elif n == 1:
        dic2[1] = 0
        return 0
    else:
        dic2[n] = fibonacci2(n-1) + fibonacci2(n-2)
        return dic2[n]


for _ in range(n):
    num = int(stdin.readline())
    print(fibonacci2(num), end=" ")
    print(fibonacci1(num))


# dynamic programming / memoization 이용.
