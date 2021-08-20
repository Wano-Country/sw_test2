# 그래프 탐색. DFS 이용.

from sys import stdin


def dfs(graph, start_node):
    global node
    visit = list()
    stack = list()
    stack.append(start_node)
    while stack:
        node1 = stack.pop()
        if node1 not in visit:
            visit.append(node1)
            for i in range(0, node):
                if graph[node1][i] == 1 and node1 != i:
                    stack.append(i)
    return visit


node = int(stdin.readline())
edge = int(stdin.readline())

adj = [[0 for _ in range(node)] for _ in range(node)]

for _ in range(edge):
    node_a, node_b = map(int, stdin.readline().split())
    adj[node_a-1][node_b-1] = 1
    adj[node_b-1][node_a-1] = 1


print(len(dfs(adj, 0))-1)
