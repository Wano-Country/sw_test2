prices = [float(input()) * 0.800 for _ in range(int(input()))]
#
for p in prices:
    p = round(p, 2)
    p = str(p)
    if p[-2:-1] == '.':
        p += '0'

    print("$" + p)