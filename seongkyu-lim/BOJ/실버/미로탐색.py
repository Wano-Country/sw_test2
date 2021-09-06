
from sys import stdin


n, m = map(int, stdin.readline().split())

mtx = []
for _ in range(n):
    row = stdin.readline()
    mtx.append(row)


def dfs(mtx, x, y):
    visit = list()
    stack = list()

    stack.append([x, y])

    while stack:
        node = stack.pop()
        if node not in visit:
            if mtx[node[0]][node[1]] == '1':
                visit.append(node)
                stack.extend(mtx[node])  # grph 가 딕셔너리임. -> 맞게 수정하기.
    return visit


dfs(mtx, 0, 0)
# 그래프 탐색
# 최단경로
# dfs
