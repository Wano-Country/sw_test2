from sys import stdin

num = int(stdin.readline())

locations = []
for _ in range(num):
    location = stdin.readline()
    locations.append(location)
sorted_loc = []
for i in range(num):
    for j in range(i, num):
        x1, y1 = locations[j].split()
        x2, y2 = locations[i].split()
        if int(x1) < int(x2):
            connect = locations[i]
            locations[i] = locations[j]
            locations[j] = connect
        elif int(x1) == int(x2):
            if int(y1) < int(y2):
                connect = locations[i]
                locations[i] = locations[j]
                locations[j] = connect

for val in locations:
    print(val)

# selection sort.
