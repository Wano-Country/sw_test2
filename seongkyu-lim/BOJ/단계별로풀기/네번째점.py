x_list = []
y_list = []
for i in range(0, 3):
    x, y = input().split()
    x_list.append(int(x))
    y_list.append(int(y))

x_list.sort()
y_list.sort()

if (x_list[0] == x_list[1]):
    print(x_list[2], end="")
else:
    print(x_list[0], end="")

print(' ', end="")

if (y_list[0] == y_list[1]):
    print(y_list[2])
else:
    print(y_list[0])
