N = int(input())
from sys import stdin

words = sorted(set([stdin.readline().strip() for _ in range(N)]))
print(*sorted(words, key=lambda x: len(x)), sep='\n')
