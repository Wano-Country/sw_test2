N = int(input())

inputs = [input().split() for _ in range(N)]
inputs = sorted(inputs, key=lambda x:int(x[0]))
[print(*input) for input in inputs]

