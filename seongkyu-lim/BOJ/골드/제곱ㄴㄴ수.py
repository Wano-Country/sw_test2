import sys
minimum, maximum = map(int, sys.stdin.readline().split())


def prime_list(a, n):
    cnt = n-(a-1)
    sieve = [True]*(n-(a-1))

    m = int(n**0.5)
    for i in range(2, m+1):
        i = i*i
        new_i = i
        while i < a:
            i += new_i
        if i-a+1 <= n-(a-1):
            if sieve[i-a] == True:
                sieve[i-a] = False
                cnt -= 1
                i += new_i
                while i <= n:
                    sieve[i-a] = False
                    i += new_i
                    cnt -= 1
    return cnt


print(prime_list(minimum, maximum))


# time error
