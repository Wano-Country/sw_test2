

def rental(n, reserve, lost):

    rental_num = []
    count = 0
    lost_out = []

    for i in range(0, len(reserve)):
        rental_num.append(reserve[i]-1)
        rental_num.append(reserve[i]+1)

    for i in range(0, len(lost)):
        if lost[i] in reserve:
            rental_num.remove(lost[i]-1)
            rental_num.remove(lost[i]+1)
            lost_out.append(lost[i])

    for i in range(0, len(lost_out)):

        lost.remove(lost_out[i])

    for i in range(0, len(lost)):
        if lost[i] in rental_num:
            count += 1
            rental_num.remove(lost[i])
            if lost[i]+1 in reserve:
                if lost[i]+2 in rental_num:
                    rental_num.remove(lost[i]+2)
            elif lost[i]-1 in reserve:
                if lost[i]-2 in rental_num:
                    rental_num.remove(lost[i]-2)

    return ((n-len(lost)) + count)


reserve1 = [3, 4]
lost1 = [2, 4]
n1 = 5

print(rental(n1, reserve1, lost1))

# greedy algorithm 으로도 풀어보기.