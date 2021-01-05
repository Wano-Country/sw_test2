hap, sub = map(int, input().split())
if hap - sub < 0 or (hap - sub) % 2 != 0:
    print(-1)
else:
    a = (hap + sub) // 2
    b = (hap - sub) // 2
    print(a, b)
