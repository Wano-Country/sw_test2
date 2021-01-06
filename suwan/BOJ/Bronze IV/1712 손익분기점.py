from sys import stdin

A, B, C = map(int, stdin.readline().split())

if B >= C:
    print(-1)
else:
    i = A / (C - B)
    print(int(i) + 1)
