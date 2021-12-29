function solution(n) {
    var answer = 0;
    let n_3 = n.toString(3);
    var temp = n_3.split('');
    n_3 = temp.reverse().join('');
    answer = Number(parseInt(n_3, 3).toString(10))
    return answer;
}