
from sys import stdin


n, m = map(int, stdin.readline().split())

'''
for _ in range(n):
    row = stdin.readline()
    mtx.append(row)
'''
mtx = [stdin.readline().rstrip() for _ in range(n)]
'''
strip([chars]) : 인자로 전달된 문자를 String의 왼쪽과 오른쪽에서 제거합니다.
lstrip([chars]) : 인자로 전달된 문자를 String의 왼쪽에서 제거합니다.
rstrip([chars]) : 인자로 전달된 문자를 String의 오른쪽에서 제거합니다.
'''
visited = [[0]*m for _ in range(n)]

dx, dy = [-1, 1, 0, 0], [0, 0, -1, 1]

queue = [(0, 0)]
visited[0][0] = 1


while queue:
    x, y = queue.pop(0)

    if x == n-1 and y == m-1:
        print(visited[x][y])
        break

    for i in range(4):
        if 0 <= x+dx[i] < n and 0 <= y+dy[i] < m:
            if mtx[x+dx[i]][y+dy[i]] == '1' and visited[x+dx[i]][y+dy[i]] == 0:
                queue.append((x+dx[i], y+dy[i]))
                visited[x+dx[i]][y+dy[i]] += visited[x][y] + 1

# point : 어느 한 지점에서 방문하는 주변의 가능한 경로의 visited의 값을 다 같은 값으로 만들어준다.
# 그래프 탐색
# 최단경로
# bfs
