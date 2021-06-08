function solution(s) {
    return Number.isInteger(+s.replace(/e/g, ' ')) && (s.length == 4 || s.length == 6);
}

// another sol
function anotherSolutionA(s){
    var result = false;
    if((s.length === 4 || s.length === 6) && /^[0-9]+$/.test(s)) {
        result = true;
    }
    return result;
}
