function solution(a, b) {
    var answer = 1234567890;
    var sum = 0;
    
    for (let i=0;i<a.length;i++){
        sum += a[i]*b[i];
    };
    return sum;
}