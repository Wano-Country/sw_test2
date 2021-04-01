a,b = map(int, input().split())

num_list = list(map(int, input().split(" ")))

answer = 0

for i in range(0, a-2) :
    for j in range(i+1, a-1):
        for k in range(j+1, a):
            value = num_list[i]+num_list[j]+num_list[k]
            if value <= b and answer < value :
                answer = value
    


print(answer)