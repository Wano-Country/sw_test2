from sys import stdin

num = int(stdin.readline())


# selection sort. -> time error
'''
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
'''
# merge sort -> time error
'''
def merge(left_list, right_list):
    result = []
    while len(left_list) > 0 or len(right_list) > 0:
        if len(left_list) > 0 and len(right_list) > 0:
            x1, y1 = left_list[0].split()
            x2, y2 = right_list[0].split()
            if int(x1) < int(x2):
                result.append(left_list[0])
                left_list = left_list[1:]
            elif int(x1) == int(x2):
                if y1 < y2:
                    result.append(left_list[0])
                    left_list = left_list[1:]
                else:
                    result.append(right_list[0])
                    right_list = right_list[1:]
            else:
                result.append(right_list[0])
                right_list = right_list[1:]
        elif len(left_list) > 0:
            result.append(left_list[0])
            left_list = left_list[1:]
        elif len(right_list) > 0:
            result.append(right_list[0])
            right_list = right_list[1:]
    return result


def merge_sort(list):
    if len(list) <= 1:
        return list
    mid = len(list)//2
    left_list = list[:mid]
    right_list = list[mid:]
    left_list = merge_sort(left_list)
    right_list = merge_sort(right_list)
    return merge(left_list, right_list)


locations = []
for _ in range(num):
    location = stdin.readline()
    locations.append(location)

locations = merge_sort(locations)

for i in range(num):
    print(locations[i])
'''
# sort method (nlogn)
nums = []
for _ in range(num):
    [a, b] = map(int, stdin.readline().split())
    nums.append([a, b])

nums.sort()

for i in range(num):
    print(nums[i][0], nums[i][1])


# merge sort는 왜안되 ?
