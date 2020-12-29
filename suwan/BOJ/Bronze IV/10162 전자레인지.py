# A 300초,  B 60초,  C 10초

T = int(input())

A, B = divmod(T, 300)
B, C = divmod(B, 60)
if C % 10:
    print(-1)
else:
    print(A, B, C//10)