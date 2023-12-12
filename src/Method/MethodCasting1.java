package Method;

public class MethodCasting1 {
    public static void main(String[] args) {
        int number = 100;
//        printNumber((int)number);
        printNumber(number);
    }
    public static void printNumber(double n){
        System.out.println("숫자 : " + n);
    }
}
