
from sys import stdin

n = int(stdin.readline())

cnt = 0
while n != 1:
    if n % 3 == 0:
        n /= 3
        cnt += 1
    elif (n-1) % 3 == 0:
        n -= 1
        cnt += 1
    elif n % 2 == 0:
        n /= 2
        cnt += 1
    else:
        n -= 1
        cnt += 1
print(cnt)
