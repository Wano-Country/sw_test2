function solution(absolutes, signs) {
    return absolutes.reduce( (acc, cur, i) => acc + (cur * signs[i] === 1 ? 1 : 0))
}

//another sol
function anotherSolutionA(absolutes, signs) {
    let answer = 0;
    absolutes.forEach((value, index) => {
        if (signs[index]) {
            answer += value;
        } else {
            answer -= value;
        }
    })
    return answer;
}