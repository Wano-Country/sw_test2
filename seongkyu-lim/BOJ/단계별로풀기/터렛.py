
num = int(input())
solution = []

for i in range(0, num):
    nums = input()
    num_list = nums.split()

    for i in range(0, len(num_list)):
        num_list[i] = int(num_list[i])

    length = ((num_list[0] - num_list[3])**2 +
              (num_list[1] - num_list[4])**2)**0.5

    if length >= num_list[2] and length >= num_list[5]:
        if length < num_list[2] + num_list[5]:
            solution.append(2)
        elif length > num_list[2] + num_list[5]:
            solution.append(0)
        else:
            solution.append(1)
    else:
        if length == 0 and num_list[2] == num_list[5]:
            solution.append(-1)
        elif length + min(num_list[2], num_list[5]) < max(num_list[2], num_list[5]):
            solution.append(0)
        elif length + min(num_list[2], num_list[5]) > max(num_list[2], num_list[5]):
            solution.append(2)
        else:
            solution.append(1)

for i in solution:
    print(i)
