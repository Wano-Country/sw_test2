scores = [int(input()) for _ in range(5)]
scores = [40 if s < 40 else s for s in scores]
print(sum(scores) // 5)
