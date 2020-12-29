from sys import stdin
L, P = map(int, stdin.readline().split())
news = map(int, stdin.readline().split())
member = L*P
print(*[new - member for new in news])