function solution(x, n) {
    var answer = [];
    var c = 0;
    for(let i=0; i<n ; i++){
        c += x
        answer.push(c)
    }
    return answer;
}