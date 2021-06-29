from sys import stdin

n, m = map(int, stdin.readline().split())
dictionary = {}
list1 = []
for i in range(n):
    a = stdin.readline().strip()
    dictionary[a] = i
    list1.append(a)

for _ in range(m):
    prob = stdin.readline().strip()
    if 65 <= ord(prob[0]) < 91:
        print(dictionary[prob]+1)
    else:
        print(list1[int(prob)-1])

# 개행문자까지 입력받아진다.
# .strip()으로 개행문자 제거.
