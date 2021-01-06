N = int(input())
if N % 2:
    print(((N+1) // 2) * ((N+1) // 2 + 1))
else:
    print((N//2+1) ** 2)