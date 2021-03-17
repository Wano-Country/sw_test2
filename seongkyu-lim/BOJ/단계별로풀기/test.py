n = int(input())


for i in range(n):
    data = input()
    stack = []
    cnt = 0
    for j in range(len(data)):
        if data[j] == "(":
            stack.append("(")
            cnt += 1
        else:
            cnt -= 1
            if cnt == -1:
                print("NO")
                break
            stack.pop()

        if len(data) - 1 == j:
            if len(stack) == 0:
                print("YES")
            else:
                print("NO")

for j in range(1, n+1):
    if not visited[j]:
        dfs(j)
        cnt += 1
