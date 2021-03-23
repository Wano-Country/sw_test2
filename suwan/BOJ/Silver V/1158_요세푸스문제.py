N, K = map(int, input().split())
l1 = list(range(1, N + 1))
index = 0
result = []
for i in range(N):
    index += K - 1
    if len(l1) < index + 1:
        index %= len(l1)
    result.append(l1.pop(index))
print(str(result).replace('[', '<').replace(']', '>'))
