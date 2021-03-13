class Solution {

    public int answer;

    public void isPrime(int number){
        int N = 10000000;
        boolean[] prime = new boolean[N+1];
        prime[0] = prime[1] = false;

        for(int i=2; i<=N ; i+=1) {
            prime[i] = true;
        }

        for(int j = 2 ; j * j <= N ; j++){
            if(!prime[j]) continue;
            for(int z = j * j ; z <= N ; z += j)
                prime[z] = false;
        }

        if(prime[number]){
            answer++;
        }
    }


    public void findPrime(int[] arr, int depth, int n, int r) {
        if (depth == r) {
            int number = 0;
            for(int z = 0 ; z < arr.length ; z++){
                number += Math.pow(arr[z], arr.length-z-1);
            }
            System.out.println(number);
            isPrime(number);
            return;
        }
        for (int i = depth ; i < n ; i++) {
            swap(arr, depth, i);
            findPrime(arr, depth + 1, n, r);
            swap(arr, depth, i);
        }
    }

    public static void swap(int[] arr, int depth, int i) {
        int temp = arr[depth];
        arr[depth] = arr[i];
        arr[i] = temp;
    }

    public int solution(String numbers) {
        int[] arr = new int[numbers.length()];
        for(int x = 0 ; x < arr.length ; x++){
            arr[x] = Integer.parseInt(numbers.substring(x, x+1));
        }
        answer = 0;

        for(int q = 0 ; q < arr.length ; q++) {
            findPrime(arr, 0, arr.length, q+1);
        }

        return answer;
    }
}