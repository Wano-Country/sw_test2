function solution(d, budget) {
    var answer = 0;
    d = d.sort(function(a,b) {
        return a-b;
    })
    
    for (let value of d){
        if (value <= budget) {
            budget -= value;
            answer += 1;
        }else{break}
    }
    return answer;
}