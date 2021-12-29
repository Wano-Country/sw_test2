

from sys import stdin


n = int(stdin.readline())
mtx = [list(stdin.readline().rstrip()) for _ in range(n)]
visited = [[0]*n for _ in range(n)]

dx, dy = [-1, 1, 0, 0], [0, 0, -1, 1]

stack = []
visited[0][0] = 1
cnt = 0
cnt_all = []

while True:
    cnt2 = 0
    breaker = False

    for i in range(n):
        for j in range(n):
            if mtx[i][j] == '1':
                stack.append((i, j))
                breaker = True
                break
        if breaker:
            break
    # print(stack)

    if len(stack) == 0:
        break

    while stack:
        x, y = stack.pop()
        mtx[x][y] = '2'
        cnt2 += 1

        for i in range(4):
            if 0 <= x+dx[i] < n and 0 <= y+dy[i] < n:
                if mtx[x+dx[i]][y+dy[i]] == '1' and visited[x+dx[i]][y+dy[i]] == 0:
                    stack.append((x+dx[i], y+dy[i]))
                    visited[x+dx[i]][y+dy[i]] += visited[x][y] + 1

    cnt += 1
    cnt_all.append(cnt2)


print(cnt)
cnt_all.sort()
for val in cnt_all:
    print(val)
