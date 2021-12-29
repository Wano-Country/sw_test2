function solution(numbers, hand) {
    let answer = '';
    let left = [3, 0];
    let right = [3, 2];
    for(let i = 0 ; i < numbers.length ; i++) {
        let number = numbers[i] === 0 ? 11 : numbers[i];
        let inputNumber = parseInt(number/3);
        if (number % 3 === 1) {
            answer += 'L';
            left[0] = inputNumber;
            left[1] = 0;
        } else if (number % 3 === 0) {
            answer += 'R';
            right[0] = inputNumber-1;
            right[1] = 2;
        } else {
            let leftIndex = Math.abs(left[0]-inputNumber)+Math.abs(left[1]-1);
            let rightIndex = Math.abs(right[0]-inputNumber)+Math.abs(right[1]-1);
            if(leftIndex < rightIndex){
                answer += 'L';
                left[0] = inputNumber;
                left[1] = 1;
            }
            else if(leftIndex > rightIndex){
                answer += 'R';
                right[0] = inputNumber;
                right[1] = 1;
            }
            else{
                if(hand === 'right'){
                    answer += 'R';
                    right[0] = inputNumber;
                    right[1] = 1;
                }
                else{
                    answer += 'L';
                    left[0] = inputNumber;
                    left[1] = 1;
                }
            }
        }
    }
    return answer;
}