import sys
sys.setrecursionlimit(10000)
# 파이썬은 재귀제한이 걸려있어 재귀 허용치가 넘어가면 런타임 에러 일으킴.


def dfs(v):
    visited[v] = True
    for i in adj[v]:
        if not visited[i]:
            dfs(i)


n, m = map(int, sys.stdin.readline().split())

adj = [[] for _ in range(n+1)]  # 변수를 사용하지않을때 _를 사용하는 듯.
visited = [False] * (n + 1)  # 곱셈으로 값을 복제할 수 있다.
cnt = 0

for _ in range(int(m)):
    u, v = map(int, sys.stdin.readline().split())
    adj[u].append(v)
    adj[v].append(u)

for j in range(1, n+1):
    if not visited[j]:
        dfs(j)
        cnt += 1

print(cnt)

# dfs와 인접리스트 사용.
# dfs 와 인접리스트 익히기위해 모방 풀이를 하였음.
