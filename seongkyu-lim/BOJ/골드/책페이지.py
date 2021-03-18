n = input()

num_list = [0]*10


def cal(x):
    n_length = len(x)
    result = 0
    cnt = 1
    for i in range(1, n_length+1):
        if n_length-i-1 > 0:
            for _ in range(n_length-i-1):
                cnt*10
        if n_length - i > 0:
            cnt *= int(n[0])
        result += cnt
        cnt = 1
    return result


if int(n) < 10:
    for i in range(1, int(n)+1):
        num_list[i] += 1
else:
    for i in range(0, 10):
        num_list[i] = cal(n)
print(num_list)
