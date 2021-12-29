function solution(numbers) {
    let set = new Set();
    for (let i = 0; i < numbers.length - 1; i++) {
        for (let j = 1 + i; j < numbers.length; j++) {
            set.add(numbers[i] + numbers[j]);
        }
    }
    let answer = Array.from(set);
    answer.sort( (x, y) => x-y);
    return answer;
}