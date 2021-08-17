
from sys import stdin

n = stdin.readline().split('-')
min = 0
for i in n[0].split('+'):
    min += int(i)
for i in n[1:]:
    for j in i.split('+'):
        min -= int(j)
print(min)

# 그리디 알고리즘

'''
음수 값으로 계산 시 음수를 또 만들면 최대로 작게 만들 수 있다.

숫자를 파악하고 (음수, 양수)
'''
