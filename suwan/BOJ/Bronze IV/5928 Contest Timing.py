D, H, M = map(int, input().split())

current = (D * 24 + H) * 60 + M
play = (11 * 24 + 11) * 60 + 11
if current - play >= 0:
    print(current - play)
else:
    print(-1)
