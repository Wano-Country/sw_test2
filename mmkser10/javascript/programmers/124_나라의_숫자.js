function solution(n) {
    let answer = '';
    let array = new Array(4, 1, 2);

    while(n){
        ansewr = array[n % 3] + answer;
        n = Math.floor( (n - 1) / 3);
    }
    return answer;
}