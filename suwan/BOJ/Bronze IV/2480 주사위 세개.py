from collections import Counter

l1 = map(int, input().split())

count = Counter(l1)
max = 0
prize = 0
for (v, i) in count.items():
    if i == 3:
        prize = (10000 + v * 1000)
    elif i == 2:
        prize = (1000 + v * 100)
        break
    else:
        if max < v:
            max = v
        prize = max * 100
print(prize)
