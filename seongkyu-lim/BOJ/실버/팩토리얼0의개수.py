
from sys import stdin

n = int(stdin.readline())

cnt = 1

for i in range(1, n+1):
    cnt *= i

answer = 0

for i in range(len(str(cnt))-1, -1, -1):
    if str(cnt)[i] == '0':
        answer += 1
    else:
        break

print(answer)
