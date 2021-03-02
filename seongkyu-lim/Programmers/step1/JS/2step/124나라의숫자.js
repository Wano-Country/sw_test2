function scopeCal(a){
    // 3 , 3*3 , 3*3*3, ...
    let scope = 3
    let indices = 1;
    
    while(true){
        if (a <= scope){
            break
        }
        scope *= 3;
        indices += 1;
    }
    //  scope/3 < n <= scope
    let scope1 = 0
    if(scope != 3){
        for(let i=0; i<indices; i++){
            scope1 += scope/3;
            scope /= 3;
        }
    }else {
        scope1 = 1;
    }
    
    
    let cnt = 1;
    while(scope1 != a){
        scope1 += 1;
        cnt += 1;
    }
    return[indices, cnt]
}

function solution(n) {
    let answer = '';
    let scopeCal1 = scopeCal(n);
    let indices = scopeCal1[0]
    let cnt = scopeCal1[1]
    
    let number = 1;
    for(let i=0; i<indices; i++){
        number *= 3;
    }
    for (let i =0; i<indices; i++){
        if (cnt <= number/3){
            answer += '1';
        }else if(cnt <= (number/3)*2){
            answer += '2';
            cnt -= number/3
        }else {
            answer += '4';
            cnt -= (number/3)*2
        }
        number /= 3;
    }
    return answer;
}