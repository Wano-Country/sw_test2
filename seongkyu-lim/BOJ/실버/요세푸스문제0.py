from sys import stdin

n, k = map(int, stdin.readline().split())

people = [i for i in range(1, n+1)]
solution = []
i = 0
while len(people) != 0:
    i += k-1
    if i > len(people)-1:
        while i > len(people)-1:
            i = i - len(people)
        solution.append(people[i])
        del people[i]
    else:
        solution.append(people[i])
        del people[i]

print("<", end="")
for i in range(len(solution)):
    print(solution[i], end="")
    if i is not len(solution)-1:
        print(", ", end="")
print(">")
