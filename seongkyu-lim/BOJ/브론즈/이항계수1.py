from sys import stdin

m, n = map(int, stdin.readline().split())

molecule = 1
i = m
for _ in range(m):
    molecule *= i
    i -= 1

denominator = 1
i = n
for _ in range(n):
    denominator *= i
    i -= 1

i = m-n
for _ in range(m-n):
    denominator *= i
    i -= 1
print(int(molecule/denominator))
