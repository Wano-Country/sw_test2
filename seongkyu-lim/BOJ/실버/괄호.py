#괄호

num = int(input())

for i in range(num):
    check_list = list(map(str, input()))
    
    cnt =0
    for i in range(0,len(check_list)) :
        if cnt < 0 :
            break
        if check_list[i] == '(':
            cnt +=1
        elif check_list[i] ==')':
            cnt -=1
    if cnt == 0 :
        print('YES')
    else :
        print('NO')
            