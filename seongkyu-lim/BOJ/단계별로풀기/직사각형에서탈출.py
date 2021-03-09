num = input()
num_list = num.split()

distance = []

distance.append(int(num_list[2])-int(num_list[0]))
distance.append(int(num_list[0]))
distance.append(int(num_list[3])-int(num_list[1]))
distance.append(int(num_list[1]))
distance.sort()

print(distance[0])
