function solution(s) {
    if(s.charAt(0) === "-")
        return -1*Number(s.substring(1, s.length))
    else if(s.charAt(0) === "+")
        return Number(s.substring(1, s.length))
    else
        return Number(s);
}

// another sol
function anotherSolutionA(s){
    return s/1;
}