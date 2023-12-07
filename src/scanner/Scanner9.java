package scanner;

import java.util.Scanner;

public class Scanner9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("음식 이름을 입력해주세요 : ");
        String foodName = scanner.nextLine();

        System.out.print("음식의 가격을 입력해주세요 : ");
        int price = scanner.nextInt();

        System.out.print("음식의 수량을 입력해주세요 : ");
        int food = scanner.nextInt();

        int totalPrice = price * food;

        System.out.println("음식이름 : " +foodName + " 가격 : " + totalPrice);
    }
}
