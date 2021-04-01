
from collections import deque
import sys

num_list = deque()

n = int(sys.stdin.readline())

for i in range(n):
    m = int(sys.stdin.readline())
    num_list.append(m)


num_list = list(num_list)
num_list.sort()

for val in num_list:
    print(val)