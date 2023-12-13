package Method;

public class Overloading2 {
    public static void main(String[] args) {
        System.out.println("1 : " + add(1,2.2));
        System.out.println("2 : " + add(1.1,2));
    }

    public static int add(int a, double b){
        System.out.println("1번 호출");
        return a + (int)b;
    }
    public static int add(double a, int b){
        System.out.println("2번 호출");
        return (int)a + b;
    }
}
