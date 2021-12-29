import sys

N = int(input())
nums = sorted([int(sys.stdin.readline()) for _ in range(N)])

print(*nums, sep='\n')
