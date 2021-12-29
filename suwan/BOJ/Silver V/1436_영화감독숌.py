N = int(input())
values = []
for i in range(3000000):
    if '666' in str(i):
        values.append(i)
values = sorted(values)
print(values[N-1])