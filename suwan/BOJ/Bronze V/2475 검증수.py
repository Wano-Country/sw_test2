from sys import stdin

l1 = map(int, stdin.readline().split())

print(sum([l * l for l in l1]) % 10)
