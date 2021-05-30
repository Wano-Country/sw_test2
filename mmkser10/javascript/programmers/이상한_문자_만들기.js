function solution(s) {
    let lower = s.toLowerCase().split(" ");
    let upper = s.toUpperCase().split(" ");
    var answer = "";
    for(let i = 0 ; i < lower.length ; i++) {
        for(let j = 0 ; j < lower[i].length ; j++){
            j%2 === 0 ? answer = answer + upper[i].charAt(j) : answer = answer + lower[i].charAt(j);
        }
        if(i !== lower.length-1)
            answer = answer + " ";
    }
    return answer;
}

// another sol
function anotherSolutionA(s) {
    return s.split(" ").map(i => i.split('').map((j, key) => key % 2 === 0 ? j.toUpperCase() : j).join(' ')).join(' ')
}