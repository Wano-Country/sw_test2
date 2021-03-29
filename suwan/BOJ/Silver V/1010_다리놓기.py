from math import comb


def cal(a, b):
    result = 0
    for i in range(1, b - a + 1):
        result += comb(a - 1 + i, i)
    print(result + 1)


N = int(input())

for _ in range(N):
    a, b = map(int, input().split())
    cal(a, b)
