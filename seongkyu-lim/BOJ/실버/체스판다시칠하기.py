n, m = map(int, input().split())

board = []
for i in range(n):
    row = input()
    board.append(row)


def cnt_changing_block(x, y):
    cnt1 = 0
    cnt2 = 0
    for i in range(x, x+8):
        for j in range(y, y+8):
            if (i-x) % 2 == 0:
                if (j-y) % 2 == 0:
                    if board[i][j] != 'W':
                        cnt1 += 1
                elif (j-y) % 2 == 1:
                    if board[i][j] != 'B':
                        cnt1 += 1
            elif (i-x) % 2 == 1:
                if (j-y) % 2 == 0:
                    if board[i][j] != 'B':
                        cnt1 += 1
                elif (j-y) % 2 == 1:
                    if board[i][j] != 'W':
                        cnt1 += 1
            if (i-x) % 2 == 0:
                if (j-y) % 2 == 0:
                    if board[i][j] != 'B':
                        cnt2 += 1
                elif (j-y) % 2 == 1:
                    if board[i][j] != 'W':
                        cnt2 += 1
            elif (i-x) % 2 == 1:
                if (j-y) % 2 == 0:
                    if board[i][j] != 'W':
                        cnt2 += 1
                elif (j-y) % 2 == 1:
                    if board[i][j] != 'B':
                        cnt2 += 1
    if cnt1 > cnt2:
        return (cnt2)
    else:
        return (cnt1)


answer = 64
for i in range(0, n-7):
    for j in range(0, m-7):
        if cnt_changing_block(i, j) < answer:
            answer = cnt_changing_block(i, j)
print(answer)
