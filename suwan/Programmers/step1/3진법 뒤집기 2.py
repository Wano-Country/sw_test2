def solution(n):  
    answer = [] 
    while n >= 3:  
        n, b = divmod(n, 3)  
        print(n)  
        answer.append(str(b))  
    answer.append(str(n))  
    answer = int(''.join(answer), 3)  
    return answer  

