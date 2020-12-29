L, X, Y = map(int, input().split())

K = (X ** 2 + Y ** 2) ** (1 / 2)

print(int(L / K * X), end=' ')

print(int(L / K * Y))
