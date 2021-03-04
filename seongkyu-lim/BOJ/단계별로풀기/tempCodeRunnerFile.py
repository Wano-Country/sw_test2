
n = int(input())
list1 = []
for i in range(0, n):
    a = int(input())
    list1.append(a)


def primeNumber(n):
    a = [False, False] + [True]*(n-1)
    primes = []

    for i in range(2, n+1):
        if a[i]:
            primes.append(i)
            for j in range(2*i, n+1, i):
                a[j] = False
    return primes


for i in list1:
    list2 = primeNumber(i)
    for j in range(int(len(list2)/2), len(list2)):
        if i-list2[j] in list2:
            print(i-list2[j], end="")
            print(' ', end="")
            print(list2[j])
            break
