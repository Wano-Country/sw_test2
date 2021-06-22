from sys import stdin

n, m = map(int, stdin.readline().split())
dictionary = {}
list1 = []
for i in range(n):
    a = stdin.readline()
    dictionary[a] = i
    list1.append(a)


for _ in range(m):
    prob = stdin.readline()

    if 65 <= ord(prob[0]) < 91:
        print(dictionary[prob]+1)
    else:
        print(list1[int(prob)-1])
