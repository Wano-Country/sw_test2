from sys import stdin
from collections import deque


def bfs(n, m, box):
    global queue
    dx = [0, 0, 1, -1]
    dy = [-1, 1, 0, 0]

    days = -1

    while queue:
        days += 1
        for _ in range(len(queue)):
            x, y = queue.popleft()
            for i in range(4):
                nx = x + dx[i]
                ny = y + dy[i]
                if (0 <= nx < m) and (0 <= ny < n) and (box[nx][ny] == 0):

                    box[nx][ny] = box[x][y]+1
                    queue.append([nx, ny])

    for b in box:
        if 0 in b:
            return -1
    return days


n, m = map(int, stdin.readline().split())

box = []
queue = deque()

for i in range(m):
    tomatoes = list(map(int, stdin.readline().split()))
    for j in range(n):
        if tomatoes[j] == 1:
            queue.append([i, j])
    box.append(tomatoes)

print(bfs(n, m, box))
'''
1. 익은 토마토(1)을 찾는다
2. bfs로 탐색하며 주변 토마토를 익게한다.
3. 안익은 토마토가 있는지 체크한다. 
'''

# bfs
