function solution(n, m) {
    var answer = [];
    if (Math.max(n,m) == n){
        let a = n
        let b = m
        let c;
        while (a % b !=0){
            c = a%b
            a = b
            b = c
        }
        answer.push(b)
        answer.push(n*m/b)
    }
    else if(Math.max(n,m) == m){
        let a = m
        let b = n
        let c;
        while (a % b !=0){
            c = a%b
            a = b
            b = c
        }
        answer.push(b)
        answer.push(n*m/b)
    }
    return answer;
}