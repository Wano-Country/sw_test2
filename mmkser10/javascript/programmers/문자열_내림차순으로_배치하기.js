function solution(s) {
    return Array.from(s).sort().reverse().join('');
}

// another sol
function anotherSolutionA(s) {
    return s
        .split("")
        .sort()
        .reverse()
        .join("");
}