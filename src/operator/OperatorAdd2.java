package operator;

public class OperatorAdd2 {
    public static void main(String[] args) {
        int a = 1;
        int b = 0;

        b = ++a;
        System.out.println("a = " + a + ", b = " + b);

        a = 1;
        b = 0;

        b = a++;
        System.out.println("a = " + a + ", b = " + b);

        int num1 = 10;
        int num2 = 20;
        int num3 = 30;

        int sum = num1 + num2 + num3;
        System.out.println(sum);

        int average = sum / 3;
        System.out.println(average);


    }
}
