
import sys


def divide(size, row, col):
    global cnt
    if size == 2:
        if row == r and col == c:
            print(cnt)
            return
        cnt += 1
        if row == r and col + 1 == c:
            print(cnt)
            return
        cnt += 1
        if row + 1 == r and col == c:
            print(cnt)
            return
        cnt += 1
        if row + 1 == r and col + 1 == c:
            print(cnt)
            return
        cnt += 1
    else:
        if r < row + size//2 and c < col + size//2:
            divide(size//2, row, col)
        elif r < row + size//2 and c >= col + size//2:
            cnt += (size//2)**2
            divide(size//2, row, col + size//2)
        elif r >= row + size//2 and c < col + size//2:
            cnt += ((size//2)**2)*2
            divide(size//2, row + size//2, col)
        elif r >= row + size//2 and c >= col + size//2:
            cnt += ((size//2)**2)*3
            divide(size//2, row + size//2, col + size//2)


N, r, c = map(int, sys.stdin.readline().split())

cnt = 0
divide(2**N, 0, 0)  # 시작점은 0, 0

# 다른 예제 틀리게나옴.
