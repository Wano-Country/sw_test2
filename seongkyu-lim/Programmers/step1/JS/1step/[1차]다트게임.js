function solution(dartResult) {
    var answer = 0;
    let points = [];
    let point = 0;
    let cnt = 0;
    
    for (let i=0;i<dartResult.length;i++){
        if (48<= dartResult.charCodeAt(i) && dartResult.charCodeAt(i)<=57){
            if(dartResult[i+1] == "S"){
                point += Number(dartResult[i]);
            }else if(dartResult[i+1] == "D"){
                point += Number(dartResult[i])**2;
            }else if(dartResult[i+1] == "T"){
                point += Number(dartResult[i])**3;
            }
            if(dartResult[i+2] == "*"){
                if ( i != 0){
                    point *=2;
                    points[cnt-1] = points[cnt-1]*2
                }else {
                    point *=2;
                }
            }else if(dartResult[i+2] =="#"){
                point *= -1;
            }
            points.push(point)
            point = 0
            cnt += 1;
            console.log(points)
        }
    }
    for (let value of points){
        answer += value;
    }
    return answer;
}

// 10인경우 케이스 추가하기.