time_list = []
user_num = int(input())
for i in range(user_num):
    time = input()
    time_list.append(time)

final_time = time_list[0]

for i in range(1, len(time_list)):

    time = time_list[i]

    if int(final_time[8:10]) < int(time[0:2]):
        final_time = '-1'
        break
    elif int(final_time[8:10]) == int(time[0:2]):
        if int(final_time[11:13]) <= int(time[3:5]):
            final_time = '-1'
            break
    elif int(time[8:10]) < int(final_time[0:2]):
        final_time = '-1'
        break
    elif int(time[8:10]) == int(final_time[0:2]):
        if int(time[11:13]) <= int(final_time[3:5]):
            final_time = '-1'
            break

    else:
        if int(final_time[0:2]) < int(time[0:2]):
            final_time = time[0:5] + final_time[5:]
        elif int(final_time[0:2]) == int(time[0:2]):
            if int(final_time[3:5]) < int(time[3:5]):
                final_time = time[0:5] + final_time[5:]

        if int(final_time[8:10]) > int(time[8:10]):
            final_time = final_time[:8] + time[8:]
        elif int(final_time[8:10]) == int(time[8:10]):
            if int(final_time[11:13]) > int(time[11:13]):
                final_time = final_time[:8] + time[8:]

print(final_time)
