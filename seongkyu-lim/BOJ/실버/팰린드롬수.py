



while True:
    num = input()
    if num == '0':
        break
    cnt = 0
    for i in range(0, len(num)//2):
        if num[i] == num[len(num)-1-i]:
            cnt += 1
        else:
            break  
    if cnt == len(num)//2:
        print('yes')
    else:
        print('no')
        
        
# 펠린드롬 수