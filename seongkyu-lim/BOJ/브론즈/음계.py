from sys import stdin

nums = stdin.readline()

num_list = list(map(int, nums.split()))
solution = ''
for i in range(len(num_list)-1):
    if num_list[i] == num_list[i+1] + 1:
        solution = 'descending'
    elif num_list[i] == num_list[i+1] - 1:
        solution = 'ascending'
    else:
        solution = 'mixed'
        break

print(solution)
