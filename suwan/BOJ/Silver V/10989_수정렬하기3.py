from sys import stdin

N = int(input())
boxes = [0] * 10001
for _ in range(N):
    num = int(stdin.readline())
    boxes[num] += 1

for i, box in enumerate(boxes):
    if box:
        [print(i) for _ in range(box)]
