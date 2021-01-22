function solution(strings, n) {
    var answer = [];
    answer = strings.sort();
    var answer2 = answer.sort((a,b) => {
        if (a[n]>b[n]) return 1;
        if (a[n]<b[n]) return -1;
        if (a[n]===b[n]) return 0;
    });
    return answer2;
}