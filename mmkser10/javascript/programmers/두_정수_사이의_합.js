function solution(a, b) {
    if( a > b )
        return sum(a) - sum(b-1);
    else
        return sum(b) - sum(a-1);
}

function sum(number){
    return (number*(number+1))/2;
}