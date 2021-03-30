N = int(input())
inputs = [list(map(int, input().split())) for _ in range(N)]
inputs = sorted(sorted(inputs, key=lambda x: x[0]), key=lambda x: x[1])
[print(*input) for input in inputs]
