from sys import stdin

default = [1, 1, 2, 2, 2, 8]

find = list(map(int, stdin.readline().split()))

print(*[d - f for (d, f) in zip(default, find)])
