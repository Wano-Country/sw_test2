function solution(x, n) {
    var answer = [];
    for(let i = 0 ; i < n ; i++){
        answer[i] = x*(i+1);
    }
    return answer;
}

// another sol
function anotherSolutionA(x, n) {
    return Array(n).fill(x).map(((value, index) => (index+1)*value));
}