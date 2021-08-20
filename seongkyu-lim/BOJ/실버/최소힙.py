# 힙에는 크게 최소 힙, 최대 힙이 존재.
# 특징 : 완전 이진 트리 . 최소 힙은 루트가 가장 작은 값, 최대 힙은 루트가 가장 큰 값.
# 최소값과 최대값을 빠르게 찾기위해 고안되었다.

import heapq
from sys import stdin

n = int(stdin.readline())

heap = []
for _ in range(n):
    input = int(stdin.readline())
    if input != 0:
        heapq.heappush(heap, input)
    else:
        if len(heap) == 0:
            print(0)
        else:
            result = heapq.heappop(heap)
            print(result)
