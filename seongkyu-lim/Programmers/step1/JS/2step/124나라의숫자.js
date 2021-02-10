function scopeCal(a){
    // 3 , 3*3 , 3*3*3, ...
    let scope = 3
    let indices = 0;
    
    while(true){
        if (n <= scope){
            break
        }
        scope *= 3;
        indices += 1;
    }
    //  scope/3 < n <= scope
    let scope1 = scope/3 + 1
    let cnt = 0;
    while(scope1 != n){
        scope1 += 1;
        cnt += 1;
    }
    return(indices, cnt)
}

function solution(n) {
    let answer = '';
    let indices, cnt = scopeCal(n);
    for (let i =0; i<cnt ; i++){
        
    }
    
    return answer;
}