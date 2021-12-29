function solution(s) {
    let array = s.split(' ').sort( (x, y) => x - y);
    return array[0] + " " + array[array.length-1];
}

// another sol
function anotherSolutionA(s){
    let arr = s.split(' ');
    return Math.min(...arr) + ' ' + Math.max(...arr);
}