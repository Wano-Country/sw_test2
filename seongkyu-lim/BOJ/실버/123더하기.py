from sys import stdin

n = int(stdin.readline())


def add1(num):
    global cnt
    if num == 0:
        cnt += 1

    elif num > 0:
        add1(num-1)
        add1(num-2)
        add1(num-3)
    return cnt


for _ in range(n):
    cnt = 0
    input = int(stdin.readline())
    print(add1(input))

# 재귀, top to bottom
