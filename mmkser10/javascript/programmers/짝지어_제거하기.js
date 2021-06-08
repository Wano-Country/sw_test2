function solution(s)
{
    let array = [];
    for(let i = 0 ; i < s.length ; i++){
        let char = s.charAt(i);
        if(array.length === 0)
            array.push(char);
        else{
            if(array[array.length-1] === char)
                array.pop();
            else
                array.push(char);
        }
    }
    return array.length === 0 ? 1 : 0;
}