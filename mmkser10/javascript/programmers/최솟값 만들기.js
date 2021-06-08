function solution(A,B){
    let answer = 0;
    A.sort( (x, y) => x - y)
    B.sort( (x, y) => y - x)
    for(let i = 0 ; i < A.length ; i++){
        answer += A[i]*B[i];
    }
    return answer;
}

// another sol
function anotherSolutionA(A,B){
    A.sort( (x, y) => x - y)
    B.sort( (x, y) => y - x)
    return A.reduce( (total, val, index) => total + val * B[index], 0)
}