
x = int(input())

n = 1
cnt = 1
while x > n:
    n = n + (cnt+1)
    cnt += 1

loc = x-(n-cnt)

if cnt % 2 == 0:
    son = 1
    mom = cnt
    for i in range(1, loc):
        son += 1
        mom -= 1
else:
    son = cnt
    mom = 1
    for i in range(1, loc):
        son -= 1
        mom += 1
print(son, end="")
print('/', end="")
print(mom)
