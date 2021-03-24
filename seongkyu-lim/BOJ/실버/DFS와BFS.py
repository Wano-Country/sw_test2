
def bfs(start):
    visited = [start]
    queue = [start]
    while queue:
        n = queue.pop(0)
        for c in range(len(matrix[start])):
            if matrix[n][c] == 1 and (c not in visited):
                visited.append(c)
                queue.append(c)
    return visited


def dfs(start, visited):
    visited += [start]
    for c in range(len(matrix[start])):
        if matrix[start][c] == 1 and (c not in visited):
            dfs(c, visited)
    return visited


N, M, V = map(int, input().split())

matrix = [[0] * (N + 1) for _ in range(N + 1)]
# 그래프에서는 정점의 개수로 이차원 배열 생성

for _ in range(M):
    line = list(map(int, input().split()))
    matrix[line[0]][line[1]] = 1
    matrix[line[1]][line[0]] = 1

print(*dfs(V, []))
print(*bfs(V))


# 모방코딩 // 출처 : https://chancoding.tistory.com/59
