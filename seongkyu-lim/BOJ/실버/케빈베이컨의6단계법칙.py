
from sys import stdin
from collections import deque


def bfs(v):
    cnt = 0
    q = deque([[v, cnt]])
    while q:
        val = q.popleft()
        v = val[0]
        cnt = val[1]
        if not visited[v]:
            visited[v] = True
            cntList[v] += cnt
            cnt += 1
            for e in adj[v]:
                q.append([e, cnt])


n, m = map(int, stdin.readline().split())
adj = [[] for _ in range(n + 1)]
cntList = [0 for _ in range(n+1)]

for _ in range(m):
    a, b = map(int, stdin.readline().split())
    adj[a].append(b)
    adj[b].append(a)

for i in range(1, n + 1):
    visited = [False for _ in range(n+1)]
    bfs(i)
print(cntList.index(min(cntList[1:])))

# BFS

'''
그래프 구현.
모든 인원(n)에 대하여 케빈베이컨 수를 구한다. (최단경로 ? -> 자기 자신을 제외한 모든 정점을 탐색하는데 거치는 횟수를 합하면 된다.)
가장 작은 값을 가진 사람을 찾는다.

'''
