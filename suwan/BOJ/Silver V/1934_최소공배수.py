from math import gcd

N = int(input())
for _ in range(N):
    a, b = map(int, input().split())
    gcd_v = gcd(a, b)
    print(a * b // gcd_v)
