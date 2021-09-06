
from sys import stdin

n = int(stdin.readline())
mtx = []
for _ in range(n):
    row = stdin.readline().split()
    mtx.append(row)

answer = [0, 0, 0]


def divide(length, x, y):
    global mtx
    global answer
    breaker = False
    if length == 1:

        if mtx[x][y] == '-1':
            answer[0] += 1
        if mtx[x][y] == '0':
            answer[1] += 1
        if mtx[x][y] == '1':
            answer[2] += 1
        return
    cnt = 0
    for i in range(x, x+length):
        for j in range(y, y+length):
            if mtx[i][j] != mtx[x][y]:
                breaker = True
                divide(length//3, x, y)
                divide(length//3, x+length//3, y)
                divide(length//3, x+(length//3)*2, y)
                divide(length//3, x, y+length//3)
                divide(length//3, x+length//3, y+length//3)
                divide(length//3, x+(length//3)*2, y+length//3)
                divide(length//3, x, y+(length//3)*2)
                divide(length//3, x+length//3, y+(length//3)*2)
                divide(length//3, x+(length//3)*2, y+(length//3)*2)
                break
            else:
                cnt += 1
        if breaker:
            break
    if cnt == length**2:
        if mtx[x][y] == '-1':
            answer[0] += 1
        if mtx[x][y] == '0':
            answer[1] += 1
        if mtx[x][y] == '1':
            answer[2] += 1


divide(len(mtx), 0, 0)
for i in range(0, len(answer)):
    print(answer[i])

# dinamic programming : top-down
