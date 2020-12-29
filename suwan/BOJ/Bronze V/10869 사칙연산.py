A, B = map(int, input().split())
ops = ['+', '-', '*', '//', '%']
for op in ops:
    print(eval(f'A{op}B'))