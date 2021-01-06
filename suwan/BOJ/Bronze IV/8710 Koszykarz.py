k, w, m = map(int, input().split())
cnt = 0
if (w-k) % m:
    print((w-k)//m+1)
else:
    print((w-k)//m)
