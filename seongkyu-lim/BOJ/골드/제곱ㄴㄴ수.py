import sys
minN, maxN = map(int, sys.stdin.readline().split())


def prime_list(mi, ma):
    cnt = ma-(mi-1)
    sieve = [True]*(ma-(mi-1))
    sqr = 2
    while sqr**2 <= ma:
        i = sqr**2
        if (mi % i) != 0:
            i = (int(mi/i)+1)*i
        else:
            i = mi
        if i-mi+1 <= ma-(mi-1):  # i의 순서가 전체 구간의 길이보다 작거나 같은지,
            while i <= ma:
                if sieve[i-mi] == True:
                    sieve[i-mi] = False
                    cnt -= 1
                i += sqr**2
        sqr += 1
    return cnt


print(prime_list(minN, maxN))


# 에라토스테네스의 체
