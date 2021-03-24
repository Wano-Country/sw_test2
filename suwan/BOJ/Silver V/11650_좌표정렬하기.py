from sys import stdin

N = int(input())
spots = [list(map(int, stdin.readline().split())) for _ in range(N)]
spots = sorted(sorted(spots, key=lambda x: x[1]), key=lambda x: x[0])
[print(*spot) for spot in spots]
