from math import factorial
N = int(input())

print(factorial(N-1) // factorial(N-4) // 6)