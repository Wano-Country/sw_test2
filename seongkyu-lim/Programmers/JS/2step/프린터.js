function solution(priorities, location) {
    var answer = 1;
    let prioritiesSort = priorities.map(el => el)
    prioritiesSort.sort((a,b) => b-a)
    
    while(true){
        if(location != 0){
            if (priorities[0] != prioritiesSort[0]){
                priorities.push(priorities[0])
                priorities.shift()
                location -= 1;
            } else {
                priorities.shift()
                prioritiesSort.shift()
                location -= 1;
                answer += 1;
            }
        }else {
            if (priorities[0] != prioritiesSort[0]){
                priorities.push(priorities[0])
                priorities.shift()
                location = priorities.length - 1;
                
            } else {
                break;
            }
        }
    }
    return answer;
}