A, B, C, D, P = [int(input()) for _ in range(5)]

A_pay = A * P
if P > C:
    B_pay = B + (P - C) * D
else:
    B_pay = B

print(min(A_pay, B_pay))
