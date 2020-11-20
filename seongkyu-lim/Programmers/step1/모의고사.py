def solution(answers):
    answer = []
    solved_num = []
    a_solved = 0
    b_solved = 0
    c_solved = 0
    '''
    for i in range(len(answers)):
        if answers[i] == # answers의 인덱스+1%5:
            a_solved += 1
    
    for i in range(len(answers)):
        if # answers의 인덱스+1 이 홀수일때:
            if answers[i] == 2 :
                b_solved += 1
        else : 
            #(answers의 인덱스/2)%4 1,2,3,4 일 때 각각 1,3,4,5 랑 같은지
            #같으면 b_solved += 1
            
    for i in range(len(answers)):
        #answers의 인덱스%10 : 1,2 -> 3 , 3,4 -> 1 , 5,6 -> 2 ,7,8 -> 4 9,0 -> 5
    '''
    list1 = []
    for i in range(0, 5):
        list1 = answers.index(1)

    answer.sort()
    return answer
