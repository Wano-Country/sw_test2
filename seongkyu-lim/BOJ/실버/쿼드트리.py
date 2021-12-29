
from sys import stdin

n = int(stdin.readline())

mtx = []
for _ in range(n):
    row = stdin.readline()
    mtx.append(row)

answer = ''


def divide(length, x, y):
    global answer
    global mtx
    breaker = False
    for i in range(x, x+length):
        for j in range(y, y+length):

            if mtx[i][j] != mtx[x][y]:
                breaker = True
                if length//2 != 1:
                    answer += '('
                    divide(length//2, x, y)
                    divide(length//2, x, y+length//2)
                    divide(length//2, x+length//2, y)
                    divide(length//2, x+length//2, y+length//2)
                    answer = answer + ')'
                else:
                    answer += '(' + str(mtx[x][y]) + str(mtx[x][y+1]) + \
                        str(mtx[x+1][y]) + str(mtx[x+1][y+1])+')'
                break
        if breaker:
            break
    if not breaker:
        if mtx[x][y] == '1':
            answer += '1'
        else:
            answer += '0'


divide(len(mtx), 0, 0)

print(answer)

# 분할정복
# top-down
# 재귀
