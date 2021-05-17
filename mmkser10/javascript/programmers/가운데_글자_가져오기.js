function solution(s) {
    return s.length%2 === 0 ? s.slice(s.length/2-1, s.length/2+1) : s.slice(parseInt(s.length/2), parseInt(s.length/2)+1);
}

// another sol
function anotherSolutionA(s) {
    return s.substring(Math.ceil(s.length/2) - 1, Math.floor(s.length/2) + 1)
}