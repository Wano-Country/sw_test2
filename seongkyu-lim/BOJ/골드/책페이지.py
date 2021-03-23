'''
n = input()

num_list = [0]*10


def cal(x):
    n_length = len(x)
    result = 0
    cnt = 1
    for i in range(1, n_length+1):
        if n_length-i-1 > 0:
            for _ in range(n_length-i-1):
                cnt*10
        if n_length - i > 0:
            cnt *= int(n[0])
        result += cnt
        cnt = 1
    return result


if int(n) < 10:
    for i in range(1, int(n)+1):
        num_list[i] += 1
else:
    for i in range(0, 10):
        num_list[i] = cal(n)
print(num_list)
'''

# 브루트 포스 / 재귀 호출 / 탐색
# 모방 코딩 출처 : https://it-garden.tistory.com/262

import sys

n = int(sys.stdin.readline().strip())
a = [0]*10
b = 1
while n != 0:
    while n % 10 != 9:
        for i in str(n):
            a[int(i)] += b
        n -= 1
    # 한자리수가 줄어들 때까지 페이지의 값 추가.

    if n < 10:
        for k in range(n+1):
            a[k] += b
        a[0] -= b
        break
    # 10보다 작을 때, 페이지 값 추가.
    else:
        for i in range(10):
            a[i] += (n/10 + 1)*b
        a[0] -= b
        b *= 10
        n //= 10

for i in range(0, len(a)-1):
    print(a[i], end=' ')

print(a[len(a)-1])
