n = int(input())
n_num = list(map(int, input().split()))
m = int(input())
m_num = list(map(int, input().split()))

for val in m_num:
    if val in n_num:
        print(n_num.count(val), end="")
    else:
        print(0, end="")
    print(' ', end="")


# n_num.count() -> 탐색 알고리즘으로 바꾸기.
