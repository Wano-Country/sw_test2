L, A, B, C, D = [int(input()) for _ in range(5)]

print(L - max(A // C + (A % C != 0), B // D + (B % D != 0)))
