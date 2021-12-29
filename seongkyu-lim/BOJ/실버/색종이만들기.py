from sys import stdin

n = int(stdin.readline())

paper = []

for _ in range(n):
    row = stdin.readline().split()
    paper.append(row)


white = 0
blue = 0


def divide(x, y, n):
    global paper, white, blue
    color = paper[x][y]
    for i in range(x, x+n):
        for j in range(y, y+n):
            if color != paper[i][j]:
                divide(x, y, n//2)
                divide(x, y+(n//2), n//2)
                divide(x+(n//2), y, n//2)
                divide(x+(n//2), y+(n//2), n//2)
                return
    if color == '0':
        white += 1
    elif color == '1':
        blue += 1


divide(0, 0, n)
print(white)
print(blue)

# 분할 정복, 재귀
