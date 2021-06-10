function solution(s) {
    let zero_cnt = 0
    let count = 0;
    while(1){
        zero_cnt += (s.match(/0/g) === null ? 0 : s.match(/0/g).length);
        s = (s.length - s.match(/0/g) === null ? 0 : s.match(/0/g).length).toString(2);
        count++;
        console.log(s, zero_cnt);
        if(s.length === 1)
            break
    }
    return [count, zero_cnt];
}
//
// function solution(s) {
//     let count = 0;
//     let zero_cnt = 0
//     while(1) {
//         zero_cnt += (s.match(/0/g) === null ? 0 : s.match(/0/g).length);
//         s = (s.length-zero_cnt).toString(2);
//         count++;
//         console.log(count, zero_cnt);
//         if(s.length === 1)
//             break;
//     }
// }