package 검증수;

import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        int[] num = new int[5];
        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        for (int i = 0 ; i<5 ; i++) {
            int num1 = scanner.nextInt();
            sum += Math.pow(num1,2);
        }

        System.out.println(sum%10);
    }

}
