package array;

import java.util.Scanner;

public class ArrayEx6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int[] numbers = new int[n];
        int min, max;

        System.out.println(n + "개의 정수를 입력하세요 : ");
        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
        }

        min = numbers[0];
        max = numbers[0];
        for (int i = 1; i < n; i++) {
            if(numbers[i] < min){
                min = numbers[i];
            }
            if(numbers[i] > max){
                max = numbers[i];
            }
        }

        System.out.println(min);
        System.out.println(max);
    }
}
