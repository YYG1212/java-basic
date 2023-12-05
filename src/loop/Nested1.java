package loop;

public class Nested1 {
    public static void main(String[] args) {

        for (int i = 0; i < 2; i++) {
//            System.out.println("외부 for 시작 i : " + i);
            for (int j = 0; j < 3; j++) {
//                System.out.println("내부 for j : " + j);
            }
        }

        for (int i = 1; i < 10; i++) {
            for (int j = 1; j < 10; j++) {
//                System.out.println(i +" * " + j +" = " + i * j);
            }
        }

        int row = 5;

        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
